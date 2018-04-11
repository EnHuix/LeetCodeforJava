/*
给出集合 [1,2,3,…,n]，其所有元素共有 n! 种排列。

按大小顺序列出所有排列情况，并一一标记，
可得到如下序列 (例如,  n = 3)：

"123"
"132"
"213"
"231"
"312"
"321"
给定 n 和 k，返回第 k 个排列序列。

注意：n 介于1到9之间（包括9）。
*/

class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> num=new ArrayList<Integer>();
        for(int i=1;i<=n;i++)
            num.add(i);
        int[] fact=new int[n];
        fact[0]=1;
        for(int i=1;i<n;i++)
            fact[i]=fact[i-1]*i;
        
        k=k-1;
        StringBuilder sb=new StringBuilder();
        for(int i=n;i>0;i--){
            int index=k/fact[i-1];
            k=k%fact[i-1];
            sb.append(num.get(index));
            num.remove(index);
        }
        return sb.toString();

    }
}