package com.schneider.cfd.primes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests to make sure that the sieve returns the correct values in a couple of cases
 * Created by chealey on 10/27/2015.
 */
public class sieveTest {

    @Test
    public void testValues() {
        Sieve sieve = new Sieve();
        assertEquals(4, sieve.returnNumOfPrimes(10));
        assertEquals(25, sieve.returnNumOfPrimes(100));
        assertEquals(168, sieve.returnNumOfPrimes(1000));
        assertEquals(1229, sieve.returnNumOfPrimes(10000));
        assertEquals(9592, sieve.returnNumOfPrimes(100000));
    }

    @Test
    public void testNegative(){
        Sieve sieve = new Sieve();
        assertEquals(0, sieve.returnNumOfPrimes(-1));
    }

}
