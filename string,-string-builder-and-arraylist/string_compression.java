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
      
/* WITH FREQUENCY COUNT */
  import java.io.*;
  import java.util.*;
  
  public class Main{
    public static void main(String[]args){
      Scanner scn = new Scanner(System.in);
      String s = scn.next();
      System.out.println(frequencyCompression);
    }
    public static String frequencyCompression(String s){// String is the return type here
      String ans = "";
      for(int i=0; i<s.length();i++){//i<s.length() coz only then it will be 0 to s.length-1
        while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){//coz u shud check from this statement `s.charAt(i) == s.charAt(i+1)`  i+1 should be at max s.length()-1 so i <s.length()-1
          count++;
          i++;
        }
        ans +=s.charAt(i);
        if(count>1){
          ans+=count;
        }
      }
      return ans;
    }
    
    /* Time Complexity :
In both ways, we are traversing the input string once, hence the time complexity will be O(n)
SPACE COMPLEXITY :
If we take the space of the output string, then the solution is taking O(n) space. 
Although, if we ignore the space taken by the output, (which we generally do), the solution is said to take O(1) auxiliary space. */





