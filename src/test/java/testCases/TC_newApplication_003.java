package testCases;

import org.testng.annotations.Test;

import com.passIndia.pageObject.NewApplicationPage;
import com.passIndia.pageObject.homepage;

import Utilities.BaseTest;

public class TC_newApplication_003 extends BaseTest {
	//homepage hp = new homepage(driver);
	NewApplicationPage nap;

	// click on New Application
	@Test(priority=1)
	public void newApplicationClick() throws InterruptedException {
		nap= new NewApplicationPage(driver);
		//Thread.sleep(3000);
		nap.newApplicationClick();
	}

	// confirm user landed on New Application form
	@Test(priority=0)
	public void pageConfirmation() {
		String expectedTitle = "Passport Application Online | New Passport Application – India Passport";
		if (driver.getTitle() == expectedTitle) {
			System.out.println("User landed on New Application form page");
		}
	}

	// filling Service Required
	@Test(priority=2, dependsOnMethods= {"newApplicationClick"})
	public void fillServiceRequired() throws InterruptedException {
		
		//nap= new NewApplicationPage(driver);
		Thread.sleep(1000);
		nap.selectApplyingFor();
		Thread.sleep(1000);
		nap.selectTypeOfApplication();
		Thread.sleep(1000);
		nap.selectTypeOfPassportBooklet();
		Thread.sleep(2000);
	}

	// filling applicant details
	@Test(priority=3)
	public void fillApplicantDetails() {
	
		nap.enterApplicantFirstName("Firstname");
		nap.enterApplicantMiddleName("Middlename");
		nap.enterApplicantSurame("Surname");
		nap.enterAadhaarNo("985632145210");
		nap.selectGender();
		nap.selectMaritalStatus();
		nap.selectPlaceOfBirthOutOfIndia();
		nap.enterPlaceOfBirth("Pune");
		nap.selectCountry();
		nap.selectState();
		nap.selectDistrict();
		nap.selectCitizenshipOfIndiaBy();
		nap.enterPAN(null);
		nap.enterVoterID(null);
		nap.selectEducationalQualification();
		nap.selectEmploymentType();
		nap.selectParentGovtServent();
		nap.selectNonECRcategory();
		nap.enterVisibleDistinguishingMark(null);
		nap.selectAnyOtherName();
		nap.selectHaveYouChangedYourName();
	}

	// filling family details
	@Test(priority=4)
	public void fillFamilyDetails() {
		nap.enterFatherFirstName(null);
		nap.enterFatherMiddleName(null);
		nap.enterFatherSurname(null);
		nap.enterMotherFirstName(null);
		nap.enterMotherMiddleName(null);
		nap.enterMotherSurname(null);
	}

	// filling present residential address details
	@Test(priority=5)
	public void fillingPresentResidentialAddress() {
		nap.selectPresentAddressOutOfIndia();
		nap.enterHouseAndStreet();
		nap.enterVillageOrCity();
		nap.selectCountry1();
		nap.selectState1();
		nap.selectDistrict1();
		nap.selectPoliceStation();
		nap.enterPinCode();
		nap.enterMobileNo();
		nap.enterEmailID();
		nap.selectHaveAPermanentAddress();
	}

	// filling emergency contact details
	@Test(priority=6)
	public void fillingEmergencyContactDetails() {
		nap.enterNameAndAddress();
		nap.enterEmergencyMobileNo();
		nap.enterEmergencyEmailID();
	}

	// filling previous application details
	@Test(priority=7)
	public void fillingPreviousApplicationDetails() {
		nap.selectHaveYouEverHeldAnyIdentityCertificate();
		nap.selectDetailsOfPreviousPassport();
		nap.selectHaveYouEverAppliedForPassport();
	}

	// filling other details
	@Test(priority=8)
	public void fillingOtherDetails() {
		nap.selectAreAnyProceedings();
		nap.selectHasAnyWarrant();
		nap.selectHaveYouAtAnyTime();
		nap.selectHaveYouEverBeenRefusedPassport();
		nap.selectHasYourPassportEverBeenImpounded();
		nap.selectHaveYouEverAppliedForGrantedPoliticalAsylum();
		nap.selectHaveYouEverReturnedToIndiaOnEC();
		nap.selectHasAnOrderProhibitingYourDepartureFromIndia();
	}

	//filling Documents Submitted As Proof
	@Test(priority=9)
	public void fillingDocumentsSubmittedAsProof() {
		nap.selectAddressProof();
		nap.selectIdProof();
		nap.selectEducationProof();
		nap.selectDobProof();
		nap.uploadAddressProof();
		nap.uploadIdProof();
		nap.uploadEducationProof();
		nap.uploadDobProof();
	}
	
	//clicking submit and pay
	@Test(priority=10)
	public void clickSubmitAndPay() {
		nap.submitAndPay();
	}
}
