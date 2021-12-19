/*we get a number 'n' in the decimal base and a destination base 'b', to which we are required to convert the number 'n' into. */

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    System.out.println(getValueInBase(n, b));
    scn.close();
  }

  public static int getValueInBase(int n, int b) {
    int ans_num = 0, multiplier = 1;
    while (n > 0)
    {
      int remainder = n % b;
      n = n / b;
      ans_num = ans_num + remainder * multiplier;
      multiplier *= 10;
    }
    return ans_num;
  }
}

/* Time Complexity
We are extracting digits of number n and performing some minute calculations, which will take O(log10 n) time as there can be maximum floor(log10 n) digits in a number n.

Space Complexity
We just need to store a few variables like the answer, multiplier and remainder, hence O(1) auxiliary space is required. */
