/*
�������� [1,2,3,��,n]��������Ԫ�ع��� n! �����С�

����С˳���г����������������һһ��ǣ�
�ɵõ��������� (����,  n = 3)��

"123"
"132"
"213"
"231"
"312"
"321"
���� n �� k�����ص� k ���������С�

ע�⣺n ����1��9֮�䣨����9����
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
/*����n�����֣����п��Ա�����Ϊ��n-1�����飬����n-1������Էֳɣ�n-2������ȵȡ�
���k /��n-1������ʾ��ǰ���������������k����n-1������ʾʣ���n-1�����ʣ��������
���Ǽ���������ֱ��n�ﵽ0��Ȼ�����ǵõ�n�������ǵ�k����
*/