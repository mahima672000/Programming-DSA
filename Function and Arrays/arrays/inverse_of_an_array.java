/* given a number n, representing the size of array a,
followed by n numbers, representing elements of array a.

You are required to calculate the inverse of array a. 
Since input and output are already managed, your only work is 
to code a function that will return the user a new array with inverted values. */

/* The basic concept of the problem is to change the positions of the
values as their indices and indices as values using a for loop and a new array of the same length as that of the input array's length . */

import java.io.*;

import java.util.*;

public class Main {//main class
  public static void display(int[] a) {//display fn
    StringBuilder sb = new StringBuilder();

    for (int val : a) {
      sb.append(val + "
                ");
    }
    System.out.println(sb);
  }

  public static int[] inverse(int[] a) {//inverse fn
    int[] inv = new int[a.length];//create a new array named inv of same length

    for (int i = 0; i < a.length; i++) {//for loop for inversing
      int val = a[i];//val is ith value in array a
      inv[val] = i;//valth index of inv is i
    }

    return inv;//return inv
  }

  public static void main(String[] args) throws Exception {//main fn for intput taking & displaying result 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(br.readLine());
    }

    int[] inv = inverse(a);
    display(inv);
  }

}

/* Time Complexity:
O(n)

A "for" loop is used to put the index value as data in a new array from the input array; travelling the n sized array makes the time complexity O(n).

SPACE COMPLEXITY:
O(n)

As a new array (inv) of size n has been used, therefore space complexity becomes O(n). */
