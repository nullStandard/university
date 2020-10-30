package lab14;

class Adress implements Serializable{ 
    public String adress;      
    Adress(String adress){          
    	this.adress = adress; 
    } 
    public void setAdress(String adress){ 
        this.adress = adress; 
    } 
    public String getAdress(){ 
        return adress; 
    } } 
