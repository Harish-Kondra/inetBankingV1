package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws   InterruptedException, IOException {
		
		logger.info("successfully opened URl");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered UserName");

		lp.setPassword(password);
		logger.info("Entered Password");
		Thread.sleep(3000);
		lp.clickSubmit();
		logger.info("Clicked on submit button");
		Thread.sleep(3000);

		if (driver.getTitle().equals("GTPL Bank Manager HomePage")) {

			Assert.assertTrue(true);
			logger.info("Test passed");

		} else {
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Test failed");

		}

	}
}
