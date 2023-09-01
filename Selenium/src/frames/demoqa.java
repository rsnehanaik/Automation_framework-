package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 //driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.id("frame1"));
		//String t1 = ele.getText();
		 //System.out.println(t1);
	driver.switchTo().frame(ele);
		
		 WebElement ele1= driver.findElement(By.xpath("//a"));
		
		  Thread.sleep(2000);
		 //driver.switchTo().frame(ele);
		 String t = ele1.getText();
		 Thread.sleep(2000);
		 System.out.println(t);
		 //driver.switchTo().defaultContent();
		// WebElement ele2= driver.findElement(By.xpath("(//iframe[@src='/sample'])[2]"));
		// String t1= ele2.getText();
		 //System.out.println(t1);
		 
		 

	}

}
