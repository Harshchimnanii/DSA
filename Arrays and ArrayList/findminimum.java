public class findminimum {
    public static void main(String[] args) {
        int[] nums = {18 , 12, 13, -1, 16, 9};
        System.out.println(findmin(nums));
    }
    static int findmin(int [] arr){
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;

    }
}
