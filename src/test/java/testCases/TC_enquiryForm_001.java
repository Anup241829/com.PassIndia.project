package testCases;

import org.testng.annotations.Test;

import com.passIndia.pageObject.homepage;

import Utilities.BaseTest;

public class TC_enquiryForm_001 extends BaseTest {
	
    
	@Test
	public void FirstPage() throws InterruptedException {
		
		//ExtentTest test = ObjectPage.getExtentTest();
	    //test.log(Status.INFO, "Enquiry Form Test");
		
		homepage hp = new homepage(driver);
		
		hp.enterName();
		Thread.sleep(1000);
		//test.log(Status.PASS,"Enter Name");
		
		hp.email();
		Thread.sleep(1000);
		//test.log(Status.PASS,"Enter Email");
		
		hp.mobile();
		Thread.sleep(1000);
		//test.log(Status.PASS,"Enter Mobile No");
		
		hp.select();
		Thread.sleep(1000);
		//test.log(Status.PASS,"Select Drop Down");
		
		hp.submit();
		//Thread.sleep(2000);
		//test.log(Status.PASS,"Enquiry Form Submited");
	}
}
