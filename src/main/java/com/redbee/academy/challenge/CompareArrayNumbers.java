package com.redbee.academy.challenge;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static List<Integer> max(List<Integer> a, List<Integer> b) {
    List<Integer> maxList = new ArrayList<Integer>();
    int pos = 0;

    if (a.size()>b.size()) pos=a.size();
    else pos=b.size();

    for (int i=0; i<pos; i++) {
      try{
        Integer m = Integer.max(a.get(i),b.get(i));
        maxList.add(m);
      } catch (IndexOutOfBoundsException e) {
        if (a.size()>b.size()) maxList.add(a.get(i));
        else maxList.add(b.get(i));
      }
    }

    return maxList;
  }


}
