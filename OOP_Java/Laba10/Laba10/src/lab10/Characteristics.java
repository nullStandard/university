package lab10;

import java.io.*; 
public class Characteristics implements Serializable{ 
 	private String Ability; 
 	private int Point; 
 	 
 	public void setAbility(String Ability) { 
 	 	this.Ability = Ability; 
 	} 
 	 
 	public String getAbility() { 
 	 	return Ability; 
 	} 
 	 
 	public void setPoint(int Point) {  	 	this.Point = Point; 
 	} 
 	 
 	public int getPoint() {  	 	return Point; 
 	} 
} 
