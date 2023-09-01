package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sorce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> img = driver.findElements(By.xpath("//img"));
		int count = img.size();
		System.out.println(count);
		for(WebElement a:img)
		{
			String valu = a.getAttribute("src");
			System.out.println(valu);
		}

	}

}
