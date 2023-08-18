package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.Base;

public class HomeTest extends Base{
@Test
public void home() throws InterruptedException {
	//WebDriver driver = new ChromeDriver();
	//driver.get("https://www.tutorialspoint.com/index.htm");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("alert('Hello beautiful');");
	Thread.sleep(1000);
	js.executeScript("locaion.reload()");
}}
