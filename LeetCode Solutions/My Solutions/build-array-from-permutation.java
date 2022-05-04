class Solution {
    public int[] buildArray(int[] nums) {
            int[] ans = new int[nums.length];
            for(int i=0;i<nums.length;i++){
                    ans[i] = nums[nums[i]];
            }
        return ans;
    }
}
//index -><- value present i & nums[i] have the same domain....so just simply write the code ...code is given in the qn itself.
