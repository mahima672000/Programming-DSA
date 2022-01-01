/* 
1. The string should be compressed such that the
consecutive duplicates of characters are replaced with a single character. 

2.The string should be compressed such that the consecutive duplicates 
of characters are replaced with a single character and followed by the number of consecutive duplicates. 

That means first compression is without frequency count & second compression is with frequency count. */


/* WITHOUT FREQENCY COUNT */

import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner scn = new Scanner(System.in);
    String s = scn.next();
    System.out.println(simpleCompression);
  }
  
  public static String simpleCompression(String s){ //String is the return type here
    String ans = "";
    for(int i=0; i<s.length(); i++){ //i<s.length() coz only then it will be 0 to s.length-1
      while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){  //coz if we take s.length() then it will do s.charAt(i+1) ..which is s.length and that index does not exist in s
        i++;
      }
      ans +=s.charAt(i);
    }
    return ans;
  }
      






