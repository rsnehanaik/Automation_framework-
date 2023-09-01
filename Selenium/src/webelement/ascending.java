package webelement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.id("month"));
		ArrayList<String> l=new ArrayList<String>();
		TreeSet<String> ts=new TreeSet<String>(l);
		Select s=new Select(ele);
	List<WebElement> opt = s.getOptions();
	int count = opt.size();         //to get count of all options
	System.out.println(count);
	for(  WebElement we:opt) {
		String t=we.getText();
		l.add(t);
	}
	Collections.sort(l);
	for(String t1:l) {
		System.out.println(t1);
	}

	}

}
