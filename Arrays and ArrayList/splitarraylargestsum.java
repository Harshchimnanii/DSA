public class splitarraylargestsum {
    public static void main(String[] args) {
        int [] arr = { 7 , 5 , 2 , 10 , 8};
        int result = splitarray(arr, 2);
        System.out.println(result);
    }
    static Boolean cansplit(int arr[] , int gpieces , int maxsum){
        int sum = 0;
        int pieces = 1;
        for(int i = 0 ; i<arr.length ; i++){

            if(sum+arr[i]<=maxsum){
                sum+=arr[i];
            }
            else{
                sum = arr[i];
                pieces++;
            }
        }
        return pieces<=gpieces;
    }
    static int splitarray(int[] arr , int gpieces){
        int start = 0;
        int end = 0;
        for(int i = 0 ; i < arr.length ; i++){
            end+=arr[i];
            if(arr[i]>start){
                start = arr[i];
            }
        }
        while(start<end){
            // try for the potential ans 
            int mid = start + (end- start)/2;
            
            if(cansplit(arr, gpieces, mid)){
                end = mid ;
            }
            else{
                start = mid + 1;
            }
        }
        return end;
    }
}
