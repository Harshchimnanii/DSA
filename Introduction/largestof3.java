import java.util.Scanner;
public class largestof3 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        // int max = n1 ;
        // if(n2>max){
        //     max = n2 ;
        // }
        // if(n3>max){
        //     max = n3;
        // }

        
        // Another method to solve 
        int max = Math.max(n1 ,Math.max(n2, n3));
        System.out.println(max);
        
    }
}
