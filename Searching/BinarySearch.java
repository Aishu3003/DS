package Searching;

import java.util.Scanner;

public class BinarySearch {
	public static int display(int arr[],int size) {
		System.out.println("Elememts in array:");
		 for (int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		return -1;
		
	}
	public static int search(int arr[],int x) {
		   int low=0;
		   int high=arr.length-1;
		   
		   while(low<=high) {
			   int mid=low+(high-low)/2;
			  
			   if(arr[mid]<x) {
				   low=mid+1;
			   }
			   else if(arr[mid]==x) {
			        System.out.println("Element is found at index: " + mid); 
			        break;
			   }
			   else{
				   high=mid-1;
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
    System.out.println("Enter the element to search in array");
    int x=scanner.nextInt();
    search(array, x);
    
    }   
}
