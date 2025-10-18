import java.util.Arrays;
import java.util.Scanner;

public class multidimensionalarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
                System.out.print(Arrays.toString(arr[i]));
            System.out.println();
        }
        for (int[] element : arr) {
                System.out.print(Arrays.toString(element));
            System.out.println();
        }

    }
}
