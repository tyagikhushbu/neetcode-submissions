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
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists.length == 0) {
            return null ;
        }
        if(lists.length == 1) {
            return lists[0];
        }
        int mid = lists.length/2;
        ListNode[] leftArray = Arrays.copyOfRange(lists, 0, mid);
        ListNode[] rightArray = Arrays.copyOfRange(lists, mid, lists.length);
        ListNode left = mergeKLists(leftArray);
        ListNode right = mergeKLists(rightArray);
        return mergeList(left, right);
    }


    public ListNode mergeList(ListNode leftNode, ListNode rightNode) {
        ListNode mergedNode = new ListNode();
        ListNode head = mergedNode;

        ListNode p1 = leftNode;
        ListNode p2 = rightNode;

        while(p1 != null && p2 != null) {
            
            if(p1.val <= p2.val) {
                System.out.println(p1.val+ ":::"+p2.val);
                mergedNode.next = p1;
                p1 = p1.next;
            } else {
                 mergedNode.next = p2;
                 p2 = p2.next;
            }
             mergedNode = mergedNode.next;
        }

        while(p1 !=null) {
            mergedNode.next = p1;
            p1 = p1.next;
            mergedNode = mergedNode.next;
        }

        while(p2 !=null) {
            mergedNode.next = p2;
            p2 = p2.next;
            mergedNode = mergedNode.next;
        }

        return head.next;



    }



}
