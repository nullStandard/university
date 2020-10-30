package lab14;

class Number implements Serializable{     
	public ArrayList<Integer> numbers;     
	Number(int number){ 
    this.numbers = new ArrayList<>();         
    numbers.add(number); 
} 
public void addNumbers(int newNumber){         
	numbers.add(newNumber); 
} 
public ArrayList getNumbers(){ 
    return numbers; 
} 
@Override     public String toString(){ 
    return numbers.toString(); 
} } 
