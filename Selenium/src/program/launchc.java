package program;

import org.openqa.selenium.chrome.ChromeDriver;

public class launchc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key="webdriver.chrome.driver";
		String value="./new/chromedriver.exe";
		System.setProperty(key, value);
	ChromeDriver driver=new ChromeDriver();

	

	}

}
