package program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class key {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
	WebElement	ele= driver.findElement(By.xpath("//input[@id='email']"));
	ele.sendKeys("sneha@gmail.com");
	//ele.sendKeys(Keys.CONTROL+"a");
	//ele.sendKeys(Keys.DELETE);
	ele.sendKeys(Keys.ENTER);  

	}

}
