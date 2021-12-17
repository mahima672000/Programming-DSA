/*The Fibonacci numbers are the series of numbers such that the current number is the sum of the last two numbers.
Fn = Fn-1 + Fn-2 [ Fo = 0, F1 =1 ]

Approach 1- Recursion 

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
  
  

