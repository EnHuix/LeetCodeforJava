/*
����һ������ n������ 1 ... n Ϊ�ڵ���ɵĶ����������ж����֣�

ʾ��:

����: 3
���: 5
����:
���� n = 3, һ���� 5 �ֲ�ͬ�ṹ�Ķ���������:

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
*/

class Solution {
    public int numTrees(int n) {        
        if(n<=2){
            return n;
        }
        int res[]=new int[n+1];
        res[0]=1;
        res[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                res[i]+=res[j-1]*res[i-j];
            }            
        }
        return res[n];
    }
}