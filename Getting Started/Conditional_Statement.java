import java.util.*;


public class Main {

  public static void main(String[] args) throws Exception {

    int x = 10;

    if (x % 2 == 0) {
      System.out.println("The number is even");
    } else {
      System.out.println("The number is odd");
    }
    System.out.println("always executed because it is not inside any conditional statement hehe");
  }

}
/* according to this program that we have written above, it will display that 0 is even but 0 is neither even nor odd */

/* NESTED IF ELSE ( IF ke andar IF)*/
import java.util.*;


public class Main {

  public static void main(String[] args) throws Exception {

    int x = 11;

    if (x % 2 == 0) {

      if (x == 0) {
        System.out.println("Neither Even Nor Odd");  /* 0 comes under x%2==0 */
      } else {
        System.out.println("The number is even");
      }

    } else {
      System.out.println("The number is odd");
    }
    System.out.println("always executed because it is not inside any conditional statement hehe");
  }

}

/* IF ELSE IF (IF ELSE IF)*/

import java.util.*;


public class Main {

  public static void main(String[] args) throws Exception {

    int x = 11;
    if (x == 0) {
      System.out.println("Neither even Nor Odd");
    } else if (x % 2 == 0) {
      System.out.println("The number is even");
    } else {
      System.out.println("The number is odd");
    }
    System.out.println("always executed because it is not inside any conditional statement hehe");
  }

}



