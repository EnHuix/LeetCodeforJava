/*
给定一个序列（至少含有 1 个数），从该序列中寻找一个连续的子序列，使得子序列的和最大。

例如，给定序列 [-2,1,-3,4,-1,2,1,-5,4]，
连续子序列 [4,-1,2,1] 的和最大，为 6。

 */

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar=nums[0];
        int maxEndingHere=nums[0];
        for(int i=1;i<nums.length;i++){
            maxEndingHere=Math.max(maxEndingHere+nums[i],nums[i]);
            maxSoFar=Math.max(maxSoFar,maxEndingHere);
        }
        return maxSoFar;
        
    }
}