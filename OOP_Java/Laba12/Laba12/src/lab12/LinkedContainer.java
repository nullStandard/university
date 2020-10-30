package lab12;

import java.util.Iterator; 
public class LinkedContainer<E> implements Iterable<E>{ 
 	  	private Node<E> tail;  	    
 	  	private Node<E> head;  	    
 	  	private int size = 0; 
 
 	    public LinkedContainer() { 
 
 	    } 
 
 	    public void add(String place) {  	       
 	    	Node<E> newNode = new Node<E>();  	        newNode.setData(place); 
 
 	        if (size == 0)  	            
 	        	head = newNode;  	        
 	        else 
 	            tail.setNext(newNode); 
 
 	        tail = newNode;  	       
 	        size++; 
 	    } 
 	    public void add(String[] place) {  	       
 	    	Node<E> newNode = new Node<E>();  	      
 newNode.setData(place); 
 
 	        if (size == 0)  	            
 	        	head = newNode;  	        
 	        else 
 	            tail.setNext(newNode); 
 
 	        tail = newNode;  	        
 	        size++; 
 	    } 
 
 
 	    public E get(int index) { 
 	        return findNodeByIndex(index).getData(); 
 	    } 
 
 	    public boolean delete(int index) {  	        
 	    	if (findNodeByIndex(index) != null ) { 
 
 	            if (index != 0) 
                 findNodeByIndex(index - 1).setNext(findNodeByIndex(index+1));              
 	            else 
                head = head.getNext(); 
 
 	            size--;  	            
 	            return true;  	        
 	            } 
 	        return false; 
 	    } 
 
 	    public int size() { 
 	        return size; 
 	    } 
  	    private Node<E> findNodeByIndex(int index) {  	        
  	    	if (index < size && index >= 0) {  	            
  	    		Node<E> curNode = head;  	            
  	    		int curIndex = 0;  	            
  	    		while (curIndex < index){  	                
  	    			if (curNode.getNext() != null) {  	                    
  	    				curNode = curNode.getNext();  	                    
  	    				curIndex++; 
 	                } 
 
 	            }  	            
  	    return curNode; 
 	        }  	        
  	    else  	            
  	    	return null; 
 	    } 
 
 	    public String toString() { 
 	        StringBuilder resultString = new StringBuilder("["); 
          for (int i = 0; i < size; i++) {              
        	  resultString.append(get(i)); 
 
 	            if (i < size-1) resultString.append(", "); 
 	        } 
 	        resultString.append("]");  	        
 	        return resultString.toString(); 
 	    } 
 	     
 	    public void clear() {  	     
 	    	size = 0;  	     
 	    	tail = null;  	     
 	    	head = null; 
 	    } 
 
 	 	 
 	 	public Iterator<E> iterator() { 
 	 	 	return new Iterator() { 
 
	 	@Override 
public boolean hasNext() {
return false; 
 		} 
 
 	 	 	 	@Override 
 	 	 	 	public Object next() {  	 	 	 	// TODO Auto-generated method stub  	 	 	 	return null; 
 	 	 	 	} 
  	 	 	 
 	 	 	}; 
 	 	 	 
 	 	} 
} 
