package BST;

import java.util.Scanner;

public class BSTree {
  class Node{
	  int data;
	  Node left;
	  Node right;  
	  
	  Node(int data){
		  this.data=data; 
		  this.left=null;
		  this.right=null;
	  }
  }
   private  Node root;
	public BSTree() {
		
		this.root = null;
	}
	
	public void insert(int data) {
		  
		Node newNode= new Node(data);
		if(root==null) {
			root=newNode;
		}
		else {
			insertRec(root,newNode);
		}
	}
	private void insertRec (Node node,Node newNode) {
		if(newNode.data<node.data) {
			if(node.left ==null) {
				node.left=newNode;
			}
			else {
				insertRec(node.left, newNode);
			}
		}
		else {
			if(node.right==null) {
				node.right=newNode;
			}
			else {
				insertRec(node.right, newNode);
			}
		}
	}
	
	public void inOrder(Node node) {
		if(root==null) {
			System.out.println("Tree is Empty");
		}
		else {
			if(node.left!=null) {
				inOrder(node.left);
			}
			System.out.print(node.data+" ");
			if(node.right!=null) {
				inOrder(node.right);
			}
		}
	}
	public void preOrder(Node node) {
		if(root==null) {
			System.out.println("Tree is Empty");
		}
		else {
			System.out.print(node.data+" ");
			if(node.left!=null) {
				inOrder(node.left);
			}
			if(node.right!=null) {
				inOrder(node.right);
			}
		}
	}
	public void postOrder(Node node) {
		if(root==null) {
			System.out.println("Tree is Empty");
		}
		else {
			
			if(node.left!=null) {
				inOrder(node.left);
			} 
			
			if(node.right!=null) {
				inOrder(node.right);
			}
			System.out.print(node.data+" ");
		}
	}
	public static void main(String[] args) {
		 BSTree bsTree=new BSTree();
		 boolean exit = false;
	        try (Scanner scanner = new Scanner(System.in)) {
	            while (!exit) {
	                System.out.println( "\n1.Insert data in Binary Search Tree \n"
	                        + "2. Show the content using Inorder Traversal \n" + 
	                		"3. Show the content using Preorder Traversal \n" +
	                		"4. Show the content using Postorder Traversal \n" +
	                        "5.Exit \n" + "Enter the Choice:");

	                int choice = scanner.nextInt();
	                switch(choice) {
	                    case 1:
	                        bsTree.insert(scanner.nextInt());
	                        break;
	                    case 2:
	                         bsTree.inOrder(bsTree.root);
	                        break;
	                    case 3:
	                    	  bsTree.preOrder(bsTree.root);
	                        break;
	                    case 4:
	                    	 bsTree.postOrder(bsTree.root);
	                        break;
	                   
	                    case 5:
	                        exit = true;
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
	
 
  

