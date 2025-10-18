import java.util.Scanner;

public class searchinrange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = {18 , 12 , -7 , 3 ,  14 , 28};
        int result = searching(nums , 1 , 4);
        System.out.println(result);
    }
    static int searching(int[] arr , int start , int end){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to search : ");
        int n = in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(n == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
 