package CircularLL;

import java.util.Scanner;

class CircularLL {

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node head;

	public CircularLL() {
		this.head = null;
	}

	public void display() {
		if (head == null) {
			System.out.println("Circular Linked List is empty");
			return;
		}

		Node current = head;
		do {
			System.out.print(current.data + " ");
			current = current.next;
		} while (current != head);
		System.out.println();
	}

	public void insert(int element) {
		Node newNode = new Node(element);
		if (head == null) {
			head = newNode;
			head.next = head; // Make it circular
		} else {
			Node currentNode = head;
			while (currentNode.next != head) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
			newNode.next = head; // Make it circular
		}

		System.out.println("Item pushed.");
	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("Circular Linked List is empty");
			return;
		}

		if (head.next == head) {
			head = null; // List has only one element
		} else {
			Node currentNode = head;
			while (currentNode.next != head) {
				currentNode = currentNode.next;
			}
			head = head.next; // Move head to the next node
			currentNode.next = head; // Update the last node's reference
		}
	}

	public void deleteLast() {
		if (head == null) {
			System.out.println("Circular Linked List is empty");
			return;
		}

		if (head.next == head) {
			head = null; // List has only one element
		} else {
			Node currentNode = head;
			Node previousNode = null;
			while (currentNode.next != head) {
				previousNode = currentNode;
				currentNode = currentNode.next;
			}
			previousNode.next = head; // Update the reference of the second-last node
		}
	}

	public int size() {
		int count = 0;
		Node currentNode = head;
		if (currentNode == null) {
			return count;
		}
		do {
			count++;
			currentNode = currentNode.next;
		} while (currentNode != head);
		return count;
	}
}

public class CircularLinkedlist {
	public static void main(String[] args) {
	 CircularLL ll=new CircularLL();
		boolean exit = false;
		try (Scanner scanner = new Scanner(System.in)) {
			while (!exit) {
				System.out.println("1.Display \n" + "2.Insert data in Circular Linked List \n"
						+ "3.Total number of elements in Circular Linked List \n"
						+ "4.Delete the first data in Circular Linked List \n"
						+ "5.Delete the last data in Circular Linked List \n" + "6.Exit \n" + "Enter the Choice:");

				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					ll.display();
					break;
				case 2:
					ll.insert(scanner.nextInt());
					break;
				case 3:
					System.out.println("Total elements in Circular Linked List: " + ll.size());
					break;
				case 4:
					ll.deleteFirst();
					break;
				case 5:
					ll.deleteLast();
					break;
				case 6:
					exit = true;
					break;
				default:
					System.out.println("Invalid Choice");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
