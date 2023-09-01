package testng1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class runnerclass extends Generic {
	@Test
	public void test1() throws InterruptedException
	
	{
		
		driver.findElement(By.id("email")).sendKeys("snehanaik@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abcghbmbvvc");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		//Assert.assertEquals(title, "Facebook – log in or sign up");
		//Assert.fail();
		System.out.println("1");
		
	}

}
