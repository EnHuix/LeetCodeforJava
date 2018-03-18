//Write a function to find the longest common prefix string amongst an array of strings.
//注意substring的用法
/*
public String substring(int beginIndex, int endIndex)
第一个int为开始的索引，对应String数字中的开始位置，
第二个是截止的索引位置，对应String中的结束位置
1、取得的字符串长度为：endIndex - beginIndex;
2、从beginIndex开始取，到endIndex结束，从0开始数，其中不包括endIndex位置的字符
如：
"hamburger".substring(4, 8) returns "urge"
 "smiles".substring(1, 5) returns "mile"public String substring(int beginIndex, int endIndex)
第一个int为开始的索引，对应String数字中的开始位置，
第二个是截止的索引位置，对应String中的结束位置
1、取得的字符串长度为：endIndex - beginIndex;
2、从beginIndex开始取，到endIndex结束，从0开始数，其中不包括endIndex位置的字符
如：
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
