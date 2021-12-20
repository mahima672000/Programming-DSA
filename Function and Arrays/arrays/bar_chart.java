/* given an array of n elements. Each element depicts the height of a vertical bar. print output */

import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // not taking input from user
    int n = 5; 
    int[] arr = {3, 1, 0, 7, 5}; // inputing a known array !


    int max = Integer.MIN_VALUE; // intialising the maximum 
    for (int i = 0; i < n; i++) { // we are using a for loop for each i there's a max

      max = Math.max(max, arr[i]); // maximum is maximum  of arr[i]  
    }


    for (int i = 0; i < max; i++) { // outerloop for all floors
      for (int val : arr) { // val belonging to arr ie arr elements not using arr[i] coz outer for loop is using i for iteration
        if (val >= max - i) {
          System.out.print("*	");
        } else {
          System.out.print("	");
        }
      }

      System.out.println();
    }
  }

}


/* Time Complexity:
O(n2)

This time complexity is quadratic because nested for loops are used.

SPACE COMPLEXITY:
O(n)

As a 1D array is used, therefore space complexity is linear. */
