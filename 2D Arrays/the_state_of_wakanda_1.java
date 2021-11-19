/* NOTE TO SELF - don't get scared or judge the difficulty level merely with the name of the problem (lolzz) 

 Inshort the problem is :- wave traversal of a 2D-array 
 
 Our aim is to traverse  input 2D array, in a wave pattern */

import java.io.*;

import java.util.*;

public class Main {//main class
  public static void main(String[] args) throws Exception {//main fn
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();//input rows
    int m = scn.nextInt();//input column
    int[][] arr = new int[n][m];//initialze & declare arr
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j] = scn.nextInt();//input arr
      }
    }

    for (int j = 0; j < arr[0].length; j++) {//outer loop is for column coz column is always increasing 
      if (j % 2 == 0) {//for even column go downwards
        for (int i = 0; i < arr.length; i++)// i is always arr.length 
          System.out.println(arr[i][j]);
      } else {//for odd column go upwards
        for (int i = arr.length - 1; i >= 0; i--)//last ie. the first i here is n-1 ie arr.length-1
          System.out.println(arr[i][j]);
      }
    }
  }
}
/*
Time Complexity:
O(n^2)

As there is nested for loop[O(n)] and the outer for loop runs n times. There are two inner for loops[O(n/2)]. Either one will run in each iteration.

Making the time complexity: O(n)*(O(n/2)+O(n/2))= O(n^2).

SPACE COMPLEXITY:
O(1)

Since, we are not using any auxiliary space and hence the space complexity is O(1). */
