/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        

        while(n>0){
            fast = fast.next;
            n--;
        }

        while(fast !=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        if(prev == null){
            return head.next;
        }

        System.out.println(slow.val);
        System.out.println(fast);

        prev.next = slow.next;

        return head;

        

        

    }
}
