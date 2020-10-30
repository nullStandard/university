package laba9;

public class Exe { 
	 
 	public static void main(String[] args) { 
 	 	MyContainer<String> cont = new MyContainer<String>();  	 	
 	 	cont.add("first");  	 	
 	 	cont.add("second");  	 	
 	 	Object[] object;  	 	
 	 	object = cont.toArray();  	 	
 	 	for(int i = 0; i < object.length; i++)  	 	
 	 		System.out.println(object[i]); 
 	 	System.out.print(cont.toString()); 
 	 	System.out.print(cont.contains("first")); 
 	} 
} 

