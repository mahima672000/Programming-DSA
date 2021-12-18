/* You are required to enter the number of discs and the integer id's for all 3 towers. 
You have to print INSTRUCTIONS, in format n[n1 -> n2] which represents "move nth disc from tower n1 to tower n2".
All discs should get transferred from source tower to destination tower, such that no larger disc is placed over a smaller disc.

Rules of game :

You can move only 1 disc at a time.
A larger disc can never be placed under a smaller disc.
You can move only the top-most disc. */

import java.io.*;
import java.util.*;

public class Main{
  public static void main(String []args) throws Exception{
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int t1 = scn.nextInt();
    int t2 = scn.nextInt();
    int t3 = scn.nextInt();
    toh(n,t1,t2,t3); // call toh &  toh will print everything
  }
  public static void toh(int n,int t1, int t2,int t3){
    if(n==0)
      return;
    toh(n-1,t1,t2,t3);
    System.out.println(n + "[" + t1 + " -> " + t2 + "]");
    toh(n-1,t1,t2,t3);
  }
}
