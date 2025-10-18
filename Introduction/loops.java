import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // use for loop when you know th no of times the loop will rum
        //  Q1: print number from 1 to n using for loop
        for(int i = 1 ; i<=n ; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        // use wile loop when you dont know how many times the loop will run 
        //  Q1: print number from 1 to n using while loop
        int i = 1;
        // while(i<=n){
        //     System.out.print(i + " ");
        //     i++;
        // }
        //  Q1: print number from 1 to n using do-while loop
        do{
            System.out.print(i + " ");
            i++;
        }while(i<=n);

    }
}
