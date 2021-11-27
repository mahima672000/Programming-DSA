/* iven a number n, representing the number of rows, then a number m, representing the number of columns.
After that you will be given n*m numbers, representing elements of 2d arrays.

We need to traverse this input 2D array, in a spiral pattern 

To traverse the 2D array, we use the trick that instead of traversing the 2D array actually in a spiral pattern,
we may think of traversing it box by box making sure that value at corner doesn't repeat.*/

import java.io.*;

import java.util.*;
public class Main // min class
{
  public static void main (String[]args) throws Exception //main fn
  {
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt ();
    int m = scn.nextInt ();
    int arr[][] = new int[n][m]; //initialising & declaring the array
    for (int i = 0; i < arr.length; i++)
    {
      for (int j = 0; j < arr[i].length; j++)
      {
        arr[i][j] = scn.nextInt ();
      }
    }
    for (int i = 0; i < arr.length; i++)
    {
      for (int j = 0; j < arr[i].length; j++)
      {
        System.out.print (arr[i][j] + " ");
      }
      System.out.println ();
    }
  }
}
