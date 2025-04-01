package dsa;

// find gcd of 2 numbers
public class GCD {
    // gcd(a,b) = gcd(b,a % b)
    public int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        GCD obj = new GCD();
        System.out.println("GCD: " + obj.gcd(15, 27));
    }
}
