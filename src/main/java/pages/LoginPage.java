package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
  By user = By.xpath("//input[@placeholder='Username']");
  By pass = By.xpath("//input[@placeholder='Password']");
  By login = By.xpath("//button[@type='submit']");

     public void loginToApplication(String username, String password) {
    	 driver.findElement(user).sendKeys(username);
    	 driver.findElement(pass).sendKeys(password);
    	 driver.findElement(login).click();
     }}