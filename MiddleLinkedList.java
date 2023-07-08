package Leet;

//Given the head of a singly linked list, return the middle node of the linked list. 
//If there are two middle nodes, return the second middle node.
public class MiddleLinkedList {
	
	static class ListNode {
		int data;
		ListNode next;
		public ListNode(int data) {
			this.data = data;
		}
	}

	static ListNode head;
	
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleLinkedList list = new MiddleLinkedList();
		list.addElements(6);
		list.addElements(5);
		list.addElements(4);
		list.addElements(3);
		list.addElements(2);
		list.addElements(1);
		System.out.println(middleNode(head).data);
	}
}
