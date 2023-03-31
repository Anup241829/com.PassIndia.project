package testCases;

import org.testng.annotations.Test;

import com.passIndia.pageObject.homepage;

import Utilities.BaseTest;

public class TC_linkValidation_002 extends BaseTest {
	@Test
	public void linkValidation() {
		homepage hp = new homepage(driver);
		hp.linkValidation(hp.NewApplication);
		hp.linkValidation(hp.ReissuePassport);
		hp.linkValidation(hp.TrackApplication);
		hp.linkValidation(hp.RequiredDocuments);
		hp.linkValidation(hp.Faq);
		hp.linkValidation(hp.Fees);
		hp.linkValidation(hp.ContactUs);
	}

}
