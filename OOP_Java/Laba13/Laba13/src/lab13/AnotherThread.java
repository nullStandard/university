package lab13;

class AnotherThread extends Thread{     
	public void run(){ 
    long start = System.currentTimeMillis();         
    try { 
        Thread.sleep(500); 
    } catch (InterruptedException e) 
    { 
        e.printStackTrace(); 
    } 
    System.out.println(new Comands().findMax(Laba13.list)); 
    System.out.println("Second thread duration: " + ( System.currentTimeMillis() 
- start)); 
} } 

