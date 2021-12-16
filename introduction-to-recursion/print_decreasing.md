/* What is recursion?

A function is said to be recursive if it calls itself.
functions are just a way to express algebra in programming.

![image](https://user-images.githubusercontent.com/93143005/146361149-689f767e-4653-446e-8ea6-08116d0e3623.png)
somewhat like PMI
PrintDecreasing(5) { Print(5) PrintDecreasing(4) }
PrintDecreasing(n) { Print(n) PrintDecreasing (n-1) }

![image](https://user-images.githubusercontent.com/93143005/146361722-4c16b646-443a-4c2a-be13-d82a4f8ab268.png)

Also, this code will give us stack overflow, as the function call will keep calling itself with a decremented value.
