
package Sorting;

import java.util.Scanner;

public class SelectionSort {
	public static int display(int arr[],int size) {
		System.out.println("Elememts in array:");
		 for (int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		return -1;
		
	}
	public static int selectionSort(int arr[]) {
		  for(int i=0;i<arr.length;i++) {
			  int smallest=i;
			  for(int j=i+1;j<arr.length;j++) {
				  if(arr[smallest]>arr[j]) {
					  smallest=j;
				  }
			  }
			  int temp=arr[smallest];
			  arr[smallest]=arr[i];
			  arr[i]=temp;
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
    System.out.println("Array after sorting:");
   selectionSort(array);
   display(array, size);
    }   
}

