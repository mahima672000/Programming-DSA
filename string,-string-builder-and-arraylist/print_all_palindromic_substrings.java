/* Given a string, print all palindromic substrings of it.
A substring of a string is a contiguous subsequence of that string, 
i.e. it can be formed by deleting 0 or more characters from start and end of the string.
A string is said to be a palindrome if the string read from
left to right is equal to the string read from right to left. 

abccbc 
palindromic substrings for this are -> a , b , c, cc, cbc , bccb
**a,b,c are also palindromic**

So the psuedo code or the approach would be ?
* Generate substrings
* check if the substring is palindrome or not
  -> two pointers i and j which will start from 0 and string"s size - 1, 
  and keep on incrementing i and decrementing j until they cross each other.   
  We will keep checking whether characters at index i and j are equal or not. At any point, if we find they are not equal 
  (strings do not read the same from left and right), we will return false.
  
  If pointers cross each other, it means that all the characters from left & right were equal. Hence return true. */
  
  import java.io.*;
  import java.util.*;
  
  public class Main{
    public static void main(String[]args){
      Scanner scn = new Scanner(System.in);
      String str = scn.next(); // since we are not inputing a sentence but a single string
      solution(str);
  }
  
  public static void solution(String str){// generate substrings
    for (int i = 0 ; i < str.length(); i++) {
      for (int j = i + 1; j <= str.length(); j++) {
        // i -> starting point of substring, j-> ending point of substring
        if (isPalindrome(str.substring(i, j))) {
          System.out.println(str.substring(i, j));
        }
      }
    }
  }
    
  public static boolean isPalindrome(String str){
    int i=0;
    int j=str.length()-1;
    while (i < j) {
      if (str.charAt(i) != str.charAt(j)){ 
        return false; // even if this condn got true for a single i ,j it will return false & code stops there no increment decrement
      }
      i++;
      j--;
    }
    return true; // if the above loop runs for all i,j without returning false  it will return true
  }
  
    
  /*Time Complexity :
Why O(n^3) Time?

We are running the outer loop from 0 to n-1 which takes O(n) and the inner loop from i to n-1, which will again take O(n).

Now, we are generating a substring from i to j, and checking whether it is a palindrome also takes O(j-i) = O(n) time.

Hence, the overall time complexity turns out to be O(n * n * n) = O(n^3) time.

SPACE COMPLEXITY :
O(n) auxiliary space is required as we are passing the substring from i to j to isPalindrome function. */
    
    
    
 
    
  
      
      
