package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopuop {
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.name("cusid")).sendKeys("admin");
	driver.findElement(By.name("submit")).click();
	Thread.sleep(2000);
	Alert a=driver.switchTo().alert();
	String t = a.getText();
	System.out.println(t);
	a.accept();

}
}