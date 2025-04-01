package dsa;

public class PalindromeNumber {
    public boolean isPalindrome(int num) {
        if(num == 0) {
            return true;
        }

        int n = num;
        int m;
        int res = 0;
        while(n != 0) {
            m = n % 10;
            res = res * 10 + m;
            n = n / 10;
        }

        return res == num;
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println("Is Palindrome Number ? " + palindromeNumber.isPalindrome(1234));
    }
}
