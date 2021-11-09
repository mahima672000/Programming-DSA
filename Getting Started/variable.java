/* 
To declare a variable you need to know it's data type as well.

When you declare a variable, say, int x = 10; a location in computer's RAM is named x and 10 is stored in it.

/ gives quotient and % gives remainder.

There is no BODMAS. *, %, / have equal priority and higher than + and - which are equal to each other.

Among operators with equal prirority, generally the one on the left is executed first.

use parenthesis to over-ride order of execution of operators.

The first part of statement is known as Initialization. (int i = 1), the second part is known as Evaluation . (i <= 10), the last part is known as increment. (i++) */

/* There is no operator for exponentiation. 2 ^ 3 is not 8. This is XOR operator. We'll do it later.

To do exponentiation use Math.pow function. */

import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    System.out.println(Math.pow(2, 3));
  }
}

/* or */

import java.util.*;


public class Main {

  public static void main(String[] args) throws Exception {
  int exp = (int)Math.pow(2, 3);
  System.out.println(exp);
    
  }

}
