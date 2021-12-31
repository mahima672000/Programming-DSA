/*The Fibonacci numbers are the series of numbers such that the current number is the sum of the last two numbers.
Fn = Fn-1 + Fn-2 [ Fo = 0, F1 =1 ]

Approach 1- Recursion */

import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args)throws Exception{
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(fib);
  }
 
 public static int fib(int n){
  if(n==0){
  return 0;
  }
  if(n==1){
  return 1;
  }
  return fib(n) = fib(n-1) + fib(n-2);
 }
}
/* Time Complexity :
Clearly, the time complexity is exponential. It can also be visualized in a simple manner, 
like for each Fibonacci you are making 2 sub-calls. And this will happen n times so 2*2*2*2 ... n-times i.e 2^n . Thus it is in the order of O(2n).

SPACE COMPLEXITY :
O(n) [linear]

Since we are making at most n recursion calls, the runtime stack will take up n units of space and hence it will O(n). */

/* Approach 2- DP = Recursion + Memoization */

import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] qb = new int[n + 1];
    int FibMemoized = FibMemoized(n, qb);

    System.out.println(FibMemoized);

    scn.close();
  }

  public static int FibMemoized(int n, int[] qb) {
    if (n == 0 || n == 1) {
      return n;
    }
    if (qb[n] != 0) { //checking if fib(n) already solved or not ... fib(n) is same as qb(n) ...DOUBT! 
      return qb[n];
    }
    
    int fibn = FibMemoized(n - 1, qb) + FibMemoized(n - 2, qb);

    qb[n] = fibn; //storing n-th element in the array qb

    return fibn;
  }
}


/*
Time Complexity :
O(n) [exponential]

Here every Fib(n) will be called only once, because next time the value will be retrieved from the qb. Thus, it will take O(1) per call, hence n*O(1) = O(n)

SPACE COMPLEXITY :
O(n) [linear]

Here we are using an additional qb[] array to store the results, which will add to the runtime stack space complexity. Thus overall space complexity is O(n+n) which is the same as O(n)

If at any point you found some difficulty I would suggest you watch the video explanation. It is very important that your dp basics are strong. */
