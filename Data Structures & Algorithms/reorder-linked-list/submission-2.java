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
    public void reorderList(ListNode head) {
        if(head ==null || head.next == null){
            return;
        }
        ListNode slow = head;
        ListNode fast = head;


        while(fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        
        ListNode mid = slow.next;
        slow.next = null;
        ListNode prev = null;
        while(mid!=null){
            ListNode ref = mid.next;
            mid.next = prev;
            prev = mid;
            mid = ref;
        }

        fast = prev;
        slow = head;
        System.out.println("slow:"+slow.val);
        System.out.println("fast:"+fast.val);


        while(fast !=null && slow !=null){
            ListNode fastRef = fast.next;
            ListNode slowref = slow.next;
            slow.next = fast;
            fast.next = slowref;
            fast = fastRef;
            slow = slowref;
        }
    }
}
