package com.example.euler.problem_4;

public class Problem4 {
    public static void main(String[] args) {
        int largestVal = 0;

        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {

                int sum = i * j;

                if (isPalindrom(sum)) {

                    System.out.println("i = [" + i + "], j = [" + j + "], sum = [" + sum + "]");

                    if(largestVal < sum) largestVal = sum;
                }
            }
        }

        System.out.println("largest Value = [" + largestVal + "]");

    }

    private static boolean isPalindrom(int n) {
        int k, sum = 0, temp;

        temp = n;

        while (n > 0) {

            k = n % 10;

            sum = (sum * 10) + k;

            n = n / 10;

        }

        return temp == sum;
    }
}
