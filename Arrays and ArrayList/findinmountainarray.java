public class findinmountainarray {
    // https://leetcode.com/problems/find-in-mountain-array/description/
    public static void main(String[] args) {
        int arr [] = {1 , 2 ,3 ,5, 6, 4 ,3  ,1 };
        int target = 4;
        int result = search(target, arr);
        System.out.println(result);
    }
    static int search (int target , int arr[]){
        int end = peakIndexInMountainArray(arr);
        int firsttry = orderagnostic(arr, target, target, end);
        if(firsttry != -1){
            return firsttry;
        }
        return orderagnostic(arr, target , end , arr.length-1);

    }
    static int orderagnostic(int[] arr, int target , int start , int end ) {
        // to find the arr is sorted in asc or dsc
        Boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }if(isAsc){
                if(target<arr[mid]){
                end = mid-1;
                }
                else if(target>arr[mid]){
                    start = mid + 1;
                }
            }
            else{
                if(target>arr[mid]){
                end = mid-1;
                }
                else if(target<arr[mid]){
                    start = mid + 1;
                }
            }
            
        }
        return -1;
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid+1]<arr[mid]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }
}
