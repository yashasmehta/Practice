package dsa;

public class PalindromeString {
    public boolean isPalindrome(String str) {
        if(str.isEmpty()) {
            return true;
        }

        int i = 0;
        int j = str.length() - 1 ;

        while(i<j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeString palindromeString = new PalindromeString();
        System.out.println("Is Palindrome String ? " + palindromeString.isPalindrome("b"));
    }
}
