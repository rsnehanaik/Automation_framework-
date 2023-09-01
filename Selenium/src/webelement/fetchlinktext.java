package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchlinktext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		           int c = link.size();
		           System.out.println(c);
		           Thread.sleep(2000);
		           for(int i=0;i<c;i++)
		           {
		        	 WebElement we = link.get(i);
		        	String t = we.getText();   //to fetch text of all links
		        	 System.out.println(t);
		           }
		           for(int i=c-1;i>=0;i--)  //to fetch text of all links in reverse order
		           {
		        	 WebElement we = link.get(i);
		        	String t = we.getText();   //to fetch text of all links
		        	 System.out.println(t);

	}

}}
