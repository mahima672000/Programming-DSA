/* Given a string, print all palindromic substrings of it.
A substring of a string is a contiguous subsequence of that string, 
i.e. it can be formed by deleting 0 or more characters from start and end of the string.
A string is said to be a palindrome if the string read from
left to right is equal to the string read from right to left. 

abccbc 
palindromic substrings for this are -> a , b , c, cc, cbc , bccb

So the psuedo code or the approach would be ?
* Generate substrings
* check if the substring is palindrome or not
  -> two pointers i and j which will start from 0 and string"s size - 1, 
  and keep on incrementing i and decrementing j until they cross each other.   
  We will keep checking whether characters at index i and j are equal or not. At any point, if we find they are not equal (strings do not read the same from left and right), we will return false.
