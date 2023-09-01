package program;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssvalue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com");
		Thread.sleep(4000);
		WebElement ele=driver.findElement(By.name("q"));
		Thread.sleep(4000);
	//String	font=ele.getCssValue("font-size");
	//System.out.println(font);
	int h=	ele.getSize().getHeight();
	System.out.println(h);
	int w=ele.getSize().getWidth();
	System.out.println(w);
		
	
	}

}
