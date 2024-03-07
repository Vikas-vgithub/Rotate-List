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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head; 
        }
        
        int n = 1;
        ListNode lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            n++;
        }
        
        k = k % n;
        if (k == 0) {
            return head; 
        }
        
        ListNode newTail = head;
        for (int i = 1; i < n - k; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        
        newTail.next = null; 
        lastNode.next = head; 
        
        return newHead; 
    }
}
