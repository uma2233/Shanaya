package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.Base;
import dataProvider.CustomDataProvider;
import listeners.ExtentManager;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends Base {
@Test(dataProvider = "loginDetails",dataProviderClass = CustomDataProvider.class)
public void validLogin(String uname, String pass) {
	HomePage home = new HomePage(driver);
	
	//LoginPage login = new LoginPage(driver);
	LoginPage login = home.clickOnLoginButton();
	login.loginToApplication(uname, pass);
	System.out.println("Successfully done");
	//ExtentManager.createInstance();
	
}
}
