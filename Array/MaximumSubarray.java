/*
����һ�����У����ٺ��� 1 ���������Ӹ�������Ѱ��һ�������������У�ʹ�������еĺ����

���磬�������� [-2,1,-3,4,-1,2,1,-5,4]��
���������� [4,-1,2,1] �ĺ����Ϊ 6��

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