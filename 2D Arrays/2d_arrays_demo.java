/* 2D arrays are 2 dimensional arrays which are used to represent matrices.
 2 aspects of 2D arrays: Abstract view and Memory view.
 
 If we declare arr[ ][ ] then a stack is created in the memory which has a variable arr which stores a null value(i.e. it doesn't point to anything).
 
 When we define this array as arr=new int[3][4] then, the first dimension =3 denotes the rows and the second dimension=4 denotes the columns. */
 
import java.io.*;

import java.util.*;
public class Main // main class
{
  public static void main (String[]args) throws Exception 
  {                                                  // main fn
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt (); //inputing no. of rows
    int m = scn.nextInt (); //inputing no. of columns
    int arr[][] = new int[n][m]; //declare + define
    for (int i = 0; i < arr.length; i++) 
    {
      for (int j = 0; j < arr[i].length; j++)
      {
        arr[i][j] = scn.nextInt (); // inputing 2D array (we can think of it as n-row 1-d arrays of arr[i].length length each)
      }
    }
    // no of rows is arr.length & no of column arr[0].length
    
    for (int i = 0; i < arr.length; i++) // running for loop again coz to print we need it again
    {
      for (int j = 0; j < arr[i].length; j++) 
      {
        System.out.print (arr[i][j] + " "); //print array ,"space"
      }
      System.out.println (); //print in new line for each 0
    }
  }
}

/* Time Complexity:
O(n2)

This time complexity is quadratic due to the use of nested for loops.

SPACE COMPLEXITY:
O(n2)

As a 2D array is used to store input values, therefore space complexity is quadratic */

