package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;
import dataProvider.CustomDataProvider;
import listeners.ExtentManager;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends Base {
@Test(dataProvider = "loginDetails",dataProviderClass = CustomDataProvider.class)
public void validLogin(String uname, String pass) {
	
	LoginPage login = new LoginPage(driver);
	login.loginToApplication(uname, pass);
	System.out.println("Successfully done");
	HomePage home = new HomePage(driver);
	home.clickOnLoginButton();
	Assert.assertTrue(driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).isDisplayed());


	
}
}
