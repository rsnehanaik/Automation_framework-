package testng1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class runnerscript {
		@Test
		public void click() throws InterruptedException
			{
			System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			pom p=new pom(driver);
			p.username("rsneha@gmail.com");
			Thread.sleep(2000);
			p.password("abc");
			Thread.sleep(2000);
			p.clicklogin();
			
			}

}
