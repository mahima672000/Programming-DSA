class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i = 0; j = nums.length-1; i<j; i++; j--){
            int counter = 0;
            if(nums[i]==nums[j]){
                counter++;
            }
            if(counter>0){
                return true;
            }
            else{
                return false;
            }
         }
     }
}
