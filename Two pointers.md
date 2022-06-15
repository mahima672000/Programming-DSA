it involves using two pointers to save time and space. (Here, pointers are basically array indexes) ***mostly for searching PAIRS of anything***

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

*********************************************Some examples*******************************************************
    Example : In a sorted array, find if a pair exists with a given sum S

    Brute Force Approach: We could implement a nested loop finding all possible pairs of elements and adding them.

bool pairExists(int arr[], int n, int S)
{
    for(i = 0 to n-2)
        for(j = i+1 to n-1)
            if(arr[i] + arr[j] == S)
                return true
    return false
}

Time complexity: O(n²)

    Efficient Approach

bool pairExists(int arr[], int n, int S)
{
    i = 0
    j = n-1
    while( i < j)
    {
        curr_sum = arr[i] + arr[j]
        if ( curr_sum == S)
            return true
        else if ( curr_sum < X )
            i = i + 1
        else if ( curr_sum > X )
            j = j - 1
    }
    return false
}

Time Complexity: O(n)


---------------------------------------------------------------------------------------------------------------------------

    Brute Force Approach: We can find the length of the entire linked list in one complete iteration and then iterate till half-length again.

ListNode getMiddle(ListNode head)
{
    len = 0
    ListNode curr = head
    while ( curr != NULL )
    {
        curr = curr.next
        len = len + 1
    }
    
    curr = head
    i = 0
    while(i != len / 2)
    {
        curr = curr.next
        i = i + 1
    }
    return curr
}

    Efficient Approach: Using a two-pointer technique allows us to get the result in one complete iteration

ListNode getMiddle(ListNode head)
{
    ListNode slow = head
    ListNode fast = head
   while(fast && fast.next)
    {
        slow = slow.next
        fast = fast.next.next
    }
   return slow
}
