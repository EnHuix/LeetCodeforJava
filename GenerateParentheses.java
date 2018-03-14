/*
����n�����ţ���дһ��������������ȷ���ŵ�������ϡ�

���磬����n = 3�������������Ϊ��
[
  ������������������
  ������������������
  ������������������
  ������������������
  ����������������
]
*/

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }
    
    public void backtrack(List<String> list, String str, int open, int close, int max){
        if(str.length()==max*2){	//����ַ��������Ѿ��ﵽn����ɼ���List
            list.add(str);
            return;
        }
        if(open<max){
            backtrack(list,str+"(",open+1,close,max);
        }
        if(close<open){			//��������ĿӦ������������Ŀ
            backtrack(list,str+")",open,close+1,max);
        } 
    }
}