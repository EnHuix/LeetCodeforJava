/*
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? 
Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1], 
  [-1, -1, 2]
]
*/ 

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new LinkedList();
        Arrays.sort(nums);//对数组进行排序
        for(int i=0;i<nums.length-2;i++){
            if(i==0||(i>0&&nums[i]!=nums[i-1])){	//避免出现重复情况
                int l=i+1,h=nums.length-1;
                int sum=0-nums[i];
                while(l<h){
                   if (nums[l] + nums[h] == sum) {
                        res.add(Arrays.asList(nums[i], nums[l], nums[h]));
                        while (l < h && nums[l] == nums[l+1]) l++;
                        while (l < h && nums[h] == nums[h-1]) h--;
                        l++; h--;
                    } 
                    else if (nums[l] + nums[h] < sum) l++;
                    else h--;
                }
            }
        }
        return res;
    }
}

//时间复杂度为O(n^2)
