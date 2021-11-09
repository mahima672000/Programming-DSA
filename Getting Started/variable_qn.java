Qn.
int a = 10; 
   int b = 20;
   a = a + b;
   b = a - b;
   a = a - b; 

System.out.println(a + " " + b);
?
Ans- 20 10 
  
soln-
int a = 10; // assigns 10 to a
int b = 20; // assigns 20 to b

a = a + b; // a is now 30;
b = a - b; // b = 30 - 20, b is now 10 and a stays 30
a = a - b; // a = 30 - 10, a is now 20 and b stays 10
