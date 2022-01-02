/* The biggest problem that we faced using strings was that we could not change a string after it was made. 
This property of strings was called immutability. The StringBuilder class resolves this problem, as these strings are mutable. */


StringBuilder sb = new StringBuilder();
//This creates an empty string builder and with an initial capacity of 16 characters

StringBuilder sb = new StringBuilder("Hello");
// This constructs a string builder initialized with the contents "Hello".

/* Some methods of StringBuilder :
sb.length()
would return the length (character count).

sb.charAt (int index)
Returns the character at specified index.

sb.setCharAt( int index, char ch)
Sets(over-writes) the character at specified index as content of ch.

sb.append( Object obj)
Appends the parameter passed as string. The obj can range from boolean, int, float, string, character, sequence of characters and anything.

sb.deleteCharAt (int idx)
Deletes a character at the specified index.

sb.delete(int start_idx, int end_idx)
Deletes the substring contained between the start and end index.

sb.replace(int start_idx, int end_idx, String str)
Replaces the substring contained between start and end index with the specified string str.

sb.toString()
Returns a string representing the contents of sb (StringBuilder object). */

import java.util.*;
public class Main {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello");
    System.out.println("String : " + sb);
    // 1.
    System.out.println("Length of string : " + sb.length());
    // 2.
    System.out.println("First character : " + sb.charAt(0));
    // 3.
    sb.setCharAt(0, 'h');
    System.out.println("String : " + sb);
    // 4.
    sb.append(" reader");
    System.out.println("String : " + sb);
    //5.
    sb.deleteCharAt(5);
    System.out.println("String : " + sb);
    // 6.
    sb.delete(0, 5);
    System.out.println("String : " + sb);
    // 7.
    sb.replace(4, 6, "ing");
    System.out.println("String : " + sb);
    // 8.
    String str = sb.toString();
    System.out.println("String : " + str);
  }
}


