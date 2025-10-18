public class reversethedigit {
    public static void main(String[] args) {
        int n = 1234567;
        int ans = 0;
        for(int i = 1 ; i<=n ;i++){
            int rem = n%10;
            ans = ans * 10 + rem;
            n/=10;
        }
        System.out.println(ans);
    }
}
