package com.schneider.cfd.primes;

/**
 * Run the prime sieve code
 * Created by chealey on 10/21/2015.
 * Not my code, this is borrowed from
 * http://introcs.cs.princeton.edu/java/14array/PrimeSieve.java.html
 */
public class runSieve {
    public static void main(String[] args) {
        //int number = Integer.parseInt(args[0]);
        int number;
        Sieve sieve = new Sieve();
        for (int i = 1; i <= 9; i++) {
            number = (int) Math.pow(10, i);
            int result = sieve.returnNumOfPrimes(number);
            System.out.println("There are " + result + " primes less than 10^" + i );
        }

    }

}
