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
        ListNode result = head;
        ListNode slow = head;
        ListNode fast = head;


        while(fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("slow:"+slow.val);

        
        ListNode mid = slow.next;
        slow.next = null;
        ListNode prev = null;
        while(mid!=null){
            ListNode ref = mid.next;
            mid.next = prev;
            prev = mid;
            mid = ref;
        }
         System.out.println("mid:"+mid);
         fast = prev;

        slow = head.next;
        while(fast !=null && slow !=null){
            ListNode fastRef = fast.next;
            ListNode slowref = slow.next;
            result.next = fast;
            fast.next = slow;
            result = slow;
            fast = fastRef;
            slow = slowref;

        }

    
    }
}
