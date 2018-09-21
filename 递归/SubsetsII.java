/*
给定一个可能包含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。

说明：解集不能包含重复的子集。

示例:

输入: [1,2,2]
输出:
[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]
*/
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList();
        Arrays.sort(nums);
        backtrack(res,new ArrayList<Integer>(),nums,0);
        return res;
    }
    
    public void backtrack(List<List<Integer>> res,ArrayList<Integer> temp,int[] nums,int pos){
        
        res.add(new ArrayList(temp));
        for(int i=pos;i<nums.length;i++){
            if(i>pos&&nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            backtrack(res,temp,nums,i+1);
            temp.remove(temp.size()-1);
            
        }
    }
}