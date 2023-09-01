package methodpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']"));
		ele.sendKeys("smartwatch");
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		 WebElement elee = driver.findElement(By.xpath("//img[@src='https://images.meesho.com/images/products/111842437/ypkvi_400.webp']"));
		 elee.click();
		 JavascriptExecutor js=(JavascriptExecutor) driver;
			for(int i=0;i<3;i++) {
			
			js.executeScript("window.scrollBy(0,200)");
			Thread.sleep(5000);
			
			WebElement ele1 = driver.findElement(By.xpath("//span[text()='Buy Now']"));
			ele1.click();
			Thread.sleep(5000);
			WebElement ele2 = driver.findElement(By.xpath("//input[@type='tel']"));
			ele2.sendKeys("9482719250");
			Thread.sleep(5000);
			WebElement ele3 = driver.findElement(By.xpath("//span[@class='sc-eDvSVe fpkPeP')]"));
			ele3.click();
			
					
			
			

}}
}