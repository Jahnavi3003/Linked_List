package com.datastructures;

public class LinkedList {
	
Node head = null;  
	
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
		
		linkedList.head = new Node(56);                
		Node node2 = new Node(30);          
		Node node3 = new Node(70);          										
		linkedList.head.next = node2;       
		node2.next = node3;									
			
		linkedList.print();  
	}	
	}	