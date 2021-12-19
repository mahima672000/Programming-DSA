/* display arrays not in iterative way but in recursive way 
In general, BufferedReader comes in handy if we want to read text from any kind of input source whether that be files, sockets, or something else.
we could use the Scanner class to achieve the same functionality as with BufferedReader.

there are significant differences between these two classes which can make them either more or less convenient for us, depending on our use case:

BufferedReader is synchronized (thread-safe) while Scanner is not
Scanner can parse primitive types and strings using regular expressions
BufferedReader allows for changing the size of the buffer while Scanner has a fixed buffer size
BufferedReader has a larger default buffer size
Scanner hides IOException, while BufferedReader forces us to handle it
BufferedReader is usually faster than Scanner because it only reads the data without parsing it
With these in mind, if we are parsing individual tokens in a file, 
then Scanner will feel a bit more natural than BufferedReader. But, just reading a line at a time is where BufferedReader shines.*/

import java.io.*;
import java.util.*;

public class Main{
  public static void main(String []args)throws Exception{
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    
    for(int i=0;i<n;i++){
      arr[i] = scn.nextInt();
    }
    displayArr(arr,0);
  }
  
  public static void displayArr(int[] arr, int idx) {
    if (idx == arr.length) return;

    System.out.println(arr[idx]);
    displayArr(arr, idx + 1);
  }

}

/*
Time Complexity :
O(n)

Let"s try to understand our time complexity. Since we are making at most n recursion calls and in each call
we are performing O(1) operations (printing a data is constant time) so our overall time complexity is n*O(1) = O(n).

SPACE COMPLEXITY :
O(n)

Also, we know for each recursion call the parameters,
address of the array are stored in the runtime stack, and since the recursive call 
stack is of n length it will also take n space in the stack. Although we are not using any array the space complexity will be O(n).

Doubt - how we are not using array ????*/
