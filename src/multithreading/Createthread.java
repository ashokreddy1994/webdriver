package multithreading;

public class Createthread extends Thread {
	public void run() 
	{
		try {
			for(int i=0;i<10;i++)
			{
				
				System.out.println(i);
			   Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
			
		
	}
	public void run(int i) {
		System.out.println("ashok");
	}
	public void start() {
		System.out.println("start");
	}

	public static void main(String[] args) {
          
		Createthread t=new Createthread();
		   t.start();;;
		   try {
			   for(int i=0;i<10;i++) {
				   System.out.println("run");
				   System.out.println(i);
				   Thread.sleep(1000);
			   }
		   } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
	}

}
