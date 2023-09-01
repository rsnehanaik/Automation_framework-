package testng2;

import org.testng.annotations.Test;

public class groups {
 @Test(groups= {"sanity"})
 public void test1(){
	 System.out.println("compose");
 }
 @Test(groups= {"sanity","regression"})
 public void test2(){
	 System.out.println("sentitems");
 }
 @Test(groups= {"sanity"})
 public void test3(){
	 System.out.println("trash");
 }

}
