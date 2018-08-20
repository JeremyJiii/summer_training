/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        Deque<ListNode> dq = new LinkedList();
        ListNode n = head;
        while(n!=null){
            dq.add(n);
            n = n.next;
        }
        ListNode n1,n2;
        while(dq.size()>2){
            n = dq.pollFirst();
            n1 = dq.pollLast();
            n.next = n1;
            n1.next = dq.peek();
        }
        if(dq.size()>0)
            dq.pollLast().next = null;
    }
}
