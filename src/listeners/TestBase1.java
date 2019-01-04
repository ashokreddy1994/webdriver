package listeners;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerUtility.class)
public class TestBase1  {
	
	@Test
	
	public void test() {
		int a=10;
		int b=10;
		Assert.assertEquals(a,b);
	String user=	System.getProperty("user.dir");
	System.out.println(user);
	}

}
