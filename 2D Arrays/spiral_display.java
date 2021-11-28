/* iven a number n, representing the number of rows, then a number m, representing the number of columns.
After that you will be given n*m numbers, representing elements of 2d arrays.

We need to traverse this input 2D array, in a spiral pattern 

To traverse the 2D array, we use the trick that instead of traversing the 2D array actually in a spiral pattern,
we may think of traversing it box by box making sure that value at corner doesn't repeat.*/

import java.io.*;

import java.util.*;

public class Main{
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] arr = new int[n][m];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j] = scn.nextInt();
      }
    }

    int minrow = 0;
    int mincol = 0;
    int maxrow = arr.length - 1;
    int maxcol = arr[0].length - 1;


    int tne = n * m;     //total numbers of elements
    int count = 0;

    while (count < tne) {

      //left wall
      if (count < tne) {
        for (int i = minrow; i <= maxrow; i++) {
          System.out.println(arr[i][mincol]);
          count++;
        }
      }
      mincol++;

      //bottom wall
      if (count < tne) {
        for (int i = mincol; i <= maxcol; i++) {
          System.out.println(arr[maxrow][i]);
          count++;
        }
      }
      maxrow--;

      //right wall
      if (count < tne) {
        for (int i = maxrow; i >= minrow; i--) {
          System.out.println(arr[i][maxcol]);
          count++;
        }
      }
      maxcol--;

      //top wall
      if (count < tne) {
        for (int i = maxcol; i >= mincol; i--) {
          System.out.println(arr[minrow][i]);
          count++;
        }
      }
      minrow++;
    }
  }
}
