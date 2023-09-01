package actionsclas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[text()='✕']")).click();
		 Thread.sleep(2000);
		 WebElement ele = driver.findElement(By.xpath("//div[text()='Fashion']"));
		 Actions act=new Actions(driver);
		 act.moveToElement(ele).perform();
	}
}
