package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/webelement.html");
		Thread.sleep(2000);
	//WebElement	ele=driver.findElement(By.xpath("//input[@id='a1']"));
//boolean b=ele.isDisplayed();
//WebElement	ele=driver.findElement(By.xpath("//input[@id='a2']"));
//boolean b=ele.isEnabled();
WebElement	ele=driver.findElement(By.xpath("//input[@id='a3']"));
boolean b=ele.isSelected();
if(b) {
	System.out.println("element is dis/en/selplayed");
}else {
	System.out.println("element is not dis/en/selplayed");
}//ele.sendKeys("admin");
	}

}
