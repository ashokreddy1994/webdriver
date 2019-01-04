package javainterview;
 class Ashok1{
	   void m1() {
		System.out.println("parent");
	}
 }

public class StaticOverriding extends Ashok1{
	protected void m1() {
		System.out.println("child");
	}
	public static void m2() {
		System.out.println("child specific");
	}

	public static void main(String[] args) {
		Ashok1 a=new Ashok1();
		a.m1();
         
	}

}
