/*
Leetcode Problem No: 141

Leetcode Problem Name: Linked List Cycle

Problem Statement: Given head, the head of a linked list, 
determine if the linked list has a cycle in it.
There is a cycle in a linked list if there is some node in the list 
that can be reached again by continuously following the next pointer. 
Internally, pos is used to denote the index of the node that tail's next pointer is connected to. 
Note that pos is not passed as a parameter.
Return true if there is a cycle in the linked list. Otherwise, return false.

Problem Type: Linked List - Fast & Slow Pointer

Space Complexity: O(1)

Time Complexity: O(n)

Difficulty Level: Easy

 */
package com.leetcode.linkedlist;

public class LinkedListCycle {
	public static boolean hasCycle(ListNode head) {
        if(head==null)
            return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null )
        {
            if(slow==fast)
                return true;
            slow = slow.next;
            fast = fast.next.next;
            
        }
        return false;
    }
	public static void main(String[] args) {
		 // Create nodes
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        // Connect normally
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;

        //Output: true
        System.out.println(hasCycle(head)); 

	}

}
