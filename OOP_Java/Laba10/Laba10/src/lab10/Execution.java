package lab10;

import java.io.*; 

public class Execution { 
  	public static void main(String[] args) throws Exception {  	 	
  		SerializeClass worker = new SerializeClass();  	 	
  		worker.setEducation("Lviv Politecnic");  	 	
  		worker.setPassport("MyPassport");  	 	
  		worker.setPrice(10000);  	 	
  		worker.career.setDate("14.05.2018");  	 	
  		worker.career.setPosition("CEO");  	 	
  		worker.career.setViddil("Microsoft Corporation");  	 	
  		worker.characteristics.setAbility("DataBase and Java Working"); 
 	 	worker.characteristics.setPoint(10);  	 	
 	 	System.out.println(worker.getEducation()); 
 	 	System.out.println(worker.getPassport()); 
 	 	System.out.println(worker.getPrice()); 
 	 	System.out.println(worker.career.getDate()); 
 	 	System.out.println(worker.career.getPosition()); 
 	 	System.out.println(worker.career.getViddil()); 
 	 	System.out.println(worker.characteristics.getAbility()); 
 	 	System.out.println(worker.characteristics.getPoint()); 
 	 	 
 	 	FileOutputStream fileoutputstream = new FileOutputStream("Saved.txt"); 
 	 	ObjectOutputStream objectoutputstream = new 
ObjectOutputStream(fileoutputstream);  	 	
 	 	objectoutputstream.writeObject(worker);  	 	
 	 	objectoutputstream.close(); 
 	 	 
 	 	FileInputStream fileinputstream = new FileInputStream("Saved.txt"); 
 	 	ObjectInputStream objectinputstream = new 
ObjectInputStream(fileinputstream); 
 	 	SerializeClass newWorker = (SerializeClass) objectinputstream.readObject(); 
 	 	objectinputstream.close(); 
 	 	 
 	 	 
 	 	 
 	 	System.out.println(newWorker.getEducation()); 
 	 	System.out.println(newWorker.getPassport()); 
 	 	System.out.println(newWorker.getPrice()); 
 	 	System.out.println(newWorker.career.getDate()); 
 	 	System.out.println(newWorker.career.getPosition()); 
 	 	System.out.println(newWorker.career.getViddil()); 
 	 	System.out.println(newWorker.characteristics.getAbility()); 
 	 	System.out.println(newWorker.characteristics.getPoint()); 
 	 	 
 	 	 
 	 	 
 	} 
 
} 

