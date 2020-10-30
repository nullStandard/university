package lab13;
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Scanner; 
class Comands{ 
    public int findMin(ArrayList<Integer> list){ 
        return Collections.min(list); 
    } 
    public int findMax(ArrayList<Integer> list){ 
        return Collections.max(list); 
    } 
    public int sum(ArrayList<Integer> list){         
    	int sum = 0;         
    	for(int x: list)             
    		sum += x;         
    	return sum; 
    } 
    public double mean(ArrayList<Integer> list){ 
        return (double)sum(list)/list.size(); 
    } 
} 
