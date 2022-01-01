# Introduction
In Java, string is an **object** that represents an **array** or a **sequence of characters**. 

A character (char) is a primitive-data type, 
whereas string in java is actually a **non-primitive data** type, because **it refers to an object.**

The String object has **methods** that are used to perform certain operations on strings.

Name of the data type used to declare a string is "**String**" and not "string".

# Declaration

## Using **String** **Literal**: String literal is created by using **double** **quotes**.
**String s= ""; // declaration of an empty string**

![image](https://user-images.githubusercontent.com/93143005/146854408-68509507-10d2-4b48-96a1-ad9e0ea7ac52.png)

## Using **new** keyword
![image](https://user-images.githubusercontent.com/93143005/146854514-ee8d0a75-dff8-4927-b441-5348c93842b0.png)

# Input
scn.next(): It will read the input until space (" ") or end-of-line has occurred.
scn.nextLine(): It will read the input until end-of-line has occurred.

scn.next(): It will read the input until space (" ") or end-of-line has occurred.
scn.nextLine(): It will read the input until end-of-line has occurred.

# In-Built (Methods) Functions in Strings(Provided by Java)
* int length() --> str.length()
It returns the length of the string

* char charAt(int index)
str.charAt(5) will return the character at index = 5, (in 0-based indexing)

{Index passed should be a valid index (from 0 to length of string - 1), otherwise it will give IndexOutOfBound Exception}

**STRINGS ARE IMMUTABLE IN JAVA**

We cannot set/modify any character of a string by modifying str.charAt(index). 
(It will give an error that str.charAt(index) is not a variable but a value).

* String str.substring(int start_index, int end_index)
A substring of a string is a contiguous section of characters from the string.
This method will return a substring of string, from the start_index till end_index - 1 **(i.e. it will not include the end_index).**

{Note: If starting index will be the same as ending index, then since substring() method does not include ending index in substring, it will return an empty string "".
Note: If the ending index is taken less than the starting index, then it does not represent a valid substring, (For eg, "ba" is not a substring of "abc".) Hence, it will give OutOfBoundException.
Note: If we will not pass the ending index, and make a call to substring() method with only 1 parameter (starting index), then it will return the substring starting from start_index and upto the string's length, hence end_index will get default value as str.length().}

* Concatenate Two Strings
We can concatenate two strings using the "+" operator.
Interesting part is, we can even concatenate an integer to the string.

![image](https://user-images.githubusercontent.com/93143005/146860189-203d1b19-13b5-4406-acf8-b480b3ad8f87.png)

![image](https://user-images.githubusercontent.com/93143005/146860198-7fe20ad9-44dd-4363-b85f-0db94f2e6349.png)

* String[] split(String regex)
 ![image](https://user-images.githubusercontent.com/93143005/146860398-87cedee2-c8d5-4930-95ef-b0e51ce79e35.png)

words is an array of strings which will contain each space-separated word of the string { "We", "are", "learning", "strings"}.
Note: Since, words is an array of string (and not string), hence we have used words.length and not words.length().

We can even separate/split the string based on "," or any other regular expression. 
But, please keep in mind, that parameter that split expects is a string and not a character.


*********************************Question*********************************
![image](https://user-images.githubusercontent.com/93143005/146866388-9ef6fd66-f40f-43d8-8bff-959390c3fbce.png)
In Java, expressions are read from left to right (for +, -, *, / operators etc.), i.e. + is said to have left to right associativity.

1st output -> Hello1020
2nd output -> 30Hello





