package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import browserFactory.Browserfactory;


public class Base {
	 protected WebDriver driver;
	  @BeforeClass
	  public void setupBrowser() {
		  driver =Browserfactory.startBrowser("Chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  }
	  
	  @AfterClass
	  public void closeBrowser() {
		  driver.quit();
	  }
	}


