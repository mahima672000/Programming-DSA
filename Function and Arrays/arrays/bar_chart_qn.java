import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Bufferedreader br = new BufferedReader
    int n = Integer.parseInt(br.readLine());
    int[]arr = new int[n];
    for (int i=0; i<n; i++){
      arr[i] = Integer.parseInt(br.readLine());
      }
      
    int max = Integer.MIN_VALUE; // intialising the maximum 
    for (int i = 0; i < n; i++) {
      max = Math.max(max, arr[i]); // maximum is maximum  of arr[i]
    }
    for (int i = 0; i < max; i++) { // outerloop for all floors
      for (int val : arr) { // val belonging to arr ie arr elements not using arr[i] coz outer for loop is using i for iteration
        if (val >= max - i) {
          System.out.print("*	");
        } else {
          System.out.print("	");
        }
      }

      System.out.println();
 }

}
  
  /*BUT while we are taking elements of array as input why not , find out the max of array that time only so to further simplify the code */
  
  import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];

    int max = Integer.MIN_VALUE;
    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
       max = Math.max(max, arr[i]);
    }

    for(int i = 0; i < max; i++){
       for(int val: arr){
         if(val >= max - i){
            System.out.print("*\t");
         } else {
            System.out.print("\t");
         }
       }

       System.out.println();
    }
 }

}


                        
                        
                        
                        
                                
