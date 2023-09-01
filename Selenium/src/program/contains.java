package program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class contains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
	String title=driver.getTitle();
	System.out.println(title);
	
	if(title.contains("Facebook"))
			{
		System.out.println("testcase pass");
		
			}else {
				System.out.println("testcase fail")	;

	}

}}
