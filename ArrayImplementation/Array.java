package ArrayImplementation;

import java.util.Scanner;

class arrayOperations {
	int arr[];
	private int size;

	public arrayOperations(int size) {

		arr = new int[size];
		this.size = size;
	}

	

	public void DisplayEvenOdd() {
		for (int i : arr) {

			if (i % 2 == 0) {
				System.out.println("Printing Even number");
				System.out.println(i);
			}
			
		}
		System.out.println(" \n");

		for (int i : arr) {

			if (i % 2 != 0) {
				System.out.println("Printing Odd number");
				System.out.println(i);
			}
			

		}
	}

	public void AverageOfAll() {
		int sum=0;
		double average;
		for (int i : arr) {
			sum+=i;
		}
		average=(sum)/size;
		System.out.println("Average of all Numbers in array is:"+average);
	

	}

	public void maxofNumber() {
		int max=arr[0];
		for (int i : arr) {
			if(max>arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("Maximum number of array is:"+max);
		
		

	}

	public void Addall() {
		int sum=0;
		for (int i : arr) {
			sum+=arr[i];
		}
		System.out.println("Sum of numbers of array is:"+sum);

	}

	public void Replacenth(Scanner sc) {
		int n=sc.nextInt();
		if(n>0 && n<=size-1) {
			System.out.println("Enter the new Value:");
			int newvalue=sc.nextInt();
			arr[n]=newvalue;
			System.out.println("Element at postion of "+n+"replaced with "+newvalue);
		}
		else {
			System.out.println("Invalid position ");
		}
		

	}

	public void reverseArray() {
		System.out.println("Printing the elements of array in reverse :");

		for(int i=size-1;i>0;i--) {
			System.out.println(arr[i]);
		}
	}

	public  void display() {
		System.out.println("Printing the elements of array in reverse :");
		for (int i = 0; i <=size-1; i++) {
			System.out.println(arr[i]);
		}
	}

}

public class Array {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of Elemmets in array");
		
		int size=scanner.nextInt();
		arrayOperations  arrayOp=new arrayOperations(size);
		System.out.println("Enter the elements:");
		for (int i =0;i<size;i++) {
			arrayOp.arr[i] = scanner.nextInt();
		}
		boolean exit = false;
		try {
			
			System.out.println(" 1.Display the array \n"
					+ " 2.Reverse the array \n "
					+ "3.Replace the nth element from the array and print "
					+ "\n 4.find the addition of all element of the array \n"
					+ " 5.Find the maximum number of the array \n "
					+ "6.print the average of all the elements  from the array \n"
					+ " 7.Display even  and odd number from the array separately"
					+"\n");
			int choice = scanner.nextInt();
			while(!exit) {
			switch (choice) {
			case 1:
				arrayOp.display();
				break;
			case 2:
				arrayOp.reverseArray();
				break;
			case 3:
				arrayOp.Replacenth(scanner);
				break;
			case 4:
				arrayOp.Addall();
				break;
			case 5:
				arrayOp.maxofNumber();
				break;
			case 6:
				arrayOp.AverageOfAll();
				break;
			case 7:
				arrayOp.DisplayEvenOdd();
				break;
			default:
				System.out.println("Invalid Choice ..!!!!");

			}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
