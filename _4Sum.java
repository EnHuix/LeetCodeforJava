/*
Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? 
Find all unique quadruplets in the array which gives the sum of target.

For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.

A solution set is:
[
  [-1,  0, 0, 1],
  [-2, -1, 1, 2],
  [-2,  0, 0, 2]
]
*/
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res=new LinkedList();
        for(int i=0;i<nums.length-3;i++){
            if(i==0||(i>0&&nums[i]!=nums[i-1]))		//�����ظ�
            for(int j=i+1;j<nums.length-2;j++){
                if(i==j-1||(j>1&&nums[j]!=nums[j-1])){		//�����ظ�
                    int sum=nums[i]+nums[j];
                    int l=j+1,h=nums.length-1;
                    while(l<h){
                        if(nums[l]+nums[h]+sum==target){
                             res.add(Arrays.asList(nums[i],nums[j],nums[l], nums[h]));
                             while (l < h && nums[l] == nums[l+1]) l++;
                             while (l < h && nums[h] == nums[h-1]) h--;
                             l++; h--;
                        }
                        else if(nums[l]+nums[h]+sum<target)
                            l++;
                        else
                            h--;   
                    }
                }
            }
        }
        return res;
    }
}

//����ⷨ��3Sum��ͬ��������������ѿ���ѧϰ3Sum�Ľⷨ������ֻ�Ƕ����һ��ѭ����
//ʱ�临�Ӷ�ΪO(n^3)������������ύ����ǰ1/3������ѧϰ��Сʱ�临�ӶȵĿ�ȥLeetCode�����鿴���˴����ṩ�����Լ��Ľⷨ