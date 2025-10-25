package madequestions;
import java.util.*;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = largestnum(a, b, c);
        System.out.println(result);
    }
    static int largestnum(int a , int b , int c ){
        int max = a ;
        if(max<b){
            max = b;
        }
        if (max < c){
            max = c;
        }
        // another tareeka 
        max = Math.max(c,Math.max(a, b));
        // result driven by this 
        return max;
    }
    
}
