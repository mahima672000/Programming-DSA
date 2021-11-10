/* Span -the difference between max and min value of the array */

import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); //input the no. of inputs
    int[] arr = new int[n]; // declaration of array & memory allocation

    for (int i = 0; i < n; i++) {   //loop to input array elements
      arr[i] = scn.nextInt();
    }

    int min = arr[0]; // initialising min & max of array
    int max = arr[0];

    for (int i = 1; i < arr.length; i++) { //loop from i=1 since i=0 element is already stored
      if (arr[i] < min) {
        min = arr[i]; //updating the min
      }

      if (arr[i] > max) {
        max = arr[i]; //updating the max
      }
    }

    int span = max - min;
    System.out.println(span);
  }
}

//Time Complexity:
//O(n)
//"for" loop is used to find the minimum and maximum values in the array; travelling the n sized array makes the time complexity O(n)

//SPACE COMPLEXITY:
//O(1)
//Since no extra space is used, therefore space complexity is constant.
