package dsa.recursion;

public class PalindromeStringRecursion {
    public boolean isPalindrome(String str, int l, int r) {
        if(l >= r) {
            return true;
        }

        if(str.charAt(l) != str.charAt(r)) {
            return false;
        }

        return isPalindrome(str, l+1, r-1);
    }

    public static void main(String[] args) {
        PalindromeStringRecursion palindromeStringRecursion= new PalindromeStringRecursion();
        String str = "abcd";
        System.out.println("Is Palindrome String ? "
                + palindromeStringRecursion.isPalindrome(str, 0, str.length()-1));
    }
}
