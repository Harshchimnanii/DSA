public class sizeofarraybyindices {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(findsize(arr));
    }

    static int findsize(int[] arr) {
        int start = 0 ;
        int end = arr.length-1;
        int size = end -start + 1;
        return size;
        
    }
}
