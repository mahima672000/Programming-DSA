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
like for each Fibonacci you are making 2 sub-calls. And this will happen n times so 2*2*2*2 ... n-times i.e 2n . Thus it is in the order of O(2n).

SPACE COMPLEXITY :
O(n) [linear]

Since we are making at most n recursion calls, the runtime stack will take up n units of space and hence it will O(n). */

/* Approach 2- DP = Recursion + Memoization */




