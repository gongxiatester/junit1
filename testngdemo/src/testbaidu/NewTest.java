package testbaidu;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void f() {
System.setProperty("webdriver.chrome.driver", ".//Tools//chromedriver.exe");
ChromeDriver driver =new ChromeDriver();
driver.get("http://www.baidu.com");	  
  
  
  
  }


}
