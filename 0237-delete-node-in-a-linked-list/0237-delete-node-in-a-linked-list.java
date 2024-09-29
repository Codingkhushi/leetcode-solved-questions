/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
    1.	We are given access to the node 5. We cannot access head, so we cannot simply rewire the previous node (4).
	2.	We copy the value from the next node (1) to the node 5, so the list now looks like:
    head -> 4 -> 1 -> 1 -> 9
    3.	We then update the next pointer of the node (which originally held 5) to skip over the next node (which originally held 1), making the list look like:
    head -> 4 -> 1 -> 9
    Now, the node originally holding 5 effectively holds 1, and the node originally holding 1 is deleted from the list.

class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
