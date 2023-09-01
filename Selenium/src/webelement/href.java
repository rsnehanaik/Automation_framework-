package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class href {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		int c = link.size();
		System.out.println(c); //to get href value using for each loop
		for(WebElement a:link)
		{
			 String t = a.getAttribute("href");
			 System.out.println(t);
		}
		}
				
	}
	