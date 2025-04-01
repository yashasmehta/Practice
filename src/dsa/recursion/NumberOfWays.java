package dsa.recursion;

// find number of ways in n x m matrix
public class NumberOfWays {
    public int findWays(int n, int m) {
        if(n == 1 || m ==1) {
            return 1;
        }

        return findWays(n-1,m) + findWays(n,m-1);
    }

    public static void main(String[] args) {
        NumberOfWays numberOfWays = new NumberOfWays();
        System.out.println("The number of ways: " + numberOfWays.findWays(4,3));
    }
}
