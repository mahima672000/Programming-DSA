/* What is recursion?

A function is said to be recursive if it calls itself.
functions are just a way to express algebra in programming.

![image](https://user-images.githubusercontent.com/93143005/146361149-689f767e-4653-446e-8ea6-08116d0e3623.png)
somewhat like PMI
PrintDecreasing(5) { Print(5) PrintDecreasing(4) }
PrintDecreasing(n) { Print(n) PrintDecreasing (n-1) }

![image](https://user-images.githubusercontent.com/93143005/146361722-4c16b646-443a-4c2a-be13-d82a4f8ab268.png)

Also, this code will give us stack overflow, as the function call will keep calling itself with a decremented value.

Let's look into the stack frame:
 first call is received from main,
 all the statements of main before calling PrintDecreasing(5), get executed.


whenever, the value of n becomes 0 then we can simply return the function before letting it make further calls.
We need to add this statement at the top of the function, before any other statement (recursive call) gets executed.

![image](https://user-images.githubusercontent.com/93143005/146399514-aea82b91-82d9-4fe0-b814-53320ac93a0a.png)
![image](https://user-images.githubusercontent.com/93143005/146399599-02f51893-281f-4e64-a19b-88bbc0614623.png)

