package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelmnts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		List<WebElement> ele = driver.findElements(By.xpath("//a|//img"));
	int count = ele.size();
	System.out.println(count);
		List<WebElement> ele1 = driver.findElements(By.xpath("//a"));
		int links = ele1.size();
		System.out.println(links);
		List<WebElement> ele11 = driver.findElements(By.xpath("//img"));
		int imgs = ele11.size();
		System.out.println(imgs);
	}

}


