package testng1;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class test2 {
	@Test()
	public void  data1()
	{
	Reporter.log("hi", true);	
	}
	@Test(dependsOnMethods = "data1")
	public void  data2()
	{
	Reporter.log("hello", true);
	Assert.fail();
	}
	@Test(dependsOnMethods = "data2")
	public void  data3()
	{
	Reporter.log("hellohii", true);	
	}

}
