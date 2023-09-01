package program;

import org.openqa.selenium.edge.EdgeDriver;

public class launchm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key="webdriver.edge.driver";
		String value="./swr/msedgedriver.exe";
		System.setProperty(key, value);
		EdgeDriver driver=new EdgeDriver();

	}

}
