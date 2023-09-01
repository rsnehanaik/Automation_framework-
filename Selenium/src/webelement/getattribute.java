package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		Thread.sleep(5000);
		WebElement	ele=driver.findElement(By.xpath("//a[text()='Paytm for Consumer']"));
			
	Thread.sleep(5000);
	String attb=ele.getAttribute("data-tryxpath-element");Thread.sleep(5000);
	//String attb=ele.getAttribute("href");Thread.sleep(5000);
		System.out.println(attb);
	}

}
