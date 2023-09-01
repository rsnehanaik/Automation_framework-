package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class youtubexpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("jawan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(8000);
	   driver.findElement(By.xpath("//yt-formatted-string[text()='JAWAN | Title Announcement | Shah Rukh Khan | Atlee | 7th Sep 2023']")).click(); 
	   Thread.sleep(8000);
	   driver.findElement(By.xpath("(//button[@aria-label='Dislike this video'])[1]]")).click();
	   	Thread.sleep(8000);
	}}