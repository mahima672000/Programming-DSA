import java.io.*;

import java.util.*;

public class Main {

  //Kadane's Algorithm
  public static int solution(int[] arr) {

    int csum = arr[0];
    int maxSum = arr[0];

    for (int i = 1; i < arr.length; i++)
    {
      if (csum < 0)
      {
        csum = arr[i];
      }
      else
      {
        csum = csum + arr[i];
      }
      if (maxSum < csum)
      {
        maxSum = csum;
      }
    }
    return maxSum;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }
    System.out.println(solution(arr));
  }
}
