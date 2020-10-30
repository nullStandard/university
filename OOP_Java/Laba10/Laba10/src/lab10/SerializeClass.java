package lab10;

import java.io.*; 

public class SerializeClass implements Serializable{ 
 	private String Passport;  	private String Education; 
 	private double Price; 
 	 
 	Career career = new Career(); 
 	Characteristics characteristics = new Characteristics(); 
 	 
 	 
 	public void setPassport(String Passport) { 
 	 	this.Passport = Passport; 
 	} 
 	 
 	public String getPassport() {  	 	
 		return Passport; 
 	} 
 	 
 	public void setEducation(String Education) {  	 	
 		this.Education = Education; 
 	} 
 	 
 	public String getEducation() {  	 	
 		return Education; 
 	} 
 	 
 	public void setPrice(double Price) {  	 	
 		this.Price = Price; 
 	} 
 	 
 	public double getPrice() { 
 	 	return Price; 
 	} 
} 
