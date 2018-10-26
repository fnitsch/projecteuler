package com.example.euler.problem_2;

/**
 * Created by Fabian.Nitsch on 1/20/2018
 */

public class Problem2 {

    public static void main(String[] args) {

        int sum = 0;

        int i = 1;

        do {
            int f = fibonacci(i);
            if (f % 2 == 0) {
                sum += f;
            }

            System.out.println(i + ". fibonacci = [" + fibonacci(i) + "], Sum = [" + sum + "]");

            i++;
        }
        while (fibonacci(i) < 4000000);

    }

    private static int fibonacci(int n) {
        if (n <= 2) return n;
        else return fibonacci(n - 1) + fibonacci(n - 2);

    }
}
