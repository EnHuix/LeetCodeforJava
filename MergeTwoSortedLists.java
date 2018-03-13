/*
Merge two sorted linked lists and return it as a new list. 
The new list should be made by splicing together the nodes of the first two lists.

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       ListNode p=l1,q=l2,t;
       ListNode h=new ListNode(1);
       t=h;
       while(p!=null&&q!=null){
           if(p.val<q.val){
               t.next=p;
               t=p;
               p=p.next;
           }
           else{
               t.next=q;
               t=q;
               q=q.next;
           }
       }
        if(p!=null)
            t.next=p;
        if(q!=null)
            t.next=q;
        return h.next;
    }
}

/*递归做法，时间复杂度较高
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        
        ListNode mergeHead;
        if(l1.val < l2.val){
            mergeHead = l1;
            mergeHead.next = mergeTwoLists(l1.next, l2);
        }
        else{
            mergeHead = l2;
            mergeHead.next = mergeTwoLists(l1, l2.next);
        }
        return mergeHead;
    }
}
*/