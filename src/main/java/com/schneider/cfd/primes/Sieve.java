package com.schneider.cfd.primes;

/**
 * Created by chealey on 10/27/2015.
 * Hosts the sieve functionality
 */
public class Sieve {
    public int returnNumOfPrimes(int n) {
        if(n<1){
            return 0;
        }
        boolean[] isPrime = new boolean[n + 1];
        //isPrime[1] = false;
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // mark non-primes <= n using Sieve of Eratosthenes
        for (int i = 2; i * i <= n; i++) {

            // if i is prime, then mark multiples of i as nonprime
            // suffices to consider mutiples i, i+1, ..., n/i
            if (isPrime[i]) {
                for (int j = i; i * j <= n; j++) {
                    isPrime[i * j] = false;
                }
            }
        }

        // count primes
        int primes = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes++;
            }
        }
        return primes;
    }
}
