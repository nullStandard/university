package lab10;

import java.io.*; 
public class Career implements Serializable
{  	
	public String Date;  	
	public String Viddil; 
 	public String Position; 
 	 
 	public void setDate(String Date) {  	 	
 		this.Date = Date; 
 	} 
 	 
 	public String getDate() { 
 	 	return Date; 
 	} 
 	 
 	public void setViddil(String Viddil) {  	 	
 		this.Viddil = Viddil; 
 	} 
 	 
 	public String getViddil() { 
 	 	return Viddil; 
 	} 
 	 
 	public void setPosition(String Position) { 
 	 	this.Position = Position; 
 	} 
 	 
 	public String getPosition() {  	 	
 		return Position; 
 	} 
} 
