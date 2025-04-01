import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Map<Character,Integer> map1 = new HashMap<>();
        map1.put('a',map1.getOrDefault('a', 0) +1);

        Solution solution = new Solution();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
       // solution.isHappy(2);
        solution.merge(nums1,3,nums2, 3);
    }

    public int strStr(String haystack, String needle) {

        if(needle.length() == 0) {
            return 0;
        }

        if(needle.length() > haystack.length()) {
            return -1;
        }

        int j = 0;
        int index = -1;

        for(int i=0;i<haystack.length();i++) {
            if(haystack.charAt(i) == needle.charAt(j)) {
                if(index == -1) {
                    index = i;
                }
                j++;
            }

            if(j == needle.length()) {
                break;
            }

            if(haystack.charAt(i) != needle.charAt(j) && j != 0) {
                j = 0;
                index = -1;
            }
        }

        return index;
    }

    public boolean isHappy(int n) {
            int result = 0;
            int mod;
            int num = n;
            long count = 0;

            while(count <= Integer.MAX_VALUE) {
                mod = num % 10;
                result += Math.pow(mod,2);
                num = num /10;

                System.out.println(result);

                if(result == 1) {
                    return true;
                }

                if(num == 0) {
                    num = result;
                    result = 0;
                }
                count++;
            }

            return false;
        }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(m==0 && n==1) {
            nums1[0] = nums2[0];
            return;
        }

        if(m==1 && n==0) {
            return;
        }

        for(int j=0;j<n;j++) {
            int temp = nums2[j];
            int i = m - 1 + j;

            while(i >= 0 && nums1[i] > nums2[j]) {
                nums1[i+1] = nums1[i];
                i--;
            }

            nums1[i+1] = temp;
        }
    }
}


