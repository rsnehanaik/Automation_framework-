package program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./new/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/demmo.html");
		Thread.sleep(2000);
		 
		//driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.id("a1")).click();
		driver.findElement(By.name("n1")).click();
		//driver.findElement(By.className("c1")).click();

	}

}
