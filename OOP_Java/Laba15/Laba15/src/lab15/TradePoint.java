package lab15;

public static class TradePoint{         
	private final SimpleStringProperty name;         
	private final SimpleStringProperty adress;        
	private final SimpleStringProperty number;         
	private final SimpleStringProperty specialization;        
	private final SimpleStringProperty day;        
	private final SimpleStringProperty time; 
private TradePoint(String name1, String adress1, String number1, String specialization1, String day1, String time1){         
	this.name = new SimpleStringProperty(name1);         
	this.adress = new SimpleStringProperty(adress1);         
	this.number = new SimpleStringProperty(number1);         
	this.specialization = new SimpleStringProperty(specialization1);         
	this.day = new SimpleStringProperty(day1); 
this.time = new SimpleStringProperty(time1); 
} 

public String getName() { 
    return name.get(); 
} 

public void setName(String fName) { 
    name.set(fName); 
} 

public String getAdress() {             
	return adress.get(); 
} 

public void setAdress(String fName) { 
    adress.set(fName); 
} 

public String getNumber() { 
    return number.get(); 
} 

public void setNumber(String fName) { 
    number.set(fName); 
} 

public String getSpecialization() { 
    return specialization.get(); 
} 

public void setSpecialization(String fName) { 
    specialization.set(fName); 
} 

public String getDay() {             
	return day.get(); 
} 

public void setDay(String fName) { 
    day.set(fName); 
} 

public String getTime() {             
	return time.get(); 
} 

public void setTime(String fName) { 
    time.set(fName); 
} 
} 

