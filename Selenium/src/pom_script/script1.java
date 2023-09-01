package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactory;
public class script1 {
	@FindBy(id="firstName")
	private WebElement fname;
	@FindBy(id="lastName")
	private WebElement lname;
	@FindBy(id="userEmail")
	private WebElement usrname;
	@FindBy(xpath="//label[text()='Female']")
	private WebElement radio;
	@FindBy(id="userNumber")
	private WebElement num;
	@FindBy(xpath="//label[text()='Music']")
	private WebElement hob;
	
	@FindBy(id="submit")
	private WebElement submit;
	public script1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void fnamee(String fn)
	{
		fname.sendKeys(fn);
	}
	public void lnamee(String ln)
	{
		lname.sendKeys(ln);
	}
	public void unamee(String un)
	{
		usrname.sendKeys(un);
	}
	public void gender()
	{
		radio.click();
	}
	public void numb(String no)
	{
		num.click();
	}
	public void hoby()
	{
		hob.click();
	}
	
	public void ok()
	{
		submit.click();
	}
	

}


