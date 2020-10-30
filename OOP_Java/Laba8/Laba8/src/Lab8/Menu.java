package Lab8;

public class Menu { 
	 
 	public void show(String[] arg) { 
 	 	  System.out.println("List:");  	 	  for(int i = 0; i < arg.length; i++) {  	 	   if(arg[i].equals("")) {  	 	    continue; 
 	 	   } 
 	 	   System.out.print(arg[i] + "  "); 
 	 	  } 
 	 	  System.out.println(); 
 	 	 } 
 	 	  
 	 	  
 	 	  
   public void calculate(String[] words, StringBuilder[] sb, String end, String insert) { 
 	 	  for(int i = 0; i < sb.length; i++) {  	 	   if(words[i].endsWith(end)) {  	 	    sb[i] = new StringBuilder(words[i]); 
 	 	    sb[i].replace(sb[i].length(), sb[i].length(), insert);  
 	 	  } 
 	 	 } 
 	 	 } 
 	 	  
 	 	  
 	 	  
 	 	 public void result(String[] words, StringBuilder[] sb, String end) { 
 	 	  for(int i = 0; i < sb.length; i++) {  	 	   if(words[i].endsWith(end)) {  	 	    System.out.print(sb[i] + "  "); 
 	 	   } 
 	 	   else { 
 	 	    System.out.print(words[i] + "  "); 
 	 	   } 
 	 	    
 	 	  } 
 	 	 } 
 	 	  
 	 	 public void shutDown() {  	 	  System.out.println("Goodbuy"); 
 	 	  return; 
 	 	 } 
 	 	  
 	 
} 

