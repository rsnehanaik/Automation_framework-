package frames;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeallchildbrwsr {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		Set<String> allwh = driver.getWindowHandles();
		int count = allwh.size();
		System.out.println(count);
		String p_id = driver.getWindowHandle();
		Thread.sleep(2000);
		allwh.remove(p_id);
		int cb = allwh.size();
		System.out.println(cb);
		for(String wh:allwh) {
			driver.switchTo().window(wh);
			Thread.sleep(2000);
			driver.close();
		}
	}

}
