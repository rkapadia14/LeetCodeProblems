package com.leetcode.linkedlist;

public class ListNode {
	 int val;
	 ListNode next;
	 ListNode() {}
	 ListNode(int val) { this.val = val; }
	 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 
	 public static ListNode createList(int[] arr) {
		    ListNode head = new ListNode(arr[0]);
		    ListNode current = head;

		    for (int i = 1; i < arr.length; i++) {
		        current.next = new ListNode(arr[i]);
		        current = current.next;
		    }

		    return head;
		}
}
