package test2;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.TestBase;

public class TestCase2 extends TestBase
{

	@Test(groups = "smoke")
	public void validateTitle() {
		String expected_title = "yahoo.com"; // Excel
		String actual_title = "Gmail.com"; // Selenium script
		Reporter.log("Executing validateTitle Test");
		/*
		if (expected_title.equals(actual_title)) {
			System.out.println("Test Case is passed");

			Assert.assertTrue(true);
		}

		else {
			System.out.println("Test Case is failed");
			Assert.fail("Test case is failed as title not matched");
		} */
		
		SoftAssert sf=new  SoftAssert();
		sf.assertEquals(true, false);
		Reporter.log("Screenshot link::");
		
		sf.assertEquals(actual_title, expected_title);
		 
		
		sf.assertAll();
	
	}

}
