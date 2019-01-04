package javainterview;
class Ioo{
	public Ioo run() {
		System.out.println("parent");
		return this;
	}
}

public class Test extends Ioo {
	public Test run() {
		System.out.println("child");
		return this;
	}
	void max() {
		System.out.println("max");
	}

	public static void main(String[] args) {
		Test i= new Test();
		 i.run();
		
            
	}

}
