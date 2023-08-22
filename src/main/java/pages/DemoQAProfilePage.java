package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQAProfilePage {
	  WebDriver driver;
	  public DemoQAProfilePage(WebDriver driver) {
		  this.driver= driver;
	  }
	  By sear = By.id("searchBox");
	  By texting = By.xpath("//input[@id='searchBox']");
	  public String profNow() throws InterruptedException {
		  driver.findElement(sear).sendKeys("Alaya");
		  Thread.sleep(1000);
	  String head = driver.findElement(texting).getText();
	  return head;
	  }
	}


