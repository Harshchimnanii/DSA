public class findthesmallestgreaterthantarget {
    // https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
    public static void main(String[] args) {
        char [] arr = {'a' , 'b' , 'c' , 'f'};
        char target= 'f';
        System.out.println(nextGreatestLetter(arr, target));
        
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(letters[mid]<=target){
                start= mid+1;
            }
            if(letters[mid]>target){
                end= mid-1;
            }
        }
        return letters[start%letters.length];
    }
}
