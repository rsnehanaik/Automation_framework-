package program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class text {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[@href='/downloads']"));
		System.out.println("hi");
	
	}

}
