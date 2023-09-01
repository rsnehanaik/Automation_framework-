package program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktexts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/face.html");
		driver.findElement(By.linkText("facebook")).click();
		//driver.get("https://www.facebook.com");
		//Thread.sleep(2000);
		//driver.findElement(By.linkText("Create a Page")).click();
		//driver.get("https://www.gmail.com");
		//Thread.sleep(2000);
		//driver.findElement(By.linkText("Help")).click();
		//driver.get("https://www.yahoo.com");
		//Thread.sleep(2000);
		//driver.findElement(By.linkText("News")).click();

	}

}

