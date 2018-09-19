/*
给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。

示例 1:

输入: 1->2->3->3->4->4->5
输出: 1->2->5
示例 2:

输入: 1->1->1->2->3
输出: 2->3
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
       
        if(head==null||head.next==null)
            return head;
        
        int val=head.val;
        ListNode p=head.next;
        
        if(p.val!=val){
            head.next=deleteDuplicates(p);
            return head;
        }else{
            while(p!=null&&p.val==val){
                p=p.next;
            }
            return deleteDuplicates(p);
            
        }
    }
}