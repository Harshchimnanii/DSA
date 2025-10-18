public class Findrotationcount {
    public static void main(String[] args) {
        int arr[] = {15 , 18 , 2 , 3 , 6 ,12};
        System.out.println(findpivotwithduplicates(arr)+1);
    }
    static int findpivotwithduplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid; 
            } 
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if(arr[mid] == arr [start] && arr[mid] == arr[end]){
                if(arr[start] > arr[start+1]){
                    return start;
                }
                else if(arr[end]<arr[end-1]){
                    return end-1;
                }
                else{
                    start++;
                    end--;
                }
            }
          else if(arr[start]<= arr[mid] && arr[end]>arr[mid]) {
              start = mid+1;
          } 
          else{
              end = mid -1;
          }
        }
        return -1;
    }
}
