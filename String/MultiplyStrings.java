/*
Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2.

Note:

The length of both num1 and num2 is < 110.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
*/

class Solution {
    public String multiply(String num1, String num2) {
        int m=num1.length();
        int n=num2.length();
        int[] res=new int[m+n];
        for(int i=num1.length()-1;i>=0;i--){
            for(int j=num2.length()-1;j>=0;j--){
                int mul=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int p1=i+j,p2=i+j+1;
                int sum=mul+res[p2];
                
                res[p1]+=sum/10;
                res[p2]=sum%10;
            }
        }
        
        StringBuilder sb=new StringBuilder();
        for(int p:res){
           if(!(p==0&&sb.length()==0))			//如果最高位数字为零，则不加入，使得从第一个不为零的数字开始加入
               sb.append(p);
        }
        return (sb.length()==0)? "0":  sb.toString();
    }
}