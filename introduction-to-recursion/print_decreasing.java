import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = scn.nextInt();
    printDecreasing(n);
  }

  public static void printDecreasing(int n) {
    //Base case
    if (n == 0)
      return;

    //Self Work
    System.out.println(n);

    //Recursive call
    printDecreasing(n - 1);
  }
}

/*don't count wipe out ones in call

Time Complexity: O(n)
As n calls are made and work is done corresponding to these n calls therefore the time complexity becomes O(n).

Space Complexity: O(1)
Since no extra space is used, therefore space complexity is constant, 
however you should know that if the recursion call stack is taken into account, then space complexity will be O(n) as there are n recursive calls. */

