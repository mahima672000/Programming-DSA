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


## Q) But, why does Immutability occur in the first place?
Let us assume, if you were allowed to modify the instance of string, i.e. modify the character array {h, e, l, l, o} in the intern pool, then what would have been the consequences?

Since the character array at 4k location is pointed by more than 1 string, modifying the character array itself would have led to modification of all the strings which are pointing it.

For example), if we would have changed s1's character at 3rd index to say 'd', then character array would have been modified to {h, e, d, l, o}, hence the character at 3rd index for the string s2 would also have changed to 'd'.

This can be a surprise to the developer who does not know about the existence of string s1, but is working on a module which uses string s2. He would wonder why s2 has become "hedlo", but he himself initialized it to "hello".

Thus, to avoid such surprises, it is not allowed to modify the instance of strings in Java. Strings are immutable in java as an immediate cause of string interning.

## Q) What is the impact of Immutability?
Immutability can lead to low performance issues, both in terms of space and time. Consider the following example:

![image](https://user-images.githubusercontent.com/93143005/147865542-82b3faff-87c0-47c0-9151-e3412e7bf1c4.png)

What do you think will be the time complexity of the above code? Will it be O(n), as we are adding only 1 character n times?

No, the time complexity of the above piece of code is as bad as O(n2). As we have discussed earlier, that instance of string cannot be modified, hence adding a character to the end of string does not mean it will get appended in the end of the character array.

Instead, even if a single character is appended, firstly JVM will create a new string object, copy all of the characters present to the new string, and then append the single character to the newly created string object. Hence we are first copying the entire string which is O(n) work even for appending a single character.

And since we are appending single character for n times, the overall time complexity will turn out to be O(n * n) = O(n2).

For example) to add character 'd' to string s = "hello", we have to first make a new string object, then copy all characters {h, e, l, l, o} to the new string and append 'd' to the new string. Hence we are not operating on 1 character, but s.length() + 1 characters.

So, consider if the current string is taking 2GB space in memory, then adding a single character will lead to creation of a copy of the string of entire 2GB and appending 1 character (of few byte(s)) to it.

 
 
