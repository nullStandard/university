package lab14;

class TradePoint implements Serializable { 
    Name name; 
    Adress adress; 
    Specialization specialization; 
    Number number;     Schedule schedule; 
    public TradePoint( String name1, String adress1, int number1, String specialization1, String day, String time){         this.name = new Name(name1);         this.adress = new Adress(adress1); 
        this.specialization = new Specialization(specialization1); 
        this.number = new Number(number1); 
        this.schedule = new Schedule(day,time); 
    } 
 
    public String ShowAllData(){ 
        String str = name.getName() + " " + adress.getAdress() + " " + specialization.getSpecialization() + " " + number + " " + schedule;         return str; 
    } 
    @Override     public String toString(){ 
        return ShowAllData(); 
    } } 
public class Main { 
    public static void main(String args[]) { 
        TradePoint tradePoint = new TradePoint( "Name", "Adress",123, 
"Programmer", "Monday", "20:00"); 
        TradePoint secondPoint = new TradePoint( "Andrew", 
"MainStreet",880553535, "Trader", "Sunday", "18:00"); 
        System.out.println(tradePoint); 
        System.out.println(secondPoint); 
    } 
} 
