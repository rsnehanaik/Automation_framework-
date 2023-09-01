package groups;

import org.testng.annotations.Test;

public class group_script {
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
