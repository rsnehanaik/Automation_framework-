package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/groupindex.html");
		List<WebElement> chk = driver.findElements(By.xpath("//input"));
		int c = chk.size();
		System.out.println(c);
		for(int i=0;i<=c-1;i++){  //select checkbox
		WebElement ch = chk.get(i);
		Thread.sleep(2000);
		ch.click();
	}
		for(int i=c-1;i>=0;i--)  //deselect checkbox in reverse order
		{
			WebElement ch = chk.get(i);
			Thread.sleep(2000);
			ch.click();
		}
		
	}

}
