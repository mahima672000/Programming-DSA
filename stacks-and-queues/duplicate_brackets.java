/* You are given a string exp representing an expression.
Assume that the expression is balanced i.e. the opening and closing brackets match with each other. There is always a closing bracket for each opening bracket.
But, some of the pairs of brackets may be extra/needless. You are required to print true if you detect extra brackets and false otherwise.

Example

((a + b) + (c + d)) -> false: There is no redundant or duplicate braces found
(a + b) + ((c + d)) -> true: There is a pair of redundant or duplicate braces around c+d. */

//When does a pair of brackets can be said as redundant or duplicate?
/*In the first test case, if you will see that, for each pair of brackets, there is at least one character inside the brackets corresponding to the pair.

There is one '+' character for pair (1), three characters 'a', '+', 'b' for pair (2) and three characters 'c', '+', 'd' for pair (3).

Hence, no pair is redundant or duplicate.

But in the second test case,
you can see that although there are 3-3 characters each corresponding to the pairs (1) and (3), 
there is no character corresponding to pair (2). Hence this pair (2) is redundant/duplicate.

Although characters {c, +, d} are inside the pair (2), they do not belong exclusively to the pair (2), 
but instead belong to pair (3). Hence, each character can belong to only 1 pair of brackets. */

/* We can use the stack data structure to check whether there exists at least one character exclusively between each pair of brackets or not.

Initialize an empty stack of characters st.
Iterate over the expression string and pick the current character at index i.
If the current character is not ')', {can be any alphabet, digit, '(' opening bracket or arithmetic operator}, then:
Push the character into the stack
Else, {current character is ')'}
Check if the character at the top of the stack is '(' or not.
If it is '(', then return true (as pair of redundant bracket is found)
Else, (there is at least 1 character b/w the current pair)
Pop characters from the stack until you get '(' opening bracket at the top.
Pop the opening bracket '(' as well.
If all characters are traversed, and no duplicate bracket is found, then return false.
Q) You may think that we are not even checking whether the stack is empty or not before checking whether the top element is '(' or not. But why so?

R) This is because the input expression is balanced. It means before every ')' closing bracket, there will be at least one
'(' opening bracket for sure. Hence, we cannot get a string like ")(", because this is not balanced. */


import java.io.*;
import java.util.*;

public class Main{
  public static void main(String [] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    
    Stack<Character> st = new Stack< >();
    for(int i=0 ; i<str.length(); i++){
      char ch = str.charAt(i);
      if(ch!=')'){
        st.push(ch);
      }else if(st.peek() == '('){
        return true;
      }else {while(st.peek() != '('){
        st.pop(); // pop until ( is found
          }
        st.pop(); //pop ( too !
        }
    }
  }
}
