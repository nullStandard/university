package lab11;

public class Execute 
{ 
 	public static void main(String[] args) 
 	{      
 		Career career = new Career();      
 		career.place = "MicrosoftWindows";      
 		career.position = "Java Developer";      
 		career.price = "100000"; 
     LinkedContainer<Career> list = new LinkedContainer<Career>();      
     list.add(career.place);      list.add(career.position);      
     list.add(career.price);      list.delete(1); 
     System.out.println(list.toString());      
     list.clear(); 
     System.out.println(list.toString()); 
    } 
 	} 

