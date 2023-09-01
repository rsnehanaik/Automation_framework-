package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frams1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/mainpage.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='a1']")).sendKeys("Qspiders");
		  Thread.sleep(2000);
		  WebElement frame = driver.findElement(By.tagName("iframe"));
		  driver.switchTo().frame(frame);
		  driver.findElement(By.xpath("//input[@id='p1']")).sendKeys("rajajinagar");
		  
	}

}
