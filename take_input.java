/*There are 5 basic tools for programming:

Console Output ( Display on monitor)
Variable declaration (and Initialization)
Conditional Statements ( If-else-then)
Creating loops ( for, while , do-while)
Console Input ( Taking input from keyboard) */

/* input integer */
import java.util.*;


public class Main {

  public static void main(String[] args)

  {

    Scanner scn = new Scanner(System.in); //This lines helps take input from keyboard

    int i = scn.nextInt();  //This line stores that input(integer) inside a integer variable

  }

}

/* input string */
import java.util.*;


public class Main {

  public static void main(String[] args)

  {

    Scanner scn = new Scanner(System.in);

    String name = scn.nextLine();

    System.out.println("Hello" + name);

  }

}

/* for taking both int & string */
import java.util.*;


public class Main {

  public static void main(String[] args)

  {

    Scanner scn = new Scanner(System.in);

    int i = Integer.parseInt(scn.nextInt());

    String name = scn.nextLine();

    System.out.println("Hello" + name);

    System.out.println("Here is the counting:");

    for (int j = 0; j <= i; j++)

    {

      System.out.println(j);

    }

  }

}

/* "nextInt()" method does not read the newline character of our input, 
so when the "nextLine()" command is issued, 
the scanner object finds the new line character and gives you that as output.
Integer.parseInt() function because this function reads the input as a string including 
the newline character and then returns to the variable an integer value, resolving the issue of input.
*/


