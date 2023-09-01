package testng2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelexecution {
	public WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void test1(String browser)
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		System.setProperty("webdriver.msedge.driver", "./sw/msedgedriver.exe");
		if(browser.equals("firefox"))
		{
			driver=new EdgeDriver();	
			driver.get("https://www.google.com/");
		}else {
			driver=new FirefoxDriver();	
			driver.get("https://www.facebook.com/");
		}
	}

}
