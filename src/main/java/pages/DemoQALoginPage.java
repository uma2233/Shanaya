package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQALoginPage {
  WebDriver driver;
  public DemoQALoginPage(WebDriver driver) {
	  this.driver= driver;
  }
  By usern = By.id("userName");
  By passe = By.id("password");
  By loginbut = By.id("login");
  public void loginNow(String u , String p) {
	  driver.findElement(usern).sendKeys(u);
	  driver.findElement(passe).sendKeys(p);
	  driver.findElement(loginbut).click();
	  
  }
}
