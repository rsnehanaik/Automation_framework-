package program;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taglocn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com");
		Thread.sleep(4000);
		WebElement ele=driver.findElement(By.name("q"));
		Thread.sleep(4000);
	//String	tag=ele.getTagName();
	//System.out.println(tag);
		Point locn=ele.getLocation();
		System.out.println(locn);
		int x=locn.getX();
		System.out.println(x);
	int y=locn.getY();
	System.out.println(y);
	
	}

}
