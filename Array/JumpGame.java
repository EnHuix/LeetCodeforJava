/*****
给定一个非负整数数组，您最初位于数组的第一个索引处。

数组中的每个元素表示您在该位置的最大跳跃长度。

确定是否能够到达最后一个索引。

示例：
A = [2,3,1,1,4]，返回 true。

A = [3,2,1,0,4]，返回 false。
*****/
class Solution {
    public boolean canJump(int[] nums) {
      return canJumpFormPosition(0,nums);
    }
    public boolean canJumpFormPosition(int position,int []nums){
        if(position==nums.length-1)
            return true;
        int furthestJump=Math.min(position+nums[position],nums.length-1);
       /* for(int nextposition=position+1;nextposition<=furthestJump;nextposition++){
            if(canJumpFormPosition(nextposition,nums)){
                return true;
            }
        }*/
        for(int nextposition=furthestJump;nextposition>position;nextposition--){
            if(canJumpFormPosition(nextposition,nums))
                return true;
        }
        return false;
    }
}
//以上方法使用递归的思想，但时间复杂度较高，时间复杂度为O(2^n)

class Solution {
    public boolean canJump(int[] nums) {
        int lastpose=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(i+nums[i]>=lastpose){
                lastpose=i;
            }
        }  
        return lastpose==0;
    }
}
//该方法为贪心，时间复杂度为O(n).
