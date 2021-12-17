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
