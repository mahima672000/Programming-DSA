/* What is an Array?
We say that it is a data-structure, which is a collection of similar data-types which are arranged in a contiguous memory. 
we have to define the size of an array for creating an array in the memory. But, we do not have to define the size of an Arraylist.
This is the major difference between an array and an arraylist.

the size is automatically adjusted by the arraylist. We can enter as many elements as we want, 
the arraylist will manage the size by it-self. (Obviously "as-many" also has a limit of the memory).
 
 Size of an array or an Arraylist is the number of elements that are currently present in it and
 the capacity is the total number of elements that can be present inside the array/Arraylist.
 
 the array list manages the size itself. It actually doubles the total capacity of the list.
 
 The initial size of Arraylist is 0 as it is empty and the initial capacity of an Arraylist in Java is 10.
 
 */

/* Arraylist declaration */

import java.io.*;

import java.util.*;

public class Main {


  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    ArrayList<Integer>a1 = new ArrayList<>(); //declares an arraylist of integers
    ArrayList<String>a2 = new ArrayList<>(); //declares an arraylist of strings
  }
}

/* Size() of an Arraylist */
import java.io.*;

import java.util.*;

public class Main {


  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    ArrayList< Integer> al = new ArrayList< >(); //declares an integer arraylist
    Arraylist< String> a2 = new Arraylist < >(); //declares an arraylist of string
    System.out.println(a1.size());


  }

} //if list is empty size will be displayed as zero

/* Add() in Arraylist */
//The add() function adds an element at the end of the list. We can also add the element at a particular index using add() function.
import java.io.*;

import java.util.*;

public class Main {


  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    ArrayList< Integer> al = new ArrayList< >(); //declares an integer arraylist
    Arraylist< String> a2 = new Arraylist < >(); //declares an arraylist of string
    System.out.println(a1.size());

    a1.add(10);
    a1.add(20);
    a1.add(30);
    a1.add(1, 1000); //Adds 1000 at index 1
  }
}

/* Display an Arraylist: */
//There are various methods to display an Arraylist. We can display it using loops as well as directly using the System.out.print() .
import java.io.*;

import java.util.*;

public class Main {


  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    ArrayList< Integer> al = new ArrayList< >(); //declares an integer arraylist
    Arraylist< String> a2 = new Arraylist < >(); //declares an arraylist of string
    System.out.println(a1.size());

    a1.add(10);
    a1.add(20);
    a1.add(30);

    System.out.print(a1);  //prints the entire list at one go

    for (int x : a1)
    {
      System.out.println(x); //each element belonging to a1 will get printed
    }

  }

}

/* Get() in Arraylist */
//For getting the value at a particular index in Arraylist, we use the get function.

import java.io.*;

import java.util.*;

public class Main {


  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    ArrayList< Integer> al = new ArrayList< >(); //declares an integer arraylist
    Arraylist< String> a2 = new Arraylist < >(); //declares an arraylist of string
    System.out.println(a1.size());

    a1.add(10);
    a1.add(20);
    a1.add(30);

    System.out.print(a1);  //prints the entire list at one go

    for (int x : a1)
    {
      System.out.println(x); //each element belonging to a1 will get printed
    }

    int val = a1.get(1); //gets the value at index 1
    System.out.println(val);

    for (int i = 0; i < a1.size(); i++)
    {
      System.out.println(a1.get(i));  //printing using get()
    }

  }

}

/*Set() in Arraylist*/
//For changing the value at a particular index we use the set() function.

import java.io.*;

import java.util.*;

public class Main {


  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    ArrayList< Integer> al = new ArrayList< >(); //declares an integer arraylist
    Arraylist< String> a2 = new Arraylist < >(); //declares an arraylist of string
    System.out.println(a1.size());

    a1.add(10);
    a1.add(20);
    a1.add(30);
    a1.add(1, 1000); // adds 1000 at index 1

    System.out.print(a1);  //prints the entire list at one go

    for (int x : a1)
    {
      System.out.println(x); //each element belonging to a1 will get printed
    }

    int val = a1.get(1); //gets the value at index 1
    val = 10;

    for (int i = 0; i < a1.size(); i++)
    {
      System.out.println(a1.get(i));  //printing using get()
    }

    a1.set(1, 2000); //changes the value at index 1 to 2000;

  }

}

/* Remove() in Arraylist */

//Remove() function is used to remove an element from a particular index.

import java.io.*;

import java.util.*;

public class Main {


  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    ArrayList< Integer> al = new ArrayList< >(); //declares an integer arraylist
    Arraylist< String> a2 = new Arraylist < >(); //declares an arraylist of string
    System.out.println(a1.size());

    a1.add(10);
    a1.add(20);
    a1.add(30);
    a1.add(1, 1000); // adds 1000 at index 1

    System.out.print(a1);  //prints the entire list at one go

    for (int x : a1)
    {
      System.out.println(x); //each element belonging to a1 will get printed
    }

    int val = a1.get(1); //gets the value at index 1
    val = 10;

    for (int i = 0; i < a1.size(); i++)
    {
      System.out.println(a1.get(i));  //printing using get()
    }

    a1.set(1, 2000); //changes the value at index 1 to 2000;

    a1.remove(1) //removes the value at index 1

  }

}
