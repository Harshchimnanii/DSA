import java.util.Arrays;

public class searchin2Darray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6 , 0},
            {7, 8, 9 , 33 , 12},
            {22, 11, 19}
        };
        for(int[] element : arr){
            System.out.println(Arrays.toString(element));
        }
        int[] resulttarget = searching(arr, 19);
        resulttarget[0]+=1;
        resulttarget[1]+=1;
        System.out.println("row no : " + resulttarget[0] + " column no : " + resulttarget[1]);
        // result for maximum number
        int[] resultmax = searchingmax(arr);
        resultmax[0]+=1;
        resultmax[1]+=1;
        System.out.println("row no : " + resultmax[0] + " column no : " + resultmax[1]);
        
    }
    static int[] searching(int[][] arr , int target){
        int rows = 0;
        int cols = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target ){
                    rows += i;
                    cols+= j;
                }
            }
        }
        int[] resulttarget = {rows , cols};
        return resulttarget;
    }
    static int[] searchingmax(int[][] arr ){
        int rows = 0;
        int cols = 0;
        int max = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max ){
                    max = arr[i][j];
                    rows = i;
                    cols = j;
                }
            }
        }
        int[] resultmax = {rows , cols};
        return resultmax;
    }
}
