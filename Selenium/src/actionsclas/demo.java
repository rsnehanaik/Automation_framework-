package actionsclas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
		 driver.findElement(By.id("firstName")).sendKeys("anny");
		  driver.findElement(By.id("lastName")).sendKeys("naik");
		  driver.findElement(By.id("userEmail")).sendKeys("rsnenaik@gmail.com");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//label[text()='Female']")).click();
		  
		  driver.findElement(By.id("userNumber")).sendKeys("1010101010");
		  driver.findElement(By.id("dateOfBirthInput")).click();
		  
		  driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("abc");
		 Thread.sleep(2000);
		
		 //comment driver.findElement(By.xpath("//label[text()='Music']")).click();
		  driver.findElement(By.id("currentAddress")).sendKeys("korea");
	}

}
