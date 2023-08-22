package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;
import dataProvider.CustomDataProvider;
import pages.DemoQALoginPage;
import pages.DemoQAProfilePage;

public class LoginToDemoQA extends Base {
@Test(dataProvider="loginDetails",dataProviderClass = CustomDataProvider.class)
public void demoqatest(String un , String ps) throws InterruptedException {
	DemoQALoginPage dm = new DemoQALoginPage(driver);
	dm.loginNow(un,ps);
	Thread.sleep(1000);
	Assert.assertTrue(driver.getCurrentUrl().contains("https://demoqa.com/profile"));
	DemoQAProfilePage als = new DemoQAProfilePage(driver);
	System.out.println(als.profNow());
	
}
}
