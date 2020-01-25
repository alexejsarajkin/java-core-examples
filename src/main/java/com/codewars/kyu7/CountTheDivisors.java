package com.codewars.kyu7;

/*
  Count the divisors of a number
  Count the number of divisors of a positive integer n.
  Random tests go up to n = 500000.

  Examples numberOfDivisors(4)  == 3 // 1, 2, 4
  numberOfDivisors(5)  == 2 // 1, 5
  numberOfDivisors(12) == 6 // 1, 2, 3, 4, 6, 12
  numberOfDivisors(30) == 8 // 1, 2, 3, 5, 6, 10, 15, 30
 */

public class CountTheDivisors {
  public static void main(String[] args) {
    int n = 4;
    int count = 1;

    for (int i = 2; i <= n; i++) {
      if (n % i == 0) {
        count++;
      }
    }
    System.out.println(count);
  }
}
