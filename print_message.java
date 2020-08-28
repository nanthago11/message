package assignment;
import java.util.Scanner;
	public class message implements Runnable

	{
	    public boolean exit;
	    Thread t;

	   
	   message()
	    {
	       
	        t = new Thread(this);
	        exit = false;  
	        t.start();
	    }
	 

	public void run()
	   {
	       
	       while (!exit) {
	           
	           System.out.println("hello Ducati :P");
	           
	           try {
	               Thread.sleep(100);
	           }
	           catch (InterruptedException e) {
	               System.out.println("ex:" + e);
	           }
	       }
	       System.out.println( " Stopped.");
	   }
	 
	   
	   public void stop()
	   {
	       exit = true;
	   }

	public static void main(String[] args) {
	 

	message t=new message();  

	 try {
	           Thread.sleep(1000);
	           t.stop();
	           
	       }
	       catch (InterruptedException e) {
	           System.out.println("catch:" + e);
	       }
	     

	}
	}


