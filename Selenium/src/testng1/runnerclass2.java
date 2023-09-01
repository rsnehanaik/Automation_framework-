package testng1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class runnerclass2 extends Generic{
	@Test

	public void test1() throws InterruptedException
		
		{
			
			driver.findElement(By.id("email")).sendKeys("snehanaik@gmail.com");
			driver.findElement(By.name("pass")).sendKeys("abcghbmbvvc");
			driver.findElement(By.name("login")).click();
			Thread.sleep(2000);
			String title = driver.getTitle();
			System.out.println(title);
		}

}
