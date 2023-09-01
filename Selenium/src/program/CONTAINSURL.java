package program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CONTAINSURL {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
	String title=driver.getCurrentUrl();
	System.out.println(title);

	if(title.contains("https"))
			{
		System.out.println("testcase pass");
		
			}else {
				System.out.println("testcase fail")	;

	}

}
}