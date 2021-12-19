/* Given a number n, and a digit d, you are required to calculate the frequency of digit d in number n.

Pseudo Code-
Set counter = 0
Extract Digits of number n until n becomes 0
If the current digit extracted is the same as the digit d, update counter by 1.
Return counter variable */


import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int d = scn.nextInt();
    int f = frequency(n, d);
    System.out.println(f);
  }
  public static int frequency(int n, int d) {
    int counter = 0;
    // initialize digit counter to 0
    while (n > 0)
    {
      int temp = n % 10; // Extract Digits
      n = n / 10; // Divide N by 10
      if (temp == d) // Logic Applied
        counter++;
    }
    return counter;
  }
}

/* Time Complexity:
O(log10 n)

We are extracting digits of number n which will take O(log10 n) time as there can be maximum floor(log10) digits in a number n.

Space Complexity:
O(1)

We just need to store the count of matched digits in an integer variable counter, hence O(1) auxiliary space is required. */
