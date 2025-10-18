class Solution {

    public static void main(String[] args) {
        int x1 = 121;
        int x2 = 12345;
        
        System.out.println("Is " + x1 + " a palindrome? " + isPalindrome(x1));
        System.out.println("Is " + x2 + " a palindrome? " + isPalindrome(x2));
    }

    public static boolean isPalindrome(int x) {
        
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        
        while (x > reversedHalf) {
            int digit = x % 10;
            reversedHalf = reversedHalf * 10 + digit;
            x = x / 10;
        }

        if (x == reversedHalf || x == reversedHalf / 10) {
            return true;
        }
        
        return false;
    }
}