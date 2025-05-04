package dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        List<String> substrList = new ArrayList<>();
        substrings(s, s.length(), substrList);

        for(String str : substrList) {
            System.out.println("Substring: " + str);
        }

        return "";
    }

    private List<String> substrings(String s, int n, List<String> substrList) {
        if(n == 0) {
            substrList.add("");
            return substrList;
        }

        if(n == 1) {
            substrList.add(s);
        }

        return substrings(s.substring(0,n-1), n-1, substrList);
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        longestPalindromicSubstring.longestPalindrome("babad");
    }
}
