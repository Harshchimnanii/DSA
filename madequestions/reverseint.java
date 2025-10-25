package madequestions;
import java.util.*;
public class reverseint {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int reversed_num = 0;
    for(int i = 0 ; n>0 ; i++){
        int mod = n %10;
        reversed_num= reversed_num*10+mod;
        n = n/10;
    }
    System.out.println(reversed_num);
}
//  for clean code use while loop in this 
    }
