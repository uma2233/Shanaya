package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	By loginButton = By.xpath("//*[text()='Log in ']");
	
	public LoginPage clickOnLoginButton() {
		driver.findElement(loginButton).click();
		LoginPage login = new LoginPage(driver);
		return login;
		
	}
}
