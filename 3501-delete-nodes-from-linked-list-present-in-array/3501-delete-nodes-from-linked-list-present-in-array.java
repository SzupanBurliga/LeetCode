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
 // nie umiem ListNode ogień
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> setToRemove = new HashSet<>();
        for(int x: nums) setToRemove.add(x);
        //sprawdziamy czy 1 liczba nalezy do HashSetu
        while(setToRemove.contains(head.val) && head != null){
            head = head.next;
        }
        if(head == null){
            return null;
        }
    
        ListNode curr = head;
        while(curr.next != null){
            if(setToRemove.contains(curr.next.val)){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return head;
    }
}