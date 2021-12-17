import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    printDecreasing(n);
  }

  public static void printIncreasing(int n) {
    if (n == 0) //Base case
      return;
    printDecreasing(n - 1);//Recursive call
    System.out.println(n);//Self Work

  }

}

/* Time Complexity :
O(n)

As n calls are made and work is done corresponding to these n calls therefore the time complexity becomes O(n).

SPACE COMPLEXITY :
O(1)

Since no extra space is used, therefore space complexity is constant, 
however you should know that if the recursion call stack is taken into account, then space complexity will be O(n) as there are n recursive calls. */
