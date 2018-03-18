/*
Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? 
Find all unique quadruplets in the array which gives the sum of target.

For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.

A solution set is:
[
  [-1,  0, 0, 1],
  [-2, -1, 1, 2],
  [-2,  0, 0, 2]
]
*/
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res=new LinkedList();
        for(int i=0;i<nums.length-3;i++){
            if(i==0||(i>0&&nums[i]!=nums[i-1]))		//避免重复 
            for(int j=i+1;j<nums.length-2;j++){
                if(i==j-1||(j>1&&nums[j]!=nums[j-1])){		//避免重复
                    int sum=nums[i]+nums[j];
                    int l=j+1,h=nums.length-1;
                    while(l<h){
                        if(nums[l]+nums[h]+sum==target){
                             res.add(Arrays.asList(nums[i],nums[j],nums[l], nums[h]));
                             while (l < h && nums[l] == nums[l+1]) l++;
                             while (l < h && nums[h] == nums[h-1]) h--;
                             l++; h--;
                        }
                        else if(nums[l]+nums[h]+sum<target)
                            l++;
                        else
                            h--;   
                    }
                }
            }
        }
        return res;
    }
}
 
//该题解法与3Sum相同，若觉得理解困难可先学习3Sum的解法，该题只是多加了一层循环，
//时间复杂度为O(n^3)，大概在所有提交中是前1/3，若想学习更小时间复杂度的可去LeetCode官网查看，此处仅提供本人自己的解法
