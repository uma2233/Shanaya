package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import browserFactory.Browserfactory;


public class Base {
	 protected WebDriver driver;

	  @BeforeClass
	  public void setupBrowser() {
		  //driver =Browserfactory.startBrowser("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver =Browserfactory.startBrowser("chrome", "https://demoqa.com/login"); }
	  
	  @AfterClass
	  public void closeBrowser() {
		  driver.quit();
	  }
	}


