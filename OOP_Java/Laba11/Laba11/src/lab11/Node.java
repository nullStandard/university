package lab11;

public class Node<E> { 
	 	private Node<E> next;  	 	
	 	private E data; 
	 	 
	 	public Node() { 
	 	} 

	 	public Node<E> getNext() { 
	 	 	return next; 
	 	} 
	 	public void setNext(Node<E> next) { 
	 	 	this.next = next; 
	 	} 
	 	public E getData() { 
	 	 	return data; 
	 	} 
	 	public void setData(String place) {  	 	 	
	 		this.data = (E) place; 
	 	} 
	 	 
	 	 
	 	 
	} 
