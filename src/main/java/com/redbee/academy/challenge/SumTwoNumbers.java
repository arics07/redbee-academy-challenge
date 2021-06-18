package com.redbee.academy.challenge;

public class SumTwoNumbers {

  /**
   * Method that receives two numbers and returns the
   * sum of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static Integer sum(Integer a, Integer b) {
    Integer result = 0;
    try {
      result = Integer.sum(a,b);
    } catch (NullPointerException e) {
      if (a==null) a = 0;
      else b = 0;
      result = Integer.sum(a,b);
    }
    return result;
  }
}
