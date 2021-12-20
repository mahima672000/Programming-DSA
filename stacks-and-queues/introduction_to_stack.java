/* Till now I know about recursive call stack and the function call stack , now I will see how we can 
create our own stack objects using Java Collections, 
what are the operations allowed in stack, 
and find some applications of Stack data structure in real-world use-cases.

Stack is a linear data structure which follows a FILO (First In Last Out) order (or Last In First Out (LIFO)) for doing various operations.
FILO for bottom item
LIFO for top item

DECLARATION

1. declare a stack of Integers in Java and initialize it as EMPTY stack
st is the variable name

Stack<Integer> st = new Stack<Integer>(); // this is declaration & initialisation too ! (with an empty size stack on heap memory)

2. Stack<Integer> st; // declaration only only (a reference of the stack  created in RAM's stack and pointed to NULL)

OPERATIONS

* push(ele):Adds an item ele in the stack (to the top of stack)
{If the stack is full, then it is said to be a Stack Overflow condition. 
Stack overflow can occur when there is no more heap memory, which can be allocated to our stack.}

*pop():Removes an item from the stack and returns the top element which is removed.
{The items are popped in the reverse order in which they are pushed(OBVIOUS)If the stack is empty, then it is said to be a Stack Underflow condition. 
Hence, trying to remove an element from an empty stack (size = 0), will give a run-time error.}

*peek():Returns top element of stack.
{Note: It will give a run-time error, if there is no element present in the stack, i.e. the size of stack is zero.}

*empty():Returns true if stack is empty, else false.

*size():Returns the number of elements present in the stack.

All these operations are constant operations, i.e. the time complexity is O(1) per call.
