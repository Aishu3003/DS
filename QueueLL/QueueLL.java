package QueueLL;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

}

class Queue1 {
	private Node front;
	private Node rear;

	public Queue1() {

		this.front = null;
		this.rear = null;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return;
		}
		System.out.println("Queue:");
		Node currentNode=front;
		while (currentNode!= null) {
			System.out.println(currentNode.data);
            currentNode=currentNode.next;
		}

	}

	public boolean isEmpty() {
		if (front == null && rear == null)
			return true;
		return false;
	}

	public void enqueue(int element) {
		Node newNode = new Node(element);
		if(isEmpty()) {
			front=newNode;
			rear=newNode;
			
		}
		else {
			rear.next = newNode;
			rear = newNode;

		}
		
	}

	public void dequeue() {
		if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return;
        }
		int data = front.data;
		front = front.next;
		if (front == null) {
			rear = null;
		}

		System.out.println("Deleted element from Queue:" + data);

	}

}

public class QueueLL {
	public static void main(String[] args) {
		Queue1 q = new Queue1();
		boolean exit = false;
		try (Scanner scanner = new Scanner(System.in)) {
			while (!exit) {
				System.out.println("1.Display \n" + "2.Enqueue the data on queue \n" + "3.Dequeue the data on queue \n"
						+ "Enter the Choice");

				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					q.display();

					break;
				case 2:
					q.enqueue(scanner.nextInt());
					break;
				case 3:
					q.dequeue();
					;
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
