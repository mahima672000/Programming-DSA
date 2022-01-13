## Let's talk arrays first!

We have a stack and a heap present in the memory.

![image](https://user-images.githubusercontent.com/93143005/149341590-c94206dd-c601-466a-bde5-fdab18bf0dd9.png)
Suppose the heap is filled at positions where there are green areas and in between 
those 20 bytes are free at places as shown in the figure 2. If we want to make an arr of 
40 bytes then it won't be possible to do so because an array is continuous and continuous memory spaces are not available in this heap.

Had the memory been like shown in figure 3 then we would have been able to construct 
our desired array since 40 bytes are available continuously in the heap here.

![image](https://user-images.githubusercontent.com/93143005/149341661-63e54fbc-fafb-4ba9-bad1-fd99d8459272.png)

For this situation the array is formed in those 40 bytes as shown in the figure below and **the stack would have stored the address of the first element of arr , say 4k.**

![image](https://user-images.githubusercontent.com/93143005/149341695-416744fc-45d4-4898-b56b-aca1a59976a9.png)


## Let's talk about linked lists

For a linked list, had the memory in the heap not been contiguous as shown in figure 2, then we would not have had any problem in forming it.

![image](https://user-images.githubusercontent.com/93143005/149342099-c7baa6c5-b5ab-40d1-8f56-99dd007a32e1.png)
As you can see in the above figure, the list is "linked" despite that the memory is not continuous. 
Do you see those small squares with 2 compartments? They are called nodes.
**2 parts in a node: Data and Address of the next node.**

![image](https://user-images.githubusercontent.com/93143005/149343061-ee39b8f1-3d85-4239-bd49-3ffe4d8ffc70.png)
each element stores the address of the next element
As there are no more elements after the last node , therefore the address part of it is left "null".

**Also the stack stores the address of the first element of the linked list i.e. 4k.**
**a linked list is a non-continuous type of data structure**

## Disadvantage of Linked List over Arrays in terms of memory

Even though it is advantageous to use Linked Lists for space conservation in heap, we notice that since each node stores 2 values: data and address,
therefore each node requires 4bytes+ 4 bytes=8 bytes of memory. 
The memory used in arrays for each element was only 4 bytes. **Here, the space of linked lists is noticed to be more.**


