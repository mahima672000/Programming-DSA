/*
Memory has two parts.
1.Stack
2.Heap

int arr[]; It only creates a variable in the stack and has value null by default.

 but if we do arr = new int[5]; we allocate memory like this , Then to store 5 ints a memory gets allocated in the heap.
 They will have their own address. For the time being let's assume the addresses start from 4000.
 Now, these allocated memory units are contiguous, hence they will be spaced out by the same distance. 
 
 new -> this is responsible for new heap 
 
 int i = 0 ..memory will be allocated from stack only reason being this is primitive data type unlike arr which is non-primitive.
 
  For primitive data types, both the name and value are stored in the stack. 
  But for non-primitive, the name is stored in the stack, but the actual memory is allocated inside the heap, 
  only the first address is stored under the name in the stack.
  
  Java sees arr as 4000 because that is the value that is stored in the stack
  
  */

//Appplications
//1.Performance - arr[500]=7, arr[700]=7. Which one do you think will take more time? 
//Both will take the same time because in both cases we know the exact memory location.

//2.Assignment -
// int arr[] one = new int[3];
//one[0]=10;
//one[1]=20;
//one[3]=30;

//int[]two = one;
//two[1]=200;
// both one and two will print 10, 200, 30, then you are absolutely correct.

//bcoz heap is only one there ..since int[]two will only create stack for two and shallow copy will be done for heap ..not  deep copy
//deep copy would have been there if new was used again 
//Heap will only allocate new memory space only if you use the new keyword.
//Otherwise, a simple shallow copy will take place.

//3.Functions: When we pass arrays as a parameter to a function only shallow copy takes place.
//And if any changes occur inside the function then the changes will be reflected everywhere.
 
