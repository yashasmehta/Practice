package xor;

// find only non-repeating element in array where each element repeats twice.
public class FindNonRepeatingElement1 {
    public int nonRepeating(int[] arr) {
        int res = 0;
        for(int i : arr) {
            // i ^ 0 = i; i ^ i = 0;
            res = res ^ i;
        }
        return res;
    }

    public static void main(String[] args) {
        FindNonRepeatingElement1 obj = new FindNonRepeatingElement1();
        int[] arr = {5,4,1,4,3,5,1};
        System.out.println("Non repeating element is " + obj.nonRepeating(arr));
    }
}
