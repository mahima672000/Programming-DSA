/* we are using logarithmic so as to decrease the time complexity of linear approach */

/* Hint: Try to think about the divide and conquer strategy. Try to divide the problem into fewer subproblems.*/

import java.io.*;

import java.util.*;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // taking multiple inputs
        int x =Integer.parseInt(br.readLine());
        int n =Integer.parseInt(br.readLine());
        int p =power(x,n);
        System.out.println(p);
    }
    public static int power(int x , int n){
        if(n==0){
          return 1;
        }
        if(n%2==0){
          return power(x,n/2)*power(x,n/2);
        }else
          return x*power(x,n/2)*power(x,n/2);//n/2 is not an integer since n is odd ....
          //BUT n/2 will automatically get floor value
          // since it is type casted to int...so that it is not n/2+n/2+1 = n+1 but actuallu it equals n.

          
    }   
} 
/* */
