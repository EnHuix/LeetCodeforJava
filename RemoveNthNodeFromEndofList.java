/*
Given a linked list, remove the nth node from the end of list and return its head.

Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p=head;
        int length=0;
        while(p!=null){
            length++;
            p=p.next;
        }
        p=head;
        if(length==1&&n==1)
            return null;
        if(n==length){
            head=head.next;
            return head;
        }
        for(int i=1;i<=length-n-1;i++)
            p=p.next;
        if(n==1)
            p.next=null;
        else 
            p.next=p.next.next;
        return head;
    }
}

//没什么好说的，注意各种情况！！