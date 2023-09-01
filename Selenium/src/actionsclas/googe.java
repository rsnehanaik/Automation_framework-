package actionsclas;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class googe {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).contextClick(ele).perform();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Set<String> allwh = driver.getWindowHandles();
		//TreeSet<String> ts=new TreeSet<String>(allwh);
		ArrayList<String> l=new ArrayList<String>(allwh);
		String a = l.get(1);
		driver.switchTo().window(a);
		
		
	}}

