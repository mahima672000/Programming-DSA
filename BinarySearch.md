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

