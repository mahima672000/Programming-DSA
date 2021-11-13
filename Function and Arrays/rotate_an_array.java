/* Given an input number N and we will have N numbers following it as the input. We are also given an integer K. 
We have to rotate an array K values to the right if K is positive and K values to the left if K is negative. If K=0, do not rotate the array. */


/*Deciding K Value: If the value of K is positive, K=K%N where N is the length of the input array. If the value of K is negative, K=K%N + N.

Revering Parts of Array: After we have calculated the value of K, reverse the first part of the array i.e. from 0 to N-K-1 and the second part from N-K to N-1 separately.

Reverse the entire Array: Now, reverse the entire array i.e. from 0 to N-1. The array will be rotated according to the value of K. */

/* K<N
   case-1 K>0
   rotate it with K only
   
   case-2 K<0
   rotate it with
