package Sorting;

import java.util.Scanner;

public class BubbleSort {
	public static int display(int arr[],int size) {
		System.out.println("Elememts in array:");
		 for (int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		return -1;
		
	}
	public static int bubbleSort(int arr[]) {
		int temp;
		   for(int i=0;i<arr.length;i++) { //for pass
			   for(int j=i+1;j<arr.length;j++) {  // for iteration
				if(arr[j]<arr[i]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				  
			   }
		   }
		   return -1;
		   
		   
		   
	}
    public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
		System.out.println("How many Elements ?");
		int size = scanner.nextInt();
		int array[]=new int[size];
		
	for (int i=0;i<size;i++) {
		System.out.println("Enter number"+(i+1)+":");
		array[i]=scanner.nextInt();
		
	}
    display(array, size);
    bubbleSort(array);
    System.out.println("Array after sorting:");
    display(array, size);
    }   
}
