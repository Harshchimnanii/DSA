import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(isprime(n));
        // System.out.println(issprime(n));
        System.out.println(armstrongno(n));
        for(int i = 100 ; i<1000; i++){
            if(armstrongno(i)){
                System.out.println(i);
            }
        }

    }
    // using for loop
    static boolean isprime(int n){
        if(n==1 || n ==2){
            return true;
        }
        for(int i = 2 ; i<=(n/2)-1 ; i++ ){
            if(n%i == 0){
                
                return false;
            }
        }
        return false;
    }
    // using while loop
    static boolean issprime(int n){
        if(n==1 || n == 2){
            return true;
        }
        int i = 2 ;
        while(i*i<=n){
            if(n%i == 0){
                return false;
            }
            i++;
        }
        return i*i>n;
    }
    static boolean armstrongno(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            n /= 10;
            sum += rem*rem*rem;
        }
        if(sum == original){
            return true;
        }
        return false;
    }

    }
