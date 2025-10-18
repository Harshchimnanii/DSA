import java.util.*;
public class basiccalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("THE ANS IS : ");
        while (true) {
            int ans = 0;
            System.out.print("ENTER THE OPERAND : ");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("ENTER NUM1 : ");
                int num1 = sc.nextInt();
                System.out.print("ENTER NUM2 : ");
                int num2 = sc.nextInt();
            
            if(op == '+'){
                ans  = num1 + num2;
            }
            if(op == '-'){
                ans  = num1 - num2;
            }
            if(op == '/'){
                if(num2 != 0){
                ans  = num1 / num2;
            }
            }
            if(op == '*'){
                ans  = num1 * num2;
            }
            if(op == '%'){
                ans  = num1 % num2;
            }
            else{
                System.out.println("enter a valid operand");
            }
            
        }
        else if(op == 'x' || op == 'X'){
            break;
        }
        System.out.println(ans);
    }
    }
}
