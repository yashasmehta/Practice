package dsa;

import java.util.Arrays;

// find number of prime numbers from 1 to n
public class SeiveOfEratosThenes {
    public boolean[] isPrime(int n) {
        boolean[] isPrime = new boolean[n+1];

        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i=2; i*i <=n; i++) {
            for(int j=2*i; j<=n;j+=i) {
                isPrime[j] = false;
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        SeiveOfEratosThenes seiveOfEratosThenes = new SeiveOfEratosThenes();
        boolean[] isPrime = seiveOfEratosThenes.isPrime(20);

        for(int i=0 ; i<isPrime.length ; i++) {
            System.out.println(i + ": " + isPrime[i]);
        }
    }
}
