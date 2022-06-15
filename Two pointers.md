it involves using two pointers to save time and space. (Here, pointers are basically array indexes) *mostly for searching PAIRS of anything*

There are primarily two ways of implementing the two-pointer technique:
1. One pointer at each end
2. Different Paces

1. One pointer at each end

One pointer starts from beginning and other from the end and they proceed towards each other

![image](https://user-images.githubusercontent.com/93143005/173850695-83d74590-4d61-47bb-9b31-9df9f3963326.png)

2. Different Paces

Both pointers start from the beginning but one pointer moves at a faster pace than the other one.

![image](https://user-images.githubusercontent.com/93143005/173850826-a1378c9d-11bc-468c-96f6-8408c7ddaa83.png)




How does this technique save space?

There are several situations when a naive implementation of a problem requires additional space thereby increasing the space complexity
of the solution.Two-pointer technique often helps to decrease the required space or remove the need for it altogether.

