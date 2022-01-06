/*you are given a number n, representing the size of array a. After that you are given n numbers, representing elements of array a.

You are required to return an array which consists of "next greater element to the right" corresponding to all elements of the array. */





/* First of all we define an answer array which stores the next greater element at corresponding index to given array, nge[] and a stack st.
We traverse the given array in reverse order and push the last element in the stack.
And since there is no right element for the last element, we simply store -1 at the last index of the answer array, nge.
Now moving to the second last element, we check our stack whether the topmost element is smaller or greater than the present element.
If it's smaller than the present element then we pop out those elements of the stack until we get an element which is greater than this. 
And when we get a greater element we store this element corresponding to the present element in nge and push the present element in our stack.
However while popping out smaller elements from our stack, if the stack gets emptied out then we store -1 corresponding to the present 
element in nge and push the present element in our stack. */

import java.util.*;
import java.io.*;

public class Main{
  public static void main(String []args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i<n ;i++){
      a[i] = Integer.parseInt(br.readLine());
    }
    int[]nge = solve(a);
    display(nge);
  }
  
   public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }
  
  public static int[] solve(int[] arr){
   Stack<Integer> st = new Stack<>();
    nge[arr.length-1] = -1;
    st.push(arr[arr.length-1]);
    
    for(int i = arr.length-2 ; i>=0 ;i--){
      while(st.size()>0&&
   return null;
 }

}
    
