/* Given an input number N and we will have N numbers following it as the input. We are also given an integer K. 
We have to rotate an array K values to the right if K is positive and K values to the left if K is negative. If K=0, do not rotate the array. */


/*Deciding K Value: If the value of K is positive, K=K%N where N is the length of the input array. If the value of K is negative, K=K%N + N.

Revering Parts of Array: After we have calculated the value of K, reverse the first part of the array i.e. from 0 to N-K-1 and the second part from N-K to N-1 separately.

Reverse the entire Array: Now, reverse the entire array i.e. from 0 to N-1. The array will be rotated according to the value of K. */

/* K<N
   case-1 K>0
   rotate it with K%N only
   
   case-2 K<0
   rotate it with N+K%N */


import java.io.*;

import java.util.*;
public class Main {//main class
  public static void display(int[] a) {//display fn
    StringBuilder sb = new StringBuilder();

    for (int val : a) {
      sb.append(val + " ");
    }
    System.out.println(sb);
  }
public static void reverse(int[] a, int li, int ri) {//reverse fn
    while (li < ri) {
      int temp = a[li];
      a[li] = a[ri];
      a[ri] = temp;

      li++;
      ri--;
    }
  }
  public static void rotate(int[] a, int k) {//rotate fn
    k = k % a.length;
    if (k < 0) {
      k += a.length;
    }

    reverse(a, 0, a.length - k - 1);
    reverse(a, a.length - k, a.length - 1);
    reverse(a, 0, a.length - 1);
  }
  public static void main(String[] args) throws Exception {//main fn
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
  }

}

/* Time Complexity:
O(n)

This is because we have to traverse the array and its parts to reverse it. So, the time complexity for reversing the array and its parts will be O(n) + O(n) + O(n)=O(n).

SPACE COMPLEXITY:
O(1)

(as we have not used any extra space) */
