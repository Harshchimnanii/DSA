import java.util.Arrays;

public class BSinsortedmatrix {
    public static void main(String[] args) {
        int [] [] nums = {
            { 1,2  ,3 ,4 } ,
            { 5, 6 ,7 ,8 } ,
            {9 , 10 ,11 ,12} ,
            {13 ,14,15,16 }           
        };
        int target = 2;
        System.out.println(Arrays.toString(BSin2Dsortedarray(nums , target)));

    }
    static int[] BSin2Dsortedarray(int arr[][] , int target){
        // int r = 0;
        // int c = arr.length-1;
        // while(r<arr.length && c >= 0){
        //     if(arr[r][c]==target){
        //         return new int[] {r , c};
        //     }
        //     else if(arr[r][c]< target){
        //         r++;
        //     }
        //     else if(arr[r][c] > target) {
        //         c--;
        //     }

        // }



        // Method 2
        int r = arr.length-1;
        int c = arr[0].length-1;
        while(r<arr.length-1 && r>=0 && c<arr[0].length-1 && c>=0 ) {
            int element = arr[r][c];
            if(element == 0){
                return new int []{r , c};
            }
            else if(element < target){
                r++;
            }
            else if(element > target){
                r--;
            }
            else{

            }

        }
        return new int[] {-1 , -1};

    }
    static int[] search(int [][] arr , int r , int c){
        int start = r;
        int end =  c;


        while(start<end)
    }
}
