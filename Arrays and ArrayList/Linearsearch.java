import java.util.Scanner;

public class Linearsearch {
    /*Time complexity
     * best case(O(1)) = when element is found at the first place
     * Worst case (O(n)) : when element is not found in entire array
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int [5];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter the num " + i + " : ");;
            nums[i] = in.nextInt();
        }
        Boolean result = search(nums);
        System.out.println(result);
        System.out.println(searching(nums));
    }
    // no is present or not
    static boolean search(int[] arr){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to search : ");
        int n = in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(n == arr[i]){
                return true;
            }
        }
        return false;
    }
    static int searching(int[] arr){
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
