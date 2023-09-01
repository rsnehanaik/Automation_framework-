package actionsclas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Demoqa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		  driver.findElement(By.id("firstName")).sendKeys("anny");
		  driver.findElement(By.id("lastName")).sendKeys("naik");
		  driver.findElement(By.id("userEmail")).sendKeys("rsnenaik@gmail.com");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//label[text()='Female']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("userNumber")).sendKeys("1010101010");
		  
		 WebElement ele = driver.findElement(By.id("dateOfBirthInput"));Thread.sleep(2000);
		 Actions act=new Actions(driver);
			 act.moveToElement(ele).doubleClick(ele).perform();
		//ele.click();
		  WebElement ele1 = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
	// 
		  Select s= new Select(ele1);
		  Thread.sleep(2000);
		  s.selectByVisibleText("2000");
		  Thread.sleep(2000);
		  WebElement ele2 = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		  Select sm= new Select(ele2);
		  sm.selectByVisibleText("March");
		  Thread.sleep(2000);
		  WebElement ele3 = driver.findElement(By.xpath("//div[@aria-label='Choose Monday, March 6th, 2000']"));
		  ele3.click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("abc");
		  driver.findElement(By.id("currentAddress")).sendKeys("sddhh");
		 // driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("abc");
		//WebElement ele4 = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__placeholder css-1wa3eu0-placeholder']"));
		// ele4.sendKeys("selenium");
		 // WebElement yr = driver.findElement(By.xpath("//option[text()='2006']"));
		// act.moveToElement(yr).click().perform();
		  
		  Thread.sleep(2000);
		 
}}
