package program;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe" );
		FirefoxDriver driver1=new FirefoxDriver();
	}

}
