public class PeakElementInAMountainArray {
    public static void main(String[] args) {
        int [] arr = {3 , 4 , 5 , 0 , 1 , 2};
        peakIndexInMountainArray(arr);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        // finding pivot
        int start = 0;
        int end = arr.length-1;
      
        while(start<end){
            int mid = start + (end-start)/2;
              // case 1
            if(arr[mid+1]<arr[mid]){
                end = mid;
            }
              // case 2
            else{
                start = mid +1;
            }
            // // case 3
            // if(arr[start]<arr[mid]){
            //     start = mid+1;
            // }


    }
    return arr[end];
    }
}

