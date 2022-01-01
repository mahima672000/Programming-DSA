 # Memory Management in Strings and Immutable nature of Strings
 Two major impacts of string interning  are the unexpected result in String comparisons and it makes Strings Immutable.
 ## String comparison error
 There are majorly two types of memory associated with a program, that are stack memory and heap memory.
 `only primitive data-types: Byte, Short, Int, Long, Double, Float, Char and Boolean are stored directly in stack memory`
 
 
 `strings are non-primitive data types in Java,they are created in the heap memory and just a reference to this location is held by the stack memory`
 
 
 `There is a special area or segment of heap memory known as intern pool , Strings in Java are created in this area known as intern pool`
 
 ![image](https://user-images.githubusercontent.com/93143005/147848786-3b326178-a206-44d5-b1e7-39bb55a0f002.png)
![image](https://user-images.githubusercontent.com/93143005/147848962-7ff0aac9-d234-4b2c-b2de-9afd1b9696a3.png)
![image](https://user-images.githubusercontent.com/93143005/147848967-e39adf17-0bf4-42f8-b6ee-ebd11d0e1ea7.png)
![image](https://user-images.githubusercontent.com/93143005/147848993-59373ffb-15d9-4291-b2cd-e78d6bce52c5.png)

 
 
