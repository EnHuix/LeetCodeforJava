/*
Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

Note:
All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
For example, given candidate set [2, 3, 6, 7] and target 7, 
A solution set is: 
[
  [7],
  [2, 2, 3]
]
*/

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList();
        backtrack(list,new ArrayList<Integer>(),candidates,target,0);
        return list;
    }
    void backtrack(List<List<Integer>> list,List<Integer> tempList,int nums[],int remain,int start){
        if(remain<0)
            return;
        if(remain==0)
            list.add(new ArrayList(tempList));
        else
            for(int i=start;i<nums.length;i++){
                tempList.add(nums[i]);
                backtrack(list,tempList,nums,remain-nums[i],i); //因为数组元素可以重复使用
                tempList.remove(tempList.size()-1);
            }
    }
}