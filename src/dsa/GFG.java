package dsa;




// Java implementation of the approach
import java.util.*;

class GFG {

    // Function to return the count of characters
    // that are to be inserted in str such that no
    // three consecutive characters are same
    static int getCount(String S)
    {
        int res = 0;
        /*int n = S.length();
        for(int i = 0; i < n;i++) {
            while((i+1 < n) && (S.charAt(i) == S.charAt(i+1))) {
                i++;
            }
            res += (next - i) / 3;
            i = next; // skip processed letters
        }*/
        return res;
    }

    // Driver code
    static public void main(String[] arg)
    {
        String str = "baaaaa";
        System.out.println(getCount(str));
    }
}


// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

/*class Solution {
    public int solution(String S) {
        // Implement your solution here
        int i=0;
        int n = S.length();
        int count = 0;

        while(i< n-2) {
            if((S.charAt(i) == S.charAt(i+1)) && S.charAt(i) == S.charAt(i+2)) {
                count++;

                if(S.charAt(i) == 'a') {
                    char[] charS = S.toCharArray();
                    charS[i] = 'b';
                    S = String.valueOf(charS);
                } else {
                    char[] charS = S.toCharArray();
                    charS[i] = 'a';
                    S = String.valueOf(charS);
                }

                i = i + 2;
            } else {
                i++;
            }
        }

        return count;
    }
}*/

