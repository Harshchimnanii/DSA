import java.util.Arrays;

public class passinginfunction {
    public static void main(String[] args) {
        int nums [] = new int[5];
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int nums[]){
        nums[3] = 99;
    }
}
