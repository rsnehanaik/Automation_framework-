package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
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
		WebElement ele = driver.findElement(By.xpath("//a[@href='/sitemap']"));
		Point locn = ele.getLocation();
		int x= locn.getX();
		System.out.println(locn);
		System.out.println(x);
		int y = locn.getY();
		System.out.println(y);
	
				JavascriptExecutor js=(JavascriptExecutor) driver;
				for(int i=0; i<y;i++) {
					
					js.executeScript("window.scrollBy("+x+","+y+")");
	}
ele.click();
}}
