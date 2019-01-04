package lib;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterLog {
@Test
public void test() {
	System.out.println("ok sucessful");
	Reporter.log("reporter working");
}
}
