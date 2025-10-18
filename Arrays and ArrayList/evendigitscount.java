public class evendigitscount {
	// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/1654531106/
    public static void main(String[] args) {
	    int [] arr = {18 , 164 , 9 , 1764 , 98 , 12};
	    int result = EvenNoOfDigits(arr);
	    System.out.print(result);
	}
	static int EvenNoOfDigits(int [] arr){
	    int countno = 0;
		for(int element : arr){
			int count = 0;
			for (int i = element; i > 0; i/=10) {
					count++;
			}
			if(count % 2 ==0){
				countno++;
			}
		}
	    return countno;
	}
}
