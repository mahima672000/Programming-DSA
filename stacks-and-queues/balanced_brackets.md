An expression will have unbalanced brackets if the order of the brackets does not match, 
or if the opening brackets are more as compared to the closing brackets 
or the closing brackets are more as compared to the opening brackets. 

## Balanced Parenthesis:

![image](https://user-images.githubusercontent.com/93143005/148371589-9f16f933-e11a-4f03-9cc2-bc97561bcfa2.png)
![image](https://user-images.githubusercontent.com/93143005/148371638-9314f1b7-e9cd-4ddf-a5ef-58b37fa2dd3e.png)
![image](https://user-images.githubusercontent.com/93143005/148371663-f9326aa9-8eef-4608-8a56-554796a041c5.png)
![image](https://user-images.githubusercontent.com/93143005/148371680-269ca41e-4bbe-41b8-b9ba-cb426ec8b822.png)

Whenever we encountered a closing bracket, we checked the stack and we got the corresponding opening bracket.
So, we popped and we iterated through the entire string and when the string was iterated completely,
we got the stack empty meaning there were no extra opening brackets. 
There were no extra closing brackets also as we never got stack
empty whenever we wanted to pop from it. So, the brackets were balanced.

## Extra Opening Brackets:

![image](https://user-images.githubusercontent.com/93143005/148371872-83134541-d9f5-40da-978b-c31bd7cb791f.png)
![image](https://user-images.githubusercontent.com/93143005/148371892-c11ea5d1-5cf7-4a4e-8de7-3f27166cd583.png)

## Extra Closing Bracket:

![image](https://user-images.githubusercontent.com/93143005/148371961-8e448c5c-bf4b-4855-9b42-8341341b6e41.png)
![image](https://user-images.githubusercontent.com/93143005/148371971-1efdad12-8c67-4895-87c8-bfb9af3e5d1e.png)

## Brackets Mismatch:

![image](https://user-images.githubusercontent.com/93143005/148372014-842d87e7-25a8-459c-b35c-716d75cc95fa.png)
![image](https://user-images.githubusercontent.com/93143005/148372029-c0604b00-b101-48ea-8f1f-5acdb03c81c1.png)

## Pseudocode
In all the 4 cases we are :
 *Storing the open brackets as we encounter them
 
 *ignore other characters (alphabets or operators)
 
 *closing bracket found --traverse by iterating the string thoroughly --& check if corresponding opening bracket found --& pop them
 
 *if stack is empty after traversal &-
  * &still a pop operation left-->Extra closing brackets
  * all pop operations complete-->balanced
  * closing & opening bracket do not match -->Mismatch
 *if stack is not empty -->extra closing brackets




