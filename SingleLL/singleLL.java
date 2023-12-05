package SingleLL;
import java.util.*;


class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

}

class SingleLinkedlist {
	private Node head;

	public SingleLinkedlist() {

		this.head = null;
	}

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data);
			current = current.next;
		}

	}

	public void insert(int element) {
		Node newNode = new Node(element);
		if (head == null) {
			head = newNode;
		}

		else {
			Node currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
		System.out.println("Item pushed.");
	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("List is empty");
		}
		head = head.next;
	}

	public void delete() {

		if (head == null) {
			System.out.println("List is empty");
		}

		if (head.next == null) {
			head = null;

		}
		System.out.println("\n");
		Node secondlastNode = head;
		Node lastNode = head.next;
		while (lastNode != null) {
			lastNode = lastNode.next;
			secondlastNode = secondlastNode.next;
		}
		secondlastNode.next = null;

	}

	public int size() {
		int count = 0;
		Node currentNode = head;
		while (currentNode != null) {
			count++;
			currentNode = currentNode.next;
		}
		return count;
	}

}

public class singleLL {
	public static void main(String[] args) {
		SingleLinkedlist singleLinkedlist = new SingleLinkedlist();
		boolean exit = false;
		try (Scanner scanner = new Scanner(System.in)) {
			while (!exit) {
				System.out.println("1.Display \n" + "2.Insert the data in Linkedlist \n"
						+ "3.Total number of elements in linkedlist \n" + "4.Delete the data in Linkedlist \n"
						+ "Enter the Choice:");

				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					singleLinkedlist.display();

					break;
				case 2:
					singleLinkedlist.insert(scanner.nextInt());
					break;
				case 3:
					System.out.println("Total elements in singly LinkedList :" + singleLinkedlist.size());
					break;
				case 4:
					singleLinkedlist.delete();
					
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
