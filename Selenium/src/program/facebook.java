package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("email"));
		String clr=ele.getCssValue("colour");
		System.out.println(clr);
		//driver.findElement(By.id("pass")).sendKeys("sneha");
		//driver.findElement(By.name("login")).click();
		
				 


	}

}
