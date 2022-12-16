package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class TestCase3 extends TestBase{

	@Test(priority = 0,groups = {"functional","smoke"})
	public void doUserRegistration() {
		System.out.println("Executing user registration test");

		//Assert.fail();
	}

	@Test(priority = 1,dependsOnMethods={"doUserRegistration","thirdTest","smoke"})
	public void doLogin() {
		System.out.println("Executing login test");
	}
	
	@Test(priority = 2)
	public void thirdTest() {
		System.out.println("Executing third test");
		//Assert.fail();
	}
	@Test(priority = 3)
	public void forthTest() {
		System.out.println("Executing forth test");
	}
}
