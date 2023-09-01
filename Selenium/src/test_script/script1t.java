package test_script;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import generic_script.script2;
import pom_script.script1;


public class script1t extends script2 {
	@Test
	public void click() throws InterruptedException
		{
		
		script1 s=new script1(driver);
		s.fnamee("sneha");
		Thread.sleep(2000);
		s.lnamee("nk");
		Thread.sleep(2000);
		s.unamee("s@gmail.com");Thread.sleep(2000);
		s.gender();Thread.sleep(2000);
		s.numb("88888886543");Thread.sleep(2000);
		s.hoby();Thread.sleep(2000);
		s. ok();
}}
