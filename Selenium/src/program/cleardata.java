package program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class cleardata {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/cleardata.html");
		Thread.sleep(2000);
		 
	//driver.findElement(By.tagName("input")).clear();
		//driver.findElement(By.id("a1")).clear();
	//driver.findElement(By.name("n1")).clear();
		driver.findElement(By.className("c1")).clear();
	}

}
