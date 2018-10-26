package com.example.euler.problem_3;

/**
 * Created by Fabian.Nitsch on 1/20/2018
 */

public class Problem3 {

    public static void main(String[] args) {
        long n = 6008514751430L;

        primeFactorization(n);

    }

    private static void primeFactorization(long n) {

        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && n != i) {
                System.out.println(i);
                primeFactorization(n / i);
                return;

            } else if (n % i == 0 && n == i) {
                System.out.println(i);

            }

        }
    }

}
