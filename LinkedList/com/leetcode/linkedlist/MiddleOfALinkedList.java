/*
Leetcode Problem No: 876

Leetcode Problem Name: Middle of the Linked List

Problem Statement: Given the head of a singly linked list, 
return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

Problem Type: Linked List - Fast & Slow Pointer

Space Complexity: O(1)

Time Complexity: O(n)

Difficulty Level: Easy

 */

package com.leetcode.linkedlist;

public class MiddleOfALinkedList {

	public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
        ListNode head1 = ListNode.createList(arr1);
        ListNode middle1 = middleNode(head1);

        //Output: 3
        System.out.println("Middle value: " + middle1.val);
        
        int[] arr2 = {1,2,3,4,5,6};
        ListNode head2 = ListNode.createList(arr2);
        ListNode middle2 = middleNode(head2);

        //Output: 4
        System.out.println("Middle value: " + middle2.val);
        
        

	}

}
