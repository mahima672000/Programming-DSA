/* 
Bit Shift Operators

Shift operator is used in shifting the bits either right or left. 
We can use shift operators if we divide or multiply any number by 2. The general format to shift the bit is as follows:




Java provides the following types of shift operators:

    Signed Right Shift Operator or Bitwise Right Shift Operator
    Unsigned Right Shift Operator
    Signed Left Shift Operator or Bitwise Left Shift Operator

Note: Java does not support the unsigned left shift operator (<<<). */


/* 

Signed right shift operator--

The signed right shift operator shifts a bit pattern of a number towards the right with a specified number of positions and fills 0. 
The operator is denoted by the symbol >>. It also preserves the leftmost bit (sign bit). If 0 is presented at the leftmost bit, 
it means the number is positive. If 1 is presented at the leftmost bit, it means the number is negative.

In general, if we write a>>n, it means to shift the bits of a number toward the right with a specified position (n). 
In the terms of mathematics, we can represent the signed right shift operator as follows:

b = a>> n & b = a/2raised to n

Note: When we apply right shift operator on a positive number, we get the positive number in the result also. Similarly, 
when we apply right shift operator on a negative number, we get the negative number in the result also.


Signed Left Shift Operator (<<) ---

The signed left shift operator (<<) shifts a bit pattern to the left. 
It is represented by the symbol <<. It also preserves the leftmost bit (sign bit). It does not preserve the sign bit.

In general, if we write a<<n, it means to shift the bits of a number toward the left with specified position (n).
In the terms of mathematics, we can represent the signed right shift operator as follows:

b = a << n & b = a* 2 raised to n

Unsigned Right Shift Operator (>>>)

It shifts a zero at the leftmost position and fills 0. It is denoted by the symbol >>>. 
The left operand value is moved right by the number of bits specified by the right operand and 
the shifted bits are filled up with zeros. Excess bits shifted off to the right are discarded.
Note that the leftmost position after >> depends on the sign bit. It does not preserve the sign bit.


