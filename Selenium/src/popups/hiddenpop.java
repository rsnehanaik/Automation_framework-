package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenpop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);	driver.findElement(By.xpath("//div[@class='labelCalendarContainer']")).click();
		Thread.sleep(3000);	
		WebElement ele = driver.findElement(By.xpath("//div[@aria-label='Wed Aug 02 2023']"));
	
	}

}
