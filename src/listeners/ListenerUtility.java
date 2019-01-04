package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerUtility  implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test started"+result.getName()+result.getStatus());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test is success"+result.getName()+result.getStatus());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test failure"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
