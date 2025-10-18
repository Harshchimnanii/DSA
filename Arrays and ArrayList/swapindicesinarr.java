import java.util.Arrays;

public class swapindicesinarr {
    public static void main(String[] args) {
        int [] arr = {1 , 2 , 3 , 4 , 5 };
        // swap(arr , 0 , 4);
        // swap(arr , 1 , 3);
        // swap(arr , 2 , 2);
        // swap(arr , 0 , 4);
        reverse(arr, 0, 4);
        
    }
    static void reverse(int[] arr ,int start, int  end){
       for(int i = 0 ; i<arr.length/2 ; i++){
        swap(arr, start, end);
        start++ ;
        end--;
       }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr ,int index1, int  index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        // System.out.println(Arrays.toString(arr));
    }
}
