public class maxinarray {
    public static void main(String[] args) {
        int[] arr = {12 , 32 , 43 , 123 , 1234 , 2349};
        System.out.println(maximumitem(arr));
    }
    static int maximumitem(int[] arr){
        int max = 0;
        for(int i = 0 ;i< arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
