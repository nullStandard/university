package lab13;

class ThirdThread extends Thread{ 
	 
public void run(){ 
    long start = System.currentTimeMillis();     
    try { 
        Thread.sleep(500); 
    } catch (InterruptedException e) { 
        e.printStackTrace(); 
    } 
    System.out.println(new Comands().findMin(Laba13.list)); 
    System.out.println("Third thread duration: " + ( System.currentTimeMillis() - start)); 
    } } 

