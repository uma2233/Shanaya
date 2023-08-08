package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
  public static String getProperty(String Key) {
	  //1
	  Properties pro = new Properties();
	  //2
	  try {
		  File src = new File("C:\\Users\\singh\\eclipse-workspace\\SeleniumWebDriver\\configuration\\config.properties");
		  FileInputStream fis = new FileInputStream(src);
		  pro.load(fis);
		  }catch(FileNotFoundException e) {
		  System.out.println("The messgae is"+ e.getMessage());
		  }catch(IOException e) {
			  System.out.println("The messgae is"+ e.getMessage());
	  }
	  //3
	  String value =pro.getProperty(Key);
	  return value;
  }
}
