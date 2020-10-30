package lab14;

import java.io.Serializable; 
import java.util.*; 
class Name implements Serializable{ 
    public String name;     Name(String name){         this.name = name; 
    } 
    public void  setName(String name){ 
        this.name = name; 
    } 
    public String getName(){ 
        return name; 
    } } 
