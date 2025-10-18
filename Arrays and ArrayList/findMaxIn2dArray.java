import java.util.Arrays;

public class findMaxIn2dArray {
    // https://leetcode.com/problems/richest-customer-wealth/
    public static void main(String[] args) {
        int [][] arr = {{1, 2, 3 },
                        {3, 2, 1 }                    
    };
    System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int person = 0 ;person<accounts.length ;person++ ){
            int rowsum = 0;
            for(int account = 0 ; account<(accounts[person]).length ;account++){
                rowsum += accounts[person][account];
            }
            if(rowsum>max){
                max = rowsum;
            }
        }
        return max;
    }
}
