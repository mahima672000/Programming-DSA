/* Linear search method would be very hectic.

Binary Search is applied only on sorted arrays. 

we mark a "lo" and a "hi" pointer at the start and end indices of the array and find a "mid" index by taking the average of "lo" and "hi" i.e. mid=(lo +hi)/2.
If we find the required element at the mid index then hooray!, we terminate the program else we accordingly change the values of lo and hi .

In conclusion, if the value to be searched is "d" ,

Then three cases arise.

Case I : d< mid ?? hi=mid-1 , lo remains same

Case II :d>mid ??lo=mid+1, hi remains same

Case III :d=mid ?? return true and terminate the program. */

import java.io.*;

import java.util.*;

public class Main {//main class

  public static void main(String[] args) {//main fn
    int[]arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};//input known array
    int data = 70;//data to search
    int l = 0;//intialize low
    int h = arr.length - 1;//initialize high

    while (l <= h) {//use of loop coz we have to keep searching till we found m for our data=arr[m]
      int m = (l + h) / 2;
      if (data > arr[m]) {
        l = m + 1;
      } else if (data < arr[m]) {
        h = m - 1;
      } else {
        System.out.println(m);
        return;
      }
    }
    System.out.println(-1);
  }
}

/* Time Complexity:
O(log2n)

The time complexity of the binary search algorithm is O(log2n).*/
