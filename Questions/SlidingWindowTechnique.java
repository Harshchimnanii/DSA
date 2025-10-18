public class SlidingWindowTechnique{
    public static void main(String[] args) {
        
    }
    static int maxsuminasubarray(int []nums , int k){
        int Maxsum = 0;
        int windowsum = 0;
        for(int i = 0 ; i<nums.length; i++){
            windowsum += nums[i];
        }
        
        return Maxsum;
    }
}