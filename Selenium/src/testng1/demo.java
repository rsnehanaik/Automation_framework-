package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo {
 @Test
	 public void data1() throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	Thread.sleep(5000);
	driver.get("https://www.selenium.dev/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@href='/downloads']"));
	Thread.sleep(5000);
	System.out.println("hi");
	Thread.sleep(2000);
	
	Reporter.log("HI",true);
 }
	@Test
	 public void data2() {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.selenium.dev/");
	
	driver.findElement(By.xpath("//a[@href='/downloads']"));
	System.out.println("download");
	
	Reporter.log("download",true);
}
}
