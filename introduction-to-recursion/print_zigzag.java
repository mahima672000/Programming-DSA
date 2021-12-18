/* we are given an integer n and are required to print a particular type of sequence of numbers.*/

import java.io.*;
import java.util.*;

print class Main{// main class
  public static void main(String[] args)throws Exception{// main function
  }
  
  
  public static void zigzag(int n){//zigzag function
    if (n==0){
      return; // wipe out
    }
    
    System.out.print(n + "");// not println because we have to print in the same line
    zigzag(n-1);
    System.out.print(n+"");
    zigzag(n-1);
    System.out.print(n+"");
  }
  
  // n + zigzag(n-1) + n + zigzag(n-1) + n ...considering all string ...this is Output Format
  //n +"" this converts or we can say prints n as a string.
}
  

