Bitwise operators are used to performing the manipulation of individual bits of a number.They can be used with any integral type (char, short, int, etc.)

# 1. Bitwise OR (|) 

This operator is a binary operator, denoted by ‘|’. It returns bit by bit OR of input values, i.e., if either of the bits is 1, it gives 1, else it shows 0. 
# . Bitwise AND (&)

This operator is a binary operator, denoted by ‘&.’ It returns bit by bit AND of input values, i.e., if both bits are 1, it gives 1, else it shows 0


# . Bitwise AND (&)

This operator is a binary operator, denoted by ‘&.’ It returns bit by bit AND of input values, i.e., if both bits are 1, it gives 1, else it shows 0

# Bitwise Complement (~)

This operator is a unary operator, denoted by ‘~.’ It returns the one’s complement representation of the input value, i.e., with all bits inverted, which means it makes every 0 to 1, and every 1 to 0. 

a = 5 = 0101 (In Binary)

Bitwise Complement Operation of 5

~ 0101
 ________
  1010
  
  --------------------------------------------------------------------------------------------------------------------------------------------
  a= 0011
 b= 0110
 a|b= 0111
 a&b= 0010
 a^b= 0101
~a & b|a&~b= 0101
~a= 1100
-----------------------------------------------------------------------------------------------------------------------------------------------

# Bit-Shift Operators (Shift Operators) 

Shift operators are used to shift the bits of a number left or right, thereby multiplying or dividing the number by two, respectively. 
They can be used when we have to multiply or divide a number by two. 

Syntax: 

 number shift_op number_of_places_to_shift;
 
 
 

