package methodpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//a[text()='Amazon Business Card']"));
		Thread.sleep(2000);
           String atbt= ele.getAttribute("href");
           System.out.println(atbt);
          WebElement ele1 = driver.findElement(By.xpath("//a[@href='/minitv?ref_=nav_avod_desktop_topnav']"));
          Thread.sleep(5000);
          String text = ele1.getText();
          System.out.println(text);
           
	}

}
