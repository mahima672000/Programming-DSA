 # Memory Management in Strings and Immutable nature of Strings
 
 ## Memory Management in Strings
 There are majorly two types of memory associated with a program, that are stack memory and heap memory
 `only primitive data-types: Byte, Short, Int, Long, Double, Float, Char and Boolean are stored directly in stack memory
 `strings are non-primitive data types in Java,they are created in the heap memory and just a reference to this location is held by the stack memory
 `There is a special area or segment of heap memory known as intern pool , Strings in Java are created in this area known as intern pool
