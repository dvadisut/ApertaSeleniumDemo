package TestNGdriverProvider;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.tinygroup.commons.tools.Assert;

public class failedtestexecution {
	
	@Test(retryAnalyzer = retry.class)
	public void method1() {
		
		Assert.fail();
		
	}
	
	@Test
	public void method2() {
		
		System.out.println("Test");
	}

}
