package testng1;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertion  extends Generic {
	@Test
	public void test1() throws InterruptedException
	
	{
		
		driver.findElement(By.id("email")).sendKeys("snehanaik@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abcghbmbvvc");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		
		Assert.assertEquals(title, "Facebook – log in or sign up");
		//Assert.assertTrue(title.contains("Facebook"));
		System.out.println("1");
		//Assert.fail();
		/*SoftAssert sa=new  SoftAssert();
		sa.assertEquals(title, "HI");
		System.out.println("1");
		sa.assertAll();*/
		
	}

}



