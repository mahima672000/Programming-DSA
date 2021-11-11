/* In for loops, initiation, verification and increment are all done in the same statement.
The order in which these operations takes places are: 1. Initiation -> 2. Evaluation -> 3. Execution -> 4. Increment ->234.
The block of statements are executed only till the condition holds true.

The first part of statement is known as Initialization. (int i = 1), 
the second part is known as Evaluation . (i <= 10), 
the last part is known as increment. (i++)

*/

/* for loop */
for(int i = 1; i <= 10; i++){// 1. Initiation -> 2. Evaluation -> 3. Execution -> 4. Increment they are separated by ;
System.out.println(i);
}

/*  while loop */
int i = 1; // initialise variable
while(i <= 10){
System.out.println(i);
i++; // increment variable
}

/* do while loop */

int i = 1;
do{
System.out.println(i);
i++;
}while(i <= 10); 

/* In this loop, the block of statements are first executed and then the while condition is checked, 
just the opposite of while loop. In this loop, the block is executed at-least once as opposed by the other two loops. */

/* i++ and ++i is equivalent to i = i + 1.
i-- and --i is equivalent to i = i - 1.
i++ increments the value of 'i' by 1 but still uses the original value.
++i first increments the value of 'i' and then uses the value of the variable. */

/* Vimp -> int i = 10;
y = i++; // (Post increment)
In this case, the initial value of 'i' is 10. 
The variable y is then assigned the value of 'i' i.e. 10 and the increases the value of 10. 
The final values of 'i' and 'y' would be 11 and 10 respectively. */

/* this too will work */

import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    int i = 1;
    for( ;i <= 10; ){
    System.out.println(i);
    i++;
    }
  }
}
/* what's wrong */

import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    int i = 1;
    while(i <= 10); /*semicolon*/
    {
    System.out.println(i);
    i++;
    }
  }
}

