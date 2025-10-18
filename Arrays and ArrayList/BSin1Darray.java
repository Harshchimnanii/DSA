import java.util.*;
import java.math.*;
public class BSin1Darray {
    /*Time complexity 
     * best case = O(1);
     * Worstcase = O(log N)
     */
    public static void main(String[] args) { 
        int arr[] = {-4 , -3 , -2 , 0 ,1 , 2 , 11 , 13 , 16 , 19 , 22 , 26 , 90 , 111};
        int target = 22 ;
        int result = searching(arr, target);
        System.out.println("The Target : " + target +" is present at : " +result+"th index.");
        
    }
    // return the index 
    static int searching(int[]arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target>arr[mid]){
                start = mid + 1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else if(target == arr[mid]){
                return mid;
            }
        }
        return -1;
        
    }
    
}
