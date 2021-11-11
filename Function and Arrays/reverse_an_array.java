/* ITERATIVE APPROACH
Take two variables: Take a variable 'i' at the 0th index and j at the end of the array.
Swap: Swap the values arr[i] and arr[j] and increment i and decrement j. 
Keep up this procedure till i< j and the array will be reversed.*/
import java.io.*;

import java.util.*;

public class Main {//main class
  public static void display(int[] a) { //display function
    StringBuilder sb = new StringBuilder(); //string builder

    for (int val : a) {
      sb.append(val + " "); //append the new value of a
    }
    System.out.println(sb);
  }

  public static void reverse(int[] a) { //reverse function

    for (int i = 0, j = a.length - 1, i < j; i++, j--)
    {
      int temp = a[i]; //swaping
      a[i] = a[j];
      a[j] = temp;
    }
  }

  public static void main(String[] args) throws Exception { //main function
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine()); //reading input
    int[] a = new int[n]; //initialise a
    for (int i = 0; i < n; i++) {//input a
      a[i] = Integer.parseInt(br.readLine());
    }

    reverse(a);//return reverse a
    display(a);//display the reversed a
  }

}

/*What is the Time and Space Complexity of this method?

Time Complexity :
O(n) since we have traversed the entire array once.

SPACE COMPLEXITY :
O(1) since we have not used any extra language.
*/


/* OTHER APPROACH (NOT RECURSION) */

/*Create an Auxiliary Array: Create an array of the same size as that of the input array.
Fill the Auxiliary Array: Fill this array by taking the variable at the end of the input array and traversing in reverse direction.
Fill back the original Array: Now copy all the elements back to the original array as it is from the Auxiliary array and the input array has been reversed. */


import java.io.*;

import java.util.*;

public class Main {//main class
  public static void display(int[] a) { //display function
    StringBuilder sb = new StringBuilder(); //string builder

    for (int val : a) {
      sb.append(val + " "); //append the new value of a
    }
    System.out.println(sb);
  }
  

public static void reverse(int[] a) {

    int [] b = new int[a.length];

    for (int i = a.length - 1, j = 0; i >= 0; i--, j++)
    {
      b[j] = a[i];//filled array in reverse order
    }

    for (int i = 0; i < a.length; i++)
    {
      a[i] = b[i];//filling back the original array 
    }
  }
  
    public static void main(String[] args) throws Exception { //main function
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine()); //reading input
    int[] a = new int[n]; //initialise a
    for (int i = 0; i < n; i++) {//input a
      a[i] = Integer.parseInt(br.readLine());
    }

    reverse(a);//return reverse a
    display(a);//display the reversed a
  }

}
