package lab14;

 class Schedule implements Serializable{     
	 public HashMap<String,String> schedule;     
	 Schedule(String day, String time){         
		 this.schedule = new HashMap<>();         
		 schedule.put(day,time); 
} 
public void addNewWorkingDay(String day, String time){ 
    schedule.put(day,time); 
} 
public void setSchedule(String day, String time){         
	schedule.replace(day,time); 
} 
public void ShowSchedule(){         
	for(Map.Entry<String, String> x : schedule.entrySet()){ 
        System.out.println(x.getKey() + " " + x.getValue()); 
    } 
} 
public  HashMap<String, String> getSchedule() { 
    return schedule; 
} 
@Override     public String toString(){         
	return schedule.toString(); 
} 
} 
