package com.datastructures;

public class LinkedList {
	
Node head = null;  


   public void addFirst (int data) {
	   Node node = new Node(data);
	   node.setNext(head);
	   head=node;
   }
	
   public void append(int data) {
	   Node currentNode=head;
	   while(currentNode.next != null) {
		  
		   currentNode = currentNode.next;
		   
	   }
	   Node node = new Node (data);
	   currentNode.next=node;
	   
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
		
		linkedList.addFirst(56);                
		linkedList.append(30);          
		linkedList.append(70);          										
										
			
		linkedList.print();  
	}	
	}	