package Java;

class list {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node head;

	public list() {
		this.head = null;
	}

	void insertAtBeginning(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}

	void insertAtEnd(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			return;
		}
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
	}

	void deleteAtBeginning() {
		if (head == null) {
			return;
		}
		head = head.next;
	}

	void deleteAtEnd() {
		if (head == null) {
			return;
		}
		if (head.next == null) {
			head = null;
			return;
		}
		Node curr = head;
		while (curr.next.next != null) {
			curr = curr.next;
		}
		curr.next = null;
	}

	void insertAtPosition(int value, int position) {
		if (position <= 0 || head == null) {
			insertAtBeginning(value);
			return;
		}
		Node newNode = new Node(value);
		Node curr = head;
		int idx = 0;
		while (curr.next != null && idx < position - 1) {
			curr = curr.next;
			idx++;
		}
		// insert after curr
		newNode.next = curr.next;
		curr.next = newNode;
	}

	void deleteAtPosition(int position) {
		if (head == null) {
			return;
		}
		if (position <= 0) {
			deleteAtBeginning();
			return;
		}
		Node curr = head;
		int idx = 0;
		while (curr.next != null && idx < position - 1) {
			curr = curr.next;
			idx++;
		}
		if (curr.next == null) {
			// position out of bounds; nothing to delete
			return;
		}
		curr.next = curr.next.next;
	}

	void display() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}
}

public class linkedlist {
	public static void main(String[] args) {
		list list = new list();

		list.insertAtBeginning(3);
		list.insertAtBeginning(2);
		list.insertAtBeginning(1);

		list.insertAtEnd(4);

		System.out.print("Linked list after inserting at beginning and end: ");
		list.display();

		list.deleteAtBeginning();
		System.out.print("After deleting at beginning: ");
		list.display();

		list.deleteAtEnd();
		System.out.print("After deleting at end: ");
		list.display();

		int value = 99;
		int position = 1;
		list.insertAtPosition(value, position);
		System.out.print("After inserting " + value + " at " + position + ": ");
		list.display();

		list.deleteAtPosition(position);
		System.out.print("After deleting element at position " + position + ": ");
		list.display();
	}
}


