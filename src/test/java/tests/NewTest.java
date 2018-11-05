package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	public WebDriver driver;
  @Test
  public void openMyBlog() {
	  driver.get("https://www.google.com/");
	  System.out.println("Connection Success");
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver", "G:\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	  driver = new FirefoxDriver();
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
