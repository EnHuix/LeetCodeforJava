/*
Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.


class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int res;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                res=((height[i]<height[j])?height[i]:height[j])*(j-i);
                if(max<res)
                    max=res;
            }
        }
        return max;
    }
}


����ʱ�临�Ӷ�ΪO(n^2)
*/

class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int l=0,r=height.length-1;
        while(l<r){
            max=Math.max(max,((height[l]<height[r])?height[l]:height[r])*(r-l));
            if(height[l]<=height[r])
                l++;
            else
                r--;
        }
        return max;
    }
}

//�÷���ʱ�临�Ӷ�ΪO(n),�ռ临�Ӷ�ΪO(1).