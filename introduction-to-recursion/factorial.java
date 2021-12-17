/* factorial of both 0 and 1 is 1 
Factorials of negative integers do not exist */

import java.io.*;

import java.util.*;

public class Main {
   public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    printFactorial(n);
  }
  
  public static int printFactorial(int n){ // fn type int so that return type int so that we can multiply
    if(n==1){
      return 1; // value is returned isliye '}' wipe out case me not needed
    }
    return n*(printFactorial(n-1));
  }
}
