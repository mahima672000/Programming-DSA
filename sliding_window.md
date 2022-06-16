u can see this is as a two pointer approach also ..its just that there is some constant distance between the two pointers....or mostly if contagious/consecutive word is used there is high chances of using sliding window approach there.


Q. Given an array of integers, we have the task of finding the minimum sum from all subarrays of size k.

Input: {1,4,0,3,5,2,6,1}

k=2

Output: Minimum sum sub-array of size 2 is (0,3)

Sliding Window

    Calculate the sum of first k numbers and put it in sum

TADA! our first window’s sum is done

    Find the sum in each window by
        Removing stale data from last window i.e array[current_start-1]
        Adding fresh data i.e array[previous_end+1]
        Thus, sliding the window
    We find the minimum of the sum from all the windows
    
    Problem done in O(n) time.
    
 ```
 import java.util.*;
public class brute
{
  public static int maxk(int nums[],int k,int n)
  {
    //If the array does not contain k elements it is not eligible
    if(n<k)
      return -1;
    //Declaring the minimum
    int min=0;
    //Finding the sum of first k elements
    for(int i=0;i<k;i++)
      min=min+nums[i];
    int cur=min;
    //As the sliding window moves 
    //We move the start and end index by 1
    for(int i=k;i<n;i++)
    {
      //Thus we remove the initial index value
      cur=cur-nums[i-k]+nums[i];
      //And add the current index value
      min=Math.min(cur,min);
    }
    return min;
  }
  public static void main(String args[])
  {
    int a[]={1,1,0,3,2,2,6,1};
    int k=5;
    int n=a.length;
    int ans=maxk(a,k,n);
    System.out.println(ans);
  }
}
```
