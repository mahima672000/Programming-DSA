// collection of items of same data type (integer, character, strings, decimal numbers, boolean values, etc.)
//Arrays in Java are 0-indexed.
//
//int [] marks; this is the declaration of array

//marks = new int[5]; When we use 'new' to create an array, 
//Java reserves space in memory for it. This process is called memory allocation.

//int [] marks = new int[5];

/* assign value to arrays */
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int[] marks = new int[5];
    for (int i = 0; i < marks.length; i++) {
      marks[i] = scn.nextInt();
    }
  }
}
//marks.length gives us the length of the array

//Contiguous memory locations means that these memory
//locations are in continuation, not scattered throughout the memory.

/*Applications on Array :
Arrays store data elements of the same data type.
They are used to implement other data structures like Stacks, Queues, Heaps, etc. */

/*Disadvantages of using arrays:
You can't change the size of an array, once declared. */
