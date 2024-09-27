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
Unwinding the Recursive Calls:

	•	The fifth recursive call returns list1 = [4], which is set as the next node of list2 = [4] in the fourth recursive call. So, the merged list is [4 -> 4].
	•	The fourth recursive call returns list2 = [3 -> 4 -> 4].
	•	The third recursive call returns list1 = [2 -> 3 -> 4 -> 4].
	•	The second recursive call returns list1 = [1 -> 2 -> 3 -> 4 -> 4].
	•	The first recursive call returns list2 = [1 -> 1 -> 2 -> 3 -> 4 -> 4].

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 !=null && list2 != null){
            if(list1.val<list2.val){
                list1.next = mergeTwoLists(list1.next,list2);
                return list1;
            }
             else{
                list2.next = mergeTwoLists(list1,list2.next);
                return list2;
             }
        }
        if(list1 == null){
            return list2;
        }
        return list1;
    }
}
