package StackLL;

import java.util.Scanner;
class Node {
	int data;
	Node next;


public Node(int data){
	this.data=data;
	this.next= null;
}
}

class Stack1{
	private Node top;

	
	public boolean isEmpty() {
		return top == null;
	}

	public void push(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			newNode=top;
		}
		else {
			newNode.next = top;
			top = newNode;

		}
		
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("stack Underflow");
		}
		int poppedValue=top.data;
		top = top.next;
		return poppedValue;
	}

	public void display() {
		if (top == null) {
			System.out.println("Stack Underflow");
		} else {
			Node currentNode = top;
			System.out.print("Stack: ");
			while (currentNode.next != null) {

				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
			System.out.println();
		}
	}

}

public class StackLL {
	public static void main(String[] args) {
		boolean exit = false;
		 Stack1 stack = new Stack1();
		 try(Scanner scanner = new Scanner(System.in))
		{
			while (!exit) {
				System.out.println("1.Display \n" + "2.Push the data on stack \n" + "3.Pop th data on stack \n"
						
						+ "4.check to see if stack is empty \n" + "Enter the Choice");
				

				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					stack.display();

					break;
				case 2:
					stack.push(scanner.nextInt());
					break;
				case 3:
					stack.pop();
					break;
			
				case 4:
					stack.isEmpty();
					break;

				default:
					System.out.println("Invalid case ");
				}
			}

		}

	}
	
}
