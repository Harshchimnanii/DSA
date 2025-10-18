public class counttherepeatedones {
    public static void main(String[] args) {
        int n = 1237567987;
        int count = 0;
        for(int i = 0 ; i<n ; i++){
            int rem = n%10;
            if(rem == 7){
                count++;
            }
            n/=10;
        }
        System.out.println(count);
    }
}
