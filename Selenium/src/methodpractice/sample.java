package methodpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import program.webelement;

public class sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String source=driver.getPageSource();
		System.out.println(source);
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	driver.findElement(By.tagName("input")).sendKeys("laptop");
		driver.findElement(By.id("twotabsearchtextbox"));
		driver.findElement(By.name("field-keywords"));
		driver.findElement(By.className("nav-input nav-progressive-attribute"));
		driver.findElement(By.linkText("Customer Service"));
		driver.findElement(By.partialLinkText("Amazon Assistant"));
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		driver.findElement(By.xpath("//input[@name='field-keywords']"));
		driver.quit();
		
		}

}
