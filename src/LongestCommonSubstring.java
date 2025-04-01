//["flower","flow","flight"] -> fl

public class LongestCommonSubstring {

    public String longestSubstring(String[] array) {
        if(array.length == 0) {
            return "";
        }

        String prefix = array[0];

        for(int i=1; i< array.length;i++) {
            String str = array[i];
            String res = "";
            int j=0;
            int k=0;

            while(j < prefix.length() && k < str.length()) {
                if(prefix.charAt(j) == str.charAt(k)) {
                    res += str.charAt(k);
                } else {
                    break;
                }
                j++;
                k++;
            }

            prefix = res;
        }
        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonSubstring substring = new LongestCommonSubstring();
        String[] array = {"cir","car"};
        System.out.println(substring.longestSubstring(array));
    }
}
