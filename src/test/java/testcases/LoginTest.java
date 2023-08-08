package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.Base;
import dataProvider.CustomDataProvider;

import pages.LoginPage;

public class LoginTest extends Base {
@Test(dataProvider = "loginDetails",dataProviderClass = CustomDataProvider.class)
public void loginToApplication(String uname, String pass) {
	LoginPage login = new LoginPage(driver);
	login.loginToApplication(uname, pass);
	
}
}
