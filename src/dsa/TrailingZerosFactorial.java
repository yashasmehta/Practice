package dsa;

public class TrailingZerosFactorial {
    public int findTrailingZeros(int num) {
        int res = 0;

        for(int i=5;i<=num;i=i*5) {
            res += num/i;
        }

        return res;
    }

    public static void main(String[] args) {
        TrailingZerosFactorial trailingZerosFactorial = new TrailingZerosFactorial();
        System.out.println("Number of trailing zeros: "
                + trailingZerosFactorial.findTrailingZeros(12));
    }
}
