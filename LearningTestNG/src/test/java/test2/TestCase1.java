package test2;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.TestBase;

public class TestCase1 extends TestBase{

	@Test(priority = 0, groups = "functional")
	public void doUserRegistration() {

	//	Assert.fail();
		Reporter.log("Executing doUserRegistration Test");

	}

	@Test(priority = 1, groups = "functional",dependsOnMethods = "doUserRegistration")
	public void doLogin() {
		try {
			System.out.println("Executing doLogin test");
			Reporter.log("Executing doLogin Test");
		} catch (Throwable e) {
			System.out.println("Capturing screenshots");

		}
	}

}
