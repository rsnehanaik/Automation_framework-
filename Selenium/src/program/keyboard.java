package program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/keyboard.html");
		Thread.sleep(2000);
WebElement ele=driver.findElement(By.xpath("//input[@value='manual']"));
ele.sendKeys(Keys.CONTROL+"ax");
WebElement ele1=driver.findElement(By.xpath("//input[@id='a1']"));
ele1.sendKeys(Keys.CONTROL+"v");
WebElement ele2=driver.findElement(By.xpath("//input[@value='automation']"));
ele2.sendKeys(Keys.CONTROL+"ax");
ele.sendKeys(Keys.CONTROL+"v");

	}

}
