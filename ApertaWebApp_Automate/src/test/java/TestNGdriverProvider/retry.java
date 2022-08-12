package TestNGdriverProvider;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retry implements IRetryAnalyzer {

	
	int failedcount=0;
	int retrycount=5;
	@Override
	public boolean retry(ITestResult result) {

		if(failedcount<retrycount) {
		
			failedcount++;
			return true;
		
		}
		return false;
	}

}
