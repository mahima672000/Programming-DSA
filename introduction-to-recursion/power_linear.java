/*Given a number x, and another number n, you are required to calculate x raised to the power n i.e. x multiplied n times.*/

import java.io.*;

import java.util.*;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // taking multiple inputs
        int x =Integer.parseInt(br.readLine());
        int n =Integer.parseInt(br.readline());
        int p =power(x,n);
        System.out.println(p);
    }
  
    public static int power(int x , int n){
        if(n==0){
         return 1;
        }
    return x*power(x,n-1);
    }   
} 
/* */
