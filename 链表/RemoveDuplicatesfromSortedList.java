/*
����һ����������ɾ�����к����ظ����ֵĽڵ㣬ֻ����ԭʼ������ û���ظ����� �����֡�

ʾ�� 1:

����: 1->2->3->3->4->4->5
���: 1->2->5
ʾ�� 2:

����: 1->1->1->2->3
���: 2->3
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