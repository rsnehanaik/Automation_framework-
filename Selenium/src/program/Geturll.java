package program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Geturll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meesho.com");
		Thread.sleep(2000);
	//String title=driver.getTitle();
	//System.out.println(title);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	//String src=driver.getPageSource();
	//System.out.println(src);

	}

}
