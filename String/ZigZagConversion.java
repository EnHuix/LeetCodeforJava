/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: 
(you may want to display this pattern in a fixed font for better legibility)
P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
*/


class Solution {
    public String convert(String s, int numRows) {
       char[] c=s.toCharArray();
        StringBuffer[] sb=new StringBuffer[numRows];
        int len=c.length;
        for(int i=0;i<numRows;i++) sb[i]=new StringBuffer();
        
        int i=0;
        while(i<len){
            for(int idx=0;idx<numRows&&i<len;idx++)
                sb[idx].append(c[i++]);
            for(int idx=numRows-2;idx>=1&&i<len;idx--)
                sb[idx].append(c[i++]);
        }
        for( i=1;i<numRows;i++)
            sb[0].append(sb[i]);
        return sb[0].toString();
        
    }
}

//算法描述：定义一个大小为行数的StringBuffer数组，为避免出现NullPointerException，应给每一维new一个对象。将给定字符串变为字符数组。
//由提示可知，字符串竖着排列，所以应给数组每一行赋值，之后字符数组后移即可。例如例子中PAY，则赋值顺序为sb[0]='P',sb[1]='A',sb[2]='Y'
//最后在把后面几行都加到sb[0]，返回sb[0]。toString()即可。