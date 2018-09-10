package collections;

import java.util.ArrayList;
import java.util.Iterator;

class A{
	int id ;
	String name;
	String addr;
	public A(int id,String name,String addr){
		this.id=id;
		this.name=name;
		this.addr=addr;
	}
}
public class ArrayLong {

	public static void main(String[] args) {
           ArrayList<A> a=new ArrayList<A>();
           a.add(new A(1,"ashok","ppl"));
           a.add(new A(1,"venkat","ppl1"));
           a.add(new A(1,"simran","ppl2"));
           a.add(new A(1,"ashokreddy","ppl3"));
           Iterator it=a.iterator();
           while(it.hasNext()){
        	   A st=(A)it.next();
        	   System.out.println(st.id+st.name+st.addr);
           }
	}

}
