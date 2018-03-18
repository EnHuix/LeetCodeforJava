/*
给定n对括号，编写一个函数来生成正确括号的所有组合。

例如，给定n = 3，解决方案集合为：
[
  “（（（）））”，
  “（（）（））”，
  “（（））（）”，
  “（）（（））”，
  “（）（）（）”
]
*/

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }
    
    public void backtrack(List<String> list, String str, int open, int close, int max){
        if(str.length()==max*2){	//如果字符串长度已经达到n，则可加入List
            list.add(str);
            return;
        }
        if(open<max){
            backtrack(list,str+"(",open+1,close,max);
        }
        if(close<open){			//右括号数目应等于左括号数目
            backtrack(list,str+")",open,close+1,max);
        } 
    }
}