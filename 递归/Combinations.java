/*
������������ n �� k������ 1 ... n �����п��ܵ� k ��������ϡ�

ʾ��:

����: n = 4, k = 2
���:
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
*/

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        if(n<=0||n<k||k<=0){
            return null;
        }   
        List<List<Integer>> res=new ArrayList();
        backtrack(res,new ArrayList<Integer>(),1,n,k);
        return res;
    }
    public void backtrack(List<List<Integer>> res,ArrayList<Integer> temp,int start,int n,int k){
        if(k==0){
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i=start;i<=n;i++){
            temp.add(i);
            backtrack(res,temp,i+1,n,k-1);
            temp.remove(temp.size()-1);
        }
        
    }
}