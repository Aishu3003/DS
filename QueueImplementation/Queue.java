package QueueImplementation;

import java.util.Scanner;

class Queuearr {
	private int front;
	private int rear;
	private int[] arr;
	int size;

	public Queuearr(int size) {
		this.size = size;
		front = -1;
		rear = -1;
		arr = new int[size];
	}

	public boolean isEmpty() {
		if (front == -1 && rear == -1) {
			return true;
		}
		return false;

	}

	public boolean isFull() {
		if (rear == size - 1) {
			return true;
		}
		return false;

	}

	public void enqueue(int element) {
		if (isFull()) {
			System.out.println("Queue is Overflow");
		}

		else {
			if (front == -1)
				front++;
			rear = rear + 1;
			arr[rear] = element;
			System.out.println("Item is pushed");

		}

	}

	public void dequeue() {

		if (isEmpty()) {
			System.out.println("Queue is Underflow");
		} else {
			int y = arr[front];
			front = front + 1;
			System.out.println("Popped element is: " + y);
		}

	}

	public void display() {
		{
			for (int i : arr) {
				if (i > 0) {
					System.out.println(i);

				}
			}

		}

	}
	public int size() {
		return rear-front+1;
	}

}

public class Queue {

	public static void main(String[] args) {
		boolean exit = false;
		Queuearr q = new Queuearr(10);
		try (Scanner scanner = new Scanner(System.in)) {

			while (!exit) {
				System.out.println("1.Display \n" + "2.Enqueue the data on queue \n" + "3.Dequeue the data on queue \n"
						+ "4.check how many elements are there in queue \n" + "5.check to see if queue is full \n"
						+ "6.check to see if queue is empty \n" + "Enter the Choice");

				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					q.display();

					break;
				case 2:
					q.enqueue(scanner.nextInt());
					break;
				case 3:
			       q.dequeue();;
					break;
				case 4:
                     
					System.out.println("Total elements in Queue:" + q.size());
				case 5:
					q.isFull();
					break;
				case 6:
					q.isEmpty();
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
