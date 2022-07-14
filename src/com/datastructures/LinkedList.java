package com.datastructures;

public class LinkedList {
	
Node head = null;  


   public void addFirst (int data) {
	   Node node = new Node(data);
	   node.setData(data);
	   node.setNext(head);
	   head=node;
   }
	
	public void print() {
		Node currentNode = head;
		System.out.println("Linked-List :- ");           
		while(currentNode != null) {                    
			System.out.print(currentNode.data + " --> ");
			currentNode = currentNode.next;         
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		
		System.out.println(" Welcome To Linked List ");
		
		
		LinkedList linkedList = new LinkedList();   
		
		linkedList.addFirst(70);                
		linkedList.addFirst(30);          
		linkedList.addFirst(56);          										
										
			
		linkedList.print();  
	}	
	}	