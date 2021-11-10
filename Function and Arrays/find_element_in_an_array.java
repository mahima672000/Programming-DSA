/* first of all you will get a number n, which indicates the length of an array. 
Then you will get n more inputs corresponding to each index of the array.
After that you will be given one more input, d as data, for which you have to find,
at which index of array d is present. And in case d is not present in the array then you need to print -1. */

/*in case, a value equivalent to data is present more than once in a given array,
then the first index with value equal to data will be printed. 

in case, where value equivalent to data is not present in the array then, after control comes out of the for loop, -1 will be printed.
*/

/* there are two codes */
import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    int d = scn.nextInt();

    for (int i = 0; i < arr.length; i++) {
      if (d == arr[i]) {
        System.out.println(i);
        return; // so that the code stops after finding our i for the very first d
      }
    }
    System.out.println(-1);
  }

}

/* second code */
import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    int d = scn.nextInt();

    for (int i = 0; i < arr.length; i++) {
      if (d == arr[i]) {
        System.out.println(i);
        return;
      }else // i thought  if  & else both should be present but i was worng bcoz in this code what will happen is when there is if & else inside a for loop then 
        //it will be printed for all the iterations & the -1 condn means if there is no such d print -1 but if I will use else then -1 will be printed for all the i
        //therefore in code 1 we used return to stop the execution and wrote code for printing -1 outside the for loop with no else statement
      {
        System.out.println(-1);
      }
    }
    
  }

}
