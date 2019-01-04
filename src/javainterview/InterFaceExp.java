package javainterview;

interface Ashok {
	void sum();

	void display();
}

public class InterFaceExp implements Ashok
{

	public static void main(String[] args)
	{
         InterFaceExp a=new InterFaceExp();
         a.sum();
         
	}

	@Override
	public void sum() {
		System.out.println("class");

	}

	@Override
	public void display() {
		System.out.println("class");

	}

	public void print() {
		System.out.println("mainclass");
		
	}
	
	

}
