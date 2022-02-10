https://leetcode.com/discuss/general-discussion/1050391/Must-do-Dynamic-programming-Problems-Category-wise
https://leetcode.com/discuss/general-discussion/458695/Dynamic-Programming-Patterns


How to identify qn is of dynamic programming or not?
Dp is enhanced recursion
DP qn mostly asks some optimal

1. Dp me mostly koi choice di hogi like climb stairs me like I can climb 1/2/3 stairs at a time.(overlpaping/enhanced recursion)
![image](https://user-images.githubusercontent.com/93143005/152522462-40e4dd3f-7a25-416f-827e-ac407bc291ad.png)
2. Optimal(min/max)


recursive soln likho usko memoize karo ..fir man ho toh top down me change karo(recursive fn likhna must hai)

![image](https://user-images.githubusercontent.com/93143005/152527495-46c3ccba-6d0e-480f-b03f-ff1a421b8c6c.png)
![image](https://user-images.githubusercontent.com/93143005/152573527-df6e2b2e-05fa-4973-96c4-69f4173b48c7.png)
![image](https://user-images.githubusercontent.com/93143005/152573567-371c4b35-53bf-46d8-ab62-c30a79fde969.png)

## 0/1 Knapsack given (weight array) , (value/price array) , weight capacity of knapsack , output- max profit
choices hai - 0/1 lo ya mat lo
optimal - max profit
![image](https://user-images.githubusercontent.com/93143005/152574551-a6ca602d-0843-4f7e-b607-b32fe0bc986f.png)

## 0/1 Knapsack Recursive

**input**: weight array for items, value array for items , capacity of knapsack
![image](https://user-images.githubusercontent.com/93143005/153359115-129324bd-7f2d-4ea0-bd40-df162b2592e2.png)
humko pata h ye recursive solution h kyu kyuki isme choice de rakhi hai
* recursive code likhne se pehle choice diagram banalo
![image](https://user-images.githubusercontent.com/93143005/153358688-1b9d2653-2b32-4b6a-b2ce-7366c6b03f7b.png)
* function banayenge knapsack ka toh return type int hoga kyuki hume max profit return karna hai
![image](https://user-images.githubusercontent.com/93143005/153360474-dd8ca7a7-ed21-41e3-a93c-08e68472196e.png)

**Base Condition Technique**
![image](https://user-images.githubusercontent.com/93143005/153362289-537fdd0d-32d6-4b71-a7be-7555da69f496.png)

![image](https://user-images.githubusercontent.com/93143005/153376644-789f7e5e-93a2-4788-91be-636842ab04ca.png)
