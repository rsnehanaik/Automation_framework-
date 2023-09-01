package testng1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class runnerclass1 extends Generic{
	@Test

public void test1() throws InterruptedException
	
	{
		
		driver.findElement(By.id("email")).sendKeys("snehanaik@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abcghbmbvvc");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		//Assert.assertEquals(title, "Facebook – log in or sign up");
		Assert.assertTrue(title.contains("Facebook"));
		System.out.println(title);
	}
	@Test
	
	public void test2() throws InterruptedException

	{
		
		
		driver.findElement(By.id("email")).sendKeys("snehanaik@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abcghbmbvvc");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		//Assert.assertEquals(title, "Facebook – log in or sign up");
		Assert.assertTrue(title.contains("HI"));
		System.out.println(title);
	}

}

