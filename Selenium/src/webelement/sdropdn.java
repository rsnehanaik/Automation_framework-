package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sdropdn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/src%20code/multidropdwn.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.id("countries"));
		Select s=new Select(ele);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByVisibleText("europe");
		Thread.sleep(2000);
		s.selectByValue("l");
		Thread.sleep(2000);
		s.selectByIndex(4);
		Thread.sleep(2000);
		s.deselectAll();
		Thread.sleep(2000);
		driver.close();
		

	}

}
