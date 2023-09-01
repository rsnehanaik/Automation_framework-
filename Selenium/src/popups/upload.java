package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\USER\\Desktop\\popup.html");
		WebElement ele = driver.findElement(By.name("upload file"));
		ele.sendKeys("C:\\Users\\USER\\Desktop\\popup.html");
	}}
		