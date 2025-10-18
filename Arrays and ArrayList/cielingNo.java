public class cielingNo{
    // find the smallest elemnt in an array which is greater or equal to the target lement
    public static void main(String[] args) {
        int [] nums  = {2 , 3 , 5 , 9 , 14 , 16 , 18};
        int target = 10;

        int result = cieling(nums , target);
        System.out.println(result);
    }

    static int cieling(int[] nums, int target) {
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
        return nums[start];
    }
}
/*
 *    int start = 0;
        int end = letters.length-1;
        int result = 0;
        while(start<end){
            int mid = start+((end-start)/2);
            if(target<letters[mid]){
                end = mid-1;
                result = start;
            }
            if(target>letters[mid]){
                start = mid+1;
            }
            if(target == letters[mid]){
                return letters[mid+1];
            }
        }
        return letters[result];
    }
 */