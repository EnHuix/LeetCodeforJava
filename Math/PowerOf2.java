//给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
class Solution {
    public boolean isPowerOfTwo(int n) {
       return ((n&(n-1))==0)&&n>0;
       
    }
}