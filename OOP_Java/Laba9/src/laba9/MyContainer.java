package laba9;

import java.util.Iterator; 
public class MyContainer<E> {  	
	private E[] values;  	
	public MyContainer() {  	 	
		values = (E[]) new Object[0]; 
 	} 
 	 
 	public Iterator<E> iterator(){ 
 	 	return new MyIterator<>(values); 
 	} 
 	 
 	public int size() { 
 	 	return values.length; 
 	} 
 	 
 	public void update(int index, E e) {  	 	
 		values[index] = e; 
 	} 
 	 
 	public E get(int index) { 
 	 	return values[index]; 
 	} 
 	 
 	public boolean add(E e) { 
 	 	try { 
 	 	 	E[] temp = values; 
 	 	 	values = (E[]) new Object[temp.length+1];  	 	 	
 	 	 	System.arraycopy(temp, 0, values, 0, temp.length);  	 	 	
 	 	 	values[values.length-1] = e; 	  	 	 	
 	 	 	return true; 
 	 	}
 	 	catch(Exception ex) { 
 	 	 	System.out.println(ex); 
 	 	 	return false; 
 	 	} 
 	} 
 	 
 	public void delete(int index) { 
 	 	try { 
 	 	 	E[] temp = values; 
 	 	 	values = (E[]) new Object[temp.length-1];  	 	 	
 	 	 	System.arraycopy(temp, 0, values, 0, index);  	 	 	
 	 	 	int amountElementsAfterIndex = temp.length - index - 1;  	 	 	
 	 	 	System.arraycopy(temp, index + 1, values, index, amountElementsAfterIndex); 
 	 	}
 	 	catch(Exception e) { 
 	 	 	System.out.println(e); 
 	 	} 
 	} 
 	 
 	public String toString() { 
 	 	String result = ""; 
 	 	for(int i = 0; i < values.length; i++) { 
 	 	 	result += values[i]+"  "; 
 	 	} 
 	 	return result; 
 	} 
 	 
 	public void clear() { 
 	 	values = (E[]) new Object[0];  
 	} 
 	 
 	public void remove(E e) {  	 	for(int i = 0; i < values.length; i++) {  	 	 	
 		if(e.equals(values[i])) { 
 	 	 	 	try { 
 	 	 	 	 	E[] temp = values; 
 	 	 	 	 	values = (E[]) new Object[temp.length-1];  	 	 	 	 	
 	 	 	 	 	System.arraycopy(temp, 0, values, 0, i);  	 	 	 	 	
 	 	 	 	 	int amountElementsAfterIndex = temp.length - i - 1;  	 	 	 	 	
 	 	 	 	 	System.arraycopy(temp, i + 1, values, i, amountElementsAfterIndex); 
 	 	 	 	}catch(Exception ex) { 
 	 	 	 	 	System.out.println(ex); 
 	 	 	 	} 
 	 	 	} 
 	 	} 
 	} 
 	 
 	public Object[] toArray() { 
 	 	Object[] obj = new Object[values.length];  	 	
 	 	for(int i = 0; i < values.length; i++) { 
 	 	 	obj[i] = values[i]; 
 	 	} 
 	 	 	 	return obj; 
 	} 
 	 
 	public boolean contains(E e) {  	 	
 		for(int i = 0; i < values.length; i++) { 
 	 	 	if(e.equals(values[i])) {  	 	 	 	
 	 	 		return true; 
 	 	 	} 
 	 	} 
 	 	 	return false; 
 	} 
 	 
 	public boolean containsAll(MyContainer<E> e) { 
 	 	if(values.length != e.values.length) { 
 	 	 	return false; 
 	 	} 
 	 	int counter = 0; 
 	 	for(int i = 0; i < values.length; i++) { 
 	 	 	if(values[i].equals(e.values[i])) { 
 	 	 	 	counter++; 
 	 	 	} 
 	 	} 
 	 	if(counter == values.length) { 
 	 	 	return true;  	 	
 	 	 	}
 	 	else 
 	 	{  	 	 	
 	 		return false; 
 	 	} 
 	} 
} 
