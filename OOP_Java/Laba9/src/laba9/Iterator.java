package laba9;

import java.util.Iterator; 

public class MyIterator<E> implements Iterator<E> { 
 	private int index = 0; 
 	private E[] values; 
 	 
 	MyIterator(E[] values){ 
 	 	this.values = values; 
 	} 
 	 
 	public boolean hasNext(){ 
 	 	return index < values.length; 
 	} 
 	 
 	public E next() {  	 	 	
 		return values[index++]; 
 	} 
 	 
 	public void remove() { 
 	 	 	values = (E[]) new Object[0];   	 	 	
 	 	 	index = 0; 
 	} 
} 
