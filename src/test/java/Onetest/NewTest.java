package Onetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public void f() 
  {
	  System.out.println("hi hello");
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
  }
}
