import java.util.Arrays;

public class BSin2Darray {
    public static void main(String[] args) {
        // searching in matrices
        int [][] arr = {
            {10 , 20 , 30 , 40} , 
            {15 , 25 , 35 , 45},
            {28 , 29 , 37 , 49},
            {33 , 34 , 38 , 50}};
            int target = 300;
            // int[]result = Binarysearch(arr , target);
            int[]result = search(arr , target);
            
            System.out.println(Arrays.toString(result));

    }
    // method 1 
//     static int[] Binarysearch(int [][] nums , int target){
//         int r = 0;
//         int c = nums.length-1;
//         while(r<nums.length && c >=  0){
//             int mid = r + (c-r)/2;
//             if(nums[r][c]==target){
//                 return new int[]{r,c};
//             }
//             else if(nums[r][c]<target){
//                 r++;
//             }
//             else if(nums[r][c]>target){
//                 c--;
//             }
            
//     }
//     return new int[]{-1,-1};
// }
//    method 2 
// search in rowprovided b/w the column provided
static int [] binarysearch(int[][] matrix , int row , int cstart , int cend ,int target ){
    while(cstart<cend){
        int mid = cstart +(cend -cstart)/2;
        if(matrix[row][mid] == target){
            return new int[]{row , mid};
        }
        else if(matrix[row][mid]>target){
            cend = mid-1;
        }
        else if(matrix[row][mid]<target){
            cstart = mid+1; 
        }

    }
    
    return new int[]{-1, -1};
}
static int [] search(int[][] matrix , int target){
    int rows = matrix.length;
    int columns =matrix[0].length;
    if(rows == 1){
        return binarysearch(matrix, 0,0 ,  columns-1, target);
    }
    // run the loop till 2 rows are remaining 
    int rstart = 0;
    int rend = rows-1;
    int cmid = columns/2;

    while(rstart<rend){
        int mid = 
    }
}
}

