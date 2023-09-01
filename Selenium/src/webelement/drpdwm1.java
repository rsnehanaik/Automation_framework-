package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drpdwm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/src%20code/multidropdwn.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.id("countries"));
		Select s=new Select(ele);
		boolean b = s.isMultiple();
		if(b) {
			System.out.println("mutiple select dropdown");
		}
		else {
			System.out.println("not a multi select dropdown");
		}
	}

}
