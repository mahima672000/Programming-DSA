*if qn me sorted word is used high chances of binary search there*

## Binary Search in a Sorted array
```class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length-1;
        while(l<=h){// l&h will be updated until l<=h
            int m = l+(h-l)/2;// m should be loop k inside taaki update hote rhe
            if(target>nums[m]){
                l = m+1;
            }else if(nums[m]>target){
                h = m-1;
            }else{
                return m;
            }
        } 
        return -1;
    }
}
```
## Binary Search in reverse sorted array
```
int l = 0;
        int h = nums.length-1;
        while(l<=h){// l&h will be updated until l<=h
            int m = l+(h-l)/2;// m should be loop k inside taaki update hote rhe
            if(target>nums[m]){
                h = m-1;
            }else if(nums[m]>target){
                l = m+1;
            }else{
                return m;
            }
        } 
        return -1;
    }
}
```
## Array order not known Search(sorted it is but we don't know if its ascending or descending)

```arr[0] & arr[arr.length-1] should be compared.
```
## First and Last occurrence of an Element in a sorted array

check mid pe hai ki nhi ?
if yes then make sure whether it is first occurence or not

store mid index in result & make hi --> hi-1
agar left me aur koi element nhi hai then that is the first element itself

```
class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length-1;
        int res = -1; // not storing anything here
        while(l<=h){
            int m = l+(h-l)/2;
            if(target==nums[m]){
              res = m;
              h = m-1; //don't return anything
            }else if(nums[m]>target){
                h = m-1;
            }else{
                 l = m+1;
            }
        } 
        return res;//this will give first occurence
    }
}

// change target==nums[m] case with l=m+1 it will give us last occurence
```
## 
