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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode result = dummy;
        int carriedOverVal = 0;

        while(l1 !=null || l2 !=null || carriedOverVal!= 0){
            ListNode node = new ListNode(0);
            int v1 = l1 !=null ? l1.val : 0;
            int v2 = l2 !=null ? l2.val : 0;
            int sum = v1+v2+carriedOverVal;
            System.out.println(sum);
            
            node.val = sum %10; //8
            carriedOverVal = sum/10; //1
            
            dummy.next = node;
            dummy = node;
            l1 = (l1 != null) ?  l1.next : null;
            l2 = (l2 != null) ?  l2.next : null;
        }

        /*ListNode prev = null;
        result = result.next;
        System.out.println(result.val);
        while(result!= null){
            ListNode ref = result.next;
            result.next = prev;
            prev = result;
            result = ref;
        } */
        
        return result.next;

        
    }
}
