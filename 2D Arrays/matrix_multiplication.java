/* It takes 2 matrices as the input and returns the product of those matrices on multiplication. 
Here, n1=no. of rows and m1=no. of columns of the First Matrix. And, n2=no. of rows and m2=no.of columns of the Second Matrix.

Only if m1=n2, then a product matrix can be formed of size n1*m2. '

Pij = ai0b0j + ai1b1j + ..... ai(n-1)b(n-1)j
     =Σ(k=0 to k=n-1)aikbkj  
     where Pij is the element in the product matrix*/

import java.io.*;

import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {//main fn
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();//input no of rows for M1
    int m1 = scn.nextInt();//input no of column for M1
    int[][] arr1 = new int[n1][m1];//declare and intialise arr1(a 2D matrix M1)
    for (int i = 0; i < n1; i++) {                      //1
      for (int j = 0; j < m1; j++) {
        arr1[i][j] = scn.nextInt();
      }
    }
    int n2 = scn.nextInt();
    int m2 = scn.nextInt();
    int[][] arr2 = new int[n2][m2];//declare and intialise arr2(a 2D matrix M2)
    for (int i = 0; i < n2; i++) {                      //2
      for (int j = 0; j < m2; j++) {
        arr2[i][j] = scn.nextInt();
      }
    }

    if (m1 != n2) {//column of M1 not equals rows in M2
      System.out.print("Invalid input");              //3
      return;
    }
    int[][] ans = new int[n1][m2];//declare & initalize product matrix of order n1xm2 
    for (int i = 0; i < n1; i++) {
      for (int j = 0; j < m2; j++) {                  //4
        for (int k = 0; k < m1; k++) {//what's the limit for k here ?  m1 or n2 the common for both
          ans[i][j] += (arr1[i][k] * arr2[k][j]);//this how we do the sigma thing in programming 
        }
      }
    }
    for (int i = 0; i < n1; i++) {
      for (int j = 0; j < m2; j++) {
        System.out.print(ans[i][j] + " ");          //5
      }
      System.out.println();
    }
  }
}


/* Time Complexity:
O(n3)

This time complexity is cubic because 3 nested for loops are used.

SPACE COMPLEXITY:
O(n2)

As 2D arrays are used to store numbers, therefore space complexity is quadratic.*/
