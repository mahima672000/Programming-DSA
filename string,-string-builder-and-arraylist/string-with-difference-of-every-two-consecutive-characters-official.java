/*1. You are given a string that contains only lowercase and uppercase alphabets. 
2. You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
   For "abecd", the answer should be "a1b3e-2c1d", as 
   'b'-'a' = 1
   'e'-'b' = 3
   'c'-'e' = -2
   'd'-'c' = 1 */

// my solution --->
import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
	    StringBuilder sb = new StringBuilder(str);
	    String ans = "";
	    for(int i = 0 ; i<sb.length-1;i++){
	        char ch1 = sb.charAt(i);
	        char ch2 = sb.charAt(i+1);
	        ans += ch1;
	        ans += (char)(ch2-ch1);
	        
	    }
	    return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}

//given solution -->

import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		StringBuilder ans = new StringBuilder();
		for(int i = 0 ; i < str.length(); i++){
			if(i + 1 < str.length()){
				int diff = str.charAt(i + 1) - str.charAt(i);
				ans.append(str.charAt(i));
				ans.append(diff);
			}else{
				ans.append(str.charAt(i));
			}
		}
		return ans.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}


                        
                                
