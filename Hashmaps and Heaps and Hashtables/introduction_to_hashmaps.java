/* A hashmap is a data structure which has an amazing property that most of the operations which we perform on it are done in O(1) time complexity.  
 The data is stored in a hash-map in the form of key-value pairs.
 We can have any combination of data types when we talk about hashmaps
 different keys can have the same values*/

import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args)
  {
    HashMap< String, Integer> hm = new HashMap< >();
    System.out.println(hm);
  }
}

/* We can use the put(key,value) function to put some values into the hashmap. There are two possible cases while we are using the put(key,value) function in a hashmap.

The key is not present: If the key is not present in the hashmap it will get inserted.
The key is already present: If the key is already present, we cannot insert the same key again. The value of the existing key will get updated in the hashmap. */

/*The hashmap has changed the order in which we inserted the data into it. This is something that we cannot control in a hashmap. */

/* We can use the get(key) function in a hashmap to get the value corresponding to a particular key in the hashmap. There can be two possible cases for this:

If the key exists: If the key exists, you will get the value of that key by using this function.
If the Key doesn't Exist: If the key doesn't exist, this function will return null. */

import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args)
  {
    HashMap< String, Integer> hm = new HashMap< >();
    hm.put("India", 1391);
    hm.put("China", 1398);
    hm.put("USA", 329);
    hm.put("Indonesia", 268);

    //Printing the get(key) when key exists
    System.out.println("Value for India " + hm.get("India"));

    //Printing the get(key) when kkey doesn't exist
    System.out.println("Value for Utopia " + hm.get("Utopia"));

  }
}

/* containsKey - is a Boolean function. We pass a particular key value as a parameter to this function.
If the hashmap contains that key, it returns true else it returns false. */

/* We can get keys in a hashmap by using the keySet() function. The key set function returns the set of all the keys in a hashmap. */

import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args)
  {
    HashMap< String, Integer> hm = new HashMap< >();
    hm.put("India", 1391);
    hm.put("China", 1398);
    hm.put("USA", 329);
    hm.put("Indonesia", 268);

    Set< String> keys = hm.keySet();  //LINE 79 & 95 ....u can replace hm.keySet with keys in line 95...& ya line 75 tells how we declare a set.
    System.out.println(keys);
  }
}

/* How is this keySet() function useful to us? Well, we can apply a loop on the hashmap using this.*/

import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args)
  {
    HashMap< String, Integer> hm = new HashMap< >();
    hm.put("India", 1391);
    hm.put("China", 1398);
    hm.put("USA", 329);
    hm.put("Indonesia", 268);

    //Using keySet() to iterate through the hashmap
    for (String key : hm.keySet())
    {
      Integer val = hm.get(key);
      System.out.print(key + ":" + val + "  ");
    }
  }
}



