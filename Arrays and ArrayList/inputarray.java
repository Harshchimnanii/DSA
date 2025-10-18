import java.util.Arrays;
import java.util.Scanner;

public class inputarray {
    public static void main(String[] args) {
        // array of primitives
       
        Scanner sc  = new Scanner(System.in);
        // int[] arr = new int[5];
        // for (int i = 0; i < arr.length; i++) {
            
        //     arr[i] = sc.nextInt();
        // }
        // for (int element : arr) {
        //     System.out.print(element + " ");
        // }
        // another method to print an array by using method
        // System.out.println(Arrays.toString(arr));

        
        
        // array of objects
        String [] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
        str[2] = "Kunal";
        System.out.println(Arrays.toString(str));

    }

}
