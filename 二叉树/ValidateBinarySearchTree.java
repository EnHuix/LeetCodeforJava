/*
����һ�����������ж����Ƿ���һ����Ч�Ķ�����������

����һ��������������������������

�ڵ��������ֻ����С�ڵ�ǰ�ڵ������
�ڵ��������ֻ�������ڵ�ǰ�ڵ������
�������������������������Ҳ�Ƕ�����������
ʾ�� 1:

����:
    2
   / \
  1   3
���: true
ʾ�� 2:

����:
    5
   / \
  1   4
     / \
    3   6
���: false
����: ����Ϊ: [5,1,4,null,null,3,6]��
     ���ڵ��ֵΪ 5 �����������ӽڵ�ֵΪ 4 ��
*/


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root==null)
            return true;
        return helper(root.left,root.val,null)&&helper(root.right,null,root.val);
    }
    public boolean helper(TreeNode node,Integer less,Integer greater){
        
        if(node==null)
            return true;
        if(less!=null&&less<=node.val||greater!=null&&greater>=node.val)
            return false; 
        return helper(node.left,node.val,greater)&&helper(node.right,less,node.val);
        
    }
}