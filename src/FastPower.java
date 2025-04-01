public class FastPower {

    public int fastPower(int a, int b) {
        int res = 1;

        while (b> 0) {
            if(b % 2 != 0) {
                res *= a;
            }

            a = a * a;
            b = b / 2;
        }

        return res;
    }

    public static double myPow(double x, int n) {
        double res = 1.0;

        if(n < 0) {
            n = Math.abs(n);
            x = 1/x;
        }

        System.out.println("X: " + x);
        System.out.println("N: " + n);

        while (n> 0) {
            if(n % 2 != 0) {
                res *= x;
            }

            x = x * x;
            n = n / 2;
        }

        return res;
    }

    public static void main(String[] args) {
       // FastPower power = new FastPower();
       // System.out.println(power.fastPower(2,5));

        myPow(2.00000, -2147483647);
    }
}
