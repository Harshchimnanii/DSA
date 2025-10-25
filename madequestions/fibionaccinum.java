package madequestions;
import java.util.Scanner;
public class fibionaccinum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        if(n == 1){
            System.out.println(a);
        }
        if(n == 2){
            System.out.println(a);
            System.out.println(b);
        }
        if(n >= 3){
            for(int i = 0; i<n; i++){
                System.out.println(a);
                c = a+b;
                a = b;
                b = c;

            }
        }
    }

    static int[] fibioSeries(int n) {
        int a = 0;
        int b = 1;
        int c ;
        int arr[] = {};
        for(int i = 0 ; i<=n ; i++){
           
        }
    }
}
