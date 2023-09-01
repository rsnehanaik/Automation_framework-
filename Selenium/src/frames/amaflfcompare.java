package frames;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amaflfcompare {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			Thread.sleep(2000);
          WebElement ele = driver.findElement(By.name("q"));
          ele.sendKeys("samsung galaxy s20");
          driver.findElement(By.xpath("//button[@type='submit']")).click();
          Thread.sleep(2000);
         WebElement ele1 = driver.findElement(By.xpath("//div[text()='₹74,999']"));
         Thread.sleep(2000);
         String t = ele1.getText();
         System.out.println(t);
         driver.get("https://www.amazon.com/");
         driver.manage().window().maximize();
         Thread.sleep(2000);
         
         
	}

}
