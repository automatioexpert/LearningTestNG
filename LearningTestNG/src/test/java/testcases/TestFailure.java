package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFailure {

	@Test
	public void doLogin() {

		System.out.println("Executing login test");
		Assert.fail("Failing the login test");
		System.out.println("Capturing screenshot");
		
	}

}
