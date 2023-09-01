package testng1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import program.webelement;



public class pom {
	@FindBy(id="email")
	private WebElement untbox;
	@FindBy(name="pass")
	private WebElement pwtbox;
	@FindBy(name="login")
	private WebElement loginbtn;
	public pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void username(String un) {
		untbox.sendKeys(un);
	}
	public void password(String pw) {
		pwtbox.sendKeys(pw);
	}
	public void clicklogin() {
		loginbtn.click();
	}

}
