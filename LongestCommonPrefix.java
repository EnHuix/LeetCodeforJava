//Write a function to find the longest common prefix string amongst an array of strings.
//ע��substring���÷�
/*
public String substring(int beginIndex, int endIndex)
��һ��intΪ��ʼ����������ӦString�����еĿ�ʼλ�ã�
�ڶ����ǽ�ֹ������λ�ã���ӦString�еĽ���λ��
1��ȡ�õ��ַ�������Ϊ��endIndex - beginIndex;
2����beginIndex��ʼȡ����endIndex��������0��ʼ�������в�����endIndexλ�õ��ַ�
�磺
"hamburger".substring(4, 8) returns "urge"
 "smiles".substring(1, 5) returns "mile"public String substring(int beginIndex, int endIndex)
��һ��intΪ��ʼ����������ӦString�����еĿ�ʼλ�ã�
�ڶ����ǽ�ֹ������λ�ã���ӦString�еĽ���λ��
1��ȡ�õ��ַ�������Ϊ��endIndex - beginIndex;
2����beginIndex��ʼȡ����endIndex��������0��ʼ�������в�����endIndexλ�õ��ַ�
�磺
"hamburger".substring(4, 8) returns "urge"
 "smiles".substring(1, 5) returns "mile"
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
     if(strs.length==0)
         return "";
        String res=strs[0];
        for(int i=0;i<strs.length;i++){
            while(strs[i].indexOf(res)!=0){
                res=res.substring(0,res.length()-1);
                if(res.isEmpty())
                    return res;
            }
        }
        return res;
    }
}