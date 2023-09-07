//Given the head of a singly linked list, return the middle node of the linked list. 
//If there are two middle nodes, return the second middle node.

public class Solution {
	public void addElements(int value) {
		ListNode newNode = new ListNode(value);
		if(head == null) {
			head = newNode;
		}
		else {
			newNode.next =head;
			head = newNode;
		}	
	}
	
	public static ListNode middleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
    }
}