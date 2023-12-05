package StackImplementation;
import java.util.Iterator;
import java.util.Scanner;

class Stack{
    private int[] arr;
	private int top;
	private int size;

	
	public Stack(int size) {
		arr=new int [size];
		setTop(-1);
	}

	public boolean isEmpty() {
		if (getTop() == -1) {
         return true;
		}
		return false;
	}
	public  boolean isFull() {
		if(getTop()==size-1) {
			return true;
		}
		return false;
	}

	public  void push(int element) {
            
           setTop(getTop() + 1);
           arr[getTop()]=element;
           System.out.println("Item pushed");
	}

	public  void pop() {
        setTop(getTop() - 1);
       System.out.println("Item Popped");
       
	}

	public void display() {
        for (int i : arr) {
        	System.out.println(arr[i]);
			
		}
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}
	

}
public class Stackarr{
	public static void main(String[] args) {
		 boolean exit=false;
		 Stack  stack=new Stack(10);
		try(Scanner scanner=new Scanner(System.in)){
			 while(!exit) {
				  System.out.println("1.Display \n"
				  		+ "2.Push the data on stack \n"
				  		+ "3.Pop th data on stack \n"
				  		+ "4.check how many elements are there in stack \n"
				  		+ "5.check to see if stack is full \n"
				  		+ "6.check to see if stack is empty \n"
				  		+ "Enter the Choice");
				  
				   int choice=scanner.nextInt();
				  switch(choice) {
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
			
					  System.out.println("Total elements in stack:"+stack.getTop()+1);
				  case 5:
					  stack.isFull();
					  break;
				  case 6:
					  stack.isEmpty();
					  break;
				  
				  default:
					  System.out.println("Invalid case ");
				  }
			 }
			
		}
		
		
	}
}
