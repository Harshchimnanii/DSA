public class orderagnosticbinarysearch {
    public static void main(String[] args) {
                 //  {0     1    2   3     4  5   6   7}
        int[] nums = {0   ,  1,    2,   3,     4,  5,   6,   7};
        // {90 , 75 , 18 , 12 , 6 , 4 , 3 , 1};
        int target = 1;
        int result = orderagnostic(nums, target);
        System.out.println(result);
    }
    static int orderagnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
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
}
