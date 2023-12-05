package DoublyLL;

import java.util.Scanner;

class doublyLinkedlist {
	
	class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}

	}
	private Node head;
	private Node tail;
	private int size;

	public doublyLinkedlist() {

		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public void insert(int element) {
		Node newNode = new Node(element);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		size++;
	}

	public void delete(int element) {
		Node current = head;
		while (current != null) {
			if (current.data == element) {
				if (current.prev != null) {
					current.prev.next = current.next;
				} else {
					head = current.next;
				}
				if (current.next != null) {
					current.next.prev = current.prev;
				} else {
					tail = current.prev;
				}
				size--;
				return;
			}
			current = current.next;
		}
	}

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public int size() {
		return size;
	}
}


public class DoublyLL {
	public static void main(String[] args) {
		
		doublyLinkedlist dLinkedlist = new doublyLinkedlist();
		boolean exit = false;
		try (Scanner scanner = new Scanner(System.in)) {
			while (!exit) {
				System.out.println("1.Display \n" 
						+ "2.Insert the data in Linkedlist \n" 
						          +"3.Total number of elements in linkedlist \n" 
									+ "4.Delete the data in Linkedlist \n"
									+"Enter the Choice:");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					dLinkedlist.display();
					break;

				case 2:
					dLinkedlist.insert(scanner.nextInt());
					break;

				case 3:
					 System.out.println("No of elements in doubly linkedlist:"+dLinkedlist.size()); 
					break;

				case 4:
                 
                    dLinkedlist.delete(scanner.nextInt());

					break;
				default:
					System.out.println("Invalid Choice !!!!");
					break;
				}
			}

		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
