public class Searchinstring {
    public static void main(String[] args) {
        String str = "Harsh";
        char[] arr = str.toCharArray();
        int result = linearsearch(arr);
        System.out.println(result);
        System.out.println(linearsearch1(arr));
    }
    static int linearsearch(char[] arr){
        for(int i = 0 ; i< arr.length ; i++){
            char a = 'a';
            if(a == arr[i]){
                return i;
            }
        }
        return -1;
    }
    static boolean linearsearch1(char[] arr){
        char a = 'h';
        for(char ch : arr){
            if(ch == a){
                return true;
            }
        }
        return false;
    }
}
