/*
����һ�����ܰ����ظ�Ԫ�ص��������� nums�����ظ��������п��ܵ��Ӽ����ݼ�����

˵�����⼯���ܰ����ظ����Ӽ���

ʾ��:

����: [1,2,2]
���:
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