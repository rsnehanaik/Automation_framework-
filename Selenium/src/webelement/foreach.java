package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class foreach {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		           int c = link.size();
		           System.out.println(c);
		           Thread.sleep(2000);
		         for(WebElement a:link) {  //to fetch text of all links using for each loop
		        	 String b = a.getText();
		        	 System.out.println(b);
		         }

	}

}
