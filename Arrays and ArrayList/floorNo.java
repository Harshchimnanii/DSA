public class floorNo {
    public static void main(String[] args) {
        int [] nums  = {2 , 3 , 5 , 9 , 14 , 16 , 18};
        int target = 10;

        int result = floor(nums, target);
        System.out.println(result);
    }
    static int floor(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int result = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == nums[mid]){
                return nums[mid];
            }
            if(target<nums[mid]){
                end = mid-1;
                result = mid;
            }
            if(target>nums[mid]){
                start = mid + 1;
            }
        }
        return nums[end];
    }
}
