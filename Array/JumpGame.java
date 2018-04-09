/*****
����һ���Ǹ��������飬�����λ������ĵ�һ����������

�����е�ÿ��Ԫ�ر�ʾ���ڸ�λ�õ������Ծ���ȡ�

ȷ���Ƿ��ܹ��������һ��������

ʾ����
A = [2,3,1,1,4]������ true��

A = [3,2,1,0,4]������ false��
*****/
class Solution {
    public boolean canJump(int[] nums) {
      return canJumpFormPosition(0,nums);
    }
    public boolean canJumpFormPosition(int position,int []nums){
        if(position==nums.length-1)
            return true;
        int furthestJump=Math.min(position+nums[position],nums.length-1);
       /* for(int nextposition=position+1;nextposition<=furthestJump;nextposition++){
            if(canJumpFormPosition(nextposition,nums)){
                return true;
            }
        }*/
        for(int nextposition=furthestJump;nextposition>position;nextposition--){
            if(canJumpFormPosition(nextposition,nums))
                return true;
        }
        return false;
    }
}
//���Ϸ���ʹ�õݹ��˼�룬��ʱ�临�ӶȽϸߣ�ʱ�临�Ӷ�ΪO(2^n)

class Solution {
    public boolean canJump(int[] nums) {
        int lastpose=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(i+nums[i]>=lastpose){
                lastpose=i;
            }
        }  
        return lastpose==0;
    }
}
//�÷���Ϊ̰�ģ�ʱ�临�Ӷ�ΪO(n).
