import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        int num = x;
        List<Integer> list = new ArrayList<>();

        while(num != 0) {
            int rem = num % 10;
            list.add(rem);
            num = num / 10;
        }

        int i=0;
        int j= list.size() - 1;

        while(i < j) {
            if(!list.get(i).equals(list.get(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
