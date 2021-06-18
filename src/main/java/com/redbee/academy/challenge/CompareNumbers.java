package com.redbee.academy.challenge;

public class CompareNumbers {

  /**
   * Method that receives two numbers and returns the
   * max of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @param c - Another Integer Number
   * @return The max of a, b and c
   */
  public static Integer max(Integer a, Integer b, Integer c) {
    if (a == null) a = 0;
    if (b == null) b = 0;
    if (c == null) c = 0;

    Integer maximum = Integer.MIN_VALUE;

    if (a > b) {
      if (a > c) {
        maximum = a;
      }
    } else if (b > c) {
      maximum = b;
    } else {
      maximum = c;
    }

    return maximum;
  }
}
