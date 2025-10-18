public class findNuminInfiniteArray {
    public static void main(String[] args) {
        int arr[] = {3 ,5 , 7 , 9 , 10 ,90 ,100 ,130 ,140 , 160 , 170};
        int target = 10;
        // int result = searchInfinitearray(arr , target, start, end);
        System.out.println(findingRange(arr, target));
    }
    static int findingRange(int[] nums , int target ){
        int start = 0;
        int end = 1;
        while(target>nums[end]){
            int temp = end+1;
            end = end + ((end-start + 1)*2);
            start = temp;
        
        }
        return serching(nums, target, start, end);
    }

    static int serching(int[]arr , int target , int start , int end ){
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
