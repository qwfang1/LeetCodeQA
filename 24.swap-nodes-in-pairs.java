/*
 * @lc app=leetcode id=24 lang=java
 *
 * [24] Swap Nodes in Pairs
 *
 * https://leetcode.com/problems/swap-nodes-in-pairs/description/
 *
 * algorithms
 * Medium (43.44%)
 * Total Accepted:    289.7K
 * Total Submissions: 665.4K
 * Testcase Example:  '[1,2,3,4]'
 *
 * Given a linked list, swap every two adjacent nodes and return its head.
 * 
 * You may not modify the values in the list's nodes, only nodes itself may be
 * changed.
 * 
 * 
 * 
 * Example:
 * 
 * 
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * 
 * 
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode current = head;
        ListNode newHead = current.next;
        ListNode pre = new ListNode(-1);
        while(current != null && current.next != null){
            ListNode nextNode = current.next;

            current.next = nextNode.next;
            pre.next = nextNode;
            nextNode.next = current;
            pre = current;
            current = current.next;            
        }
        return newHead;
    }
}

