package program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class passdata {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/pass.html");
		Thread.sleep(2000);
		 
	//driver.findElement(By.tagName("input")).sendKeys("admin");
		//driver.findElement(By.id("a1")).sendKeys("admin");
	//driver.findElement(By.name("n1")).sendKeys("admin");
		driver.findElement(By.className("c1")).sendKeys("admin");

	}
}
