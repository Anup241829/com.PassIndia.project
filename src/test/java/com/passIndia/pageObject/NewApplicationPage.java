package com.passIndia.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import globalObject.ObjectPage;




public class NewApplicationPage {
	//public WebDriver driver1 ;
	public static WebDriver driver = ObjectPage.getWebDriver();
	//public WebDriver driver;

	// Initialisation
	public NewApplicationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	//new application tab
	@FindBy(xpath = "//div[@class=\"container\"]/div/ul/li/a[text()='New Application']")
	WebElement NewApplication;
	
	//usage
	public void newApplicationClick() throws InterruptedException {
		Thread.sleep(3000);
		NewApplication.click();
	}
	
	// -------------------------------- New Application form -> 1.Service Required
	// Declaration
	@FindBy(id = "1_application_for")
	WebElement applyingFor;
	@FindBy(id = "sel_type_appl")
	WebElement typeOfApplication;
	@FindBy(id="1_type_of_booklet")
	WebElement typeOfPassportBooklet;

	// Usage
	// New Application form -> 1. Service Required

	public void selectApplyingFor() {
		Select select = new Select(applyingFor);
		select.selectByVisibleText("New / Fresh Passport");
	}

	public void selectTypeOfApplication() {
		Select select = new Select(typeOfApplication);
		select.selectByVisibleText("Tatkaal");
	}

	public void selectTypeOfPassportBooklet() {
		Select select = new Select(typeOfPassportBooklet);
		select.selectByVisibleText("60 Pages");
	}

	// -------------------------------- New Application form -> 2.Applicant details
	// Declaration
	@FindBy(xpath = "//input[@placeholder=\"Applicant First Name\"]")
	WebElement applicantFirstName;
	@FindBy(xpath = "//input[@id=\"txt_middlename\"]")
	WebElement applicantMiddleName;
	@FindBy(xpath = "//input[@placeholder=\"Surname Name\"]")
	WebElement applicantSurname;
	@FindBy(xpath = "//input[@id=\"txt_aadharno\"]")
	WebElement aadhaarNo;
	@FindBy(xpath = "//select[@id=\"contact_2_gender\"]")
	WebElement gender;
	@FindBy(xpath = "//select[@id=\"contact_2_marital_status\"]")
	WebElement maritalStatus;
	@FindBy(xpath = "//input[@id=\"contact_2_dob\"]")
	WebElement dateOfBirth;
	@FindBy(xpath = "//select[@id=\"sel_place_birth\"]")
	WebElement birthPlaceDropdown;
	@FindBy(xpath = "//input[@id=\"contact_2_village\"]")
	WebElement placeOfBirth;
	@FindBy(xpath = "//select[@id=\"india_country\"]")
	WebElement country;
	@FindBy(xpath = "//select[@id=\"contact_2_state\"]")
	WebElement state;
	@FindBy(xpath = "//select[@id=\"contact_2_district\"]")
	WebElement district;
	@FindBy(xpath = "//select[@id=\"sel_citizenship\"]")
	WebElement citizenshipOfIndiaBy;
	@FindBy(xpath = "//input[@id='txt_pan']")
	WebElement PAN;
	@FindBy(xpath = "//input[@id=\"txt_voter_id\"]")
	WebElement voterID;
	@FindBy(xpath = "//select[@id=\"c_2_qualification\"]")
	WebElement educationalQualification;
	@FindBy(xpath = "//select[@id=\"sel_emp_type\"]")
	WebElement employmentType;
	@FindBy(xpath = "//select[@id=\"contact_2_sapouse\"]")
	WebElement isYourParent;
	@FindBy(xpath = "//select[@id=\"contact_2_non_ecr\"]")
	WebElement nonECRcategory;
	@FindBy(xpath = "//input[@id=\"txt_visible_dmark\"]")
	WebElement visibleDistinguishingMark;
	@FindBy(xpath = "//select[@id=\"sel_any_aliases\"]")
	WebElement anyOtherName;
	@FindBy(xpath = "//select[@id=\"sel_chg_name\"]")
	WebElement changedYourname;

	// Usage
	// New Application form -> 2. Applicant details
	public void enterApplicantFirstName(String value) {
		applicantFirstName.sendKeys(value);
	}

	public void enterApplicantMiddleName(String value) {
		applicantMiddleName.sendKeys(value);
	}

	public void enterApplicantSurame(String value) {
		applicantSurname.sendKeys(value);
	}

	public void enterAadhaarNo(String aadhaarNumber) {
		aadhaarNo.sendKeys(aadhaarNumber);
	}

	public void selectGender() {
		Select select = new Select(gender);
		select.selectByVisibleText("Male");
	}

	public void selectMaritalStatus() {
		Select select = new Select(maritalStatus);
		select.selectByVisibleText("Single");
	}

	public void selectDOB() {

	}

	public void selectPlaceOfBirthOutOfIndia() {
		Select select = new Select(birthPlaceDropdown);
		select.selectByVisibleText("No");
	}

	public void enterPlaceOfBirth(String place) {
		placeOfBirth.sendKeys(place);
	}

	public void selectCountry() {
		Select select = new Select(country);
		select.selectByVisibleText("INDIA");
	}

	public void selectState() {
		Select select = new Select(state);
		select.selectByVisibleText("Maharashtra");
	}

	public void selectDistrict() {
		Select select = new Select(district);
		select.selectByVisibleText("Pune");
	}

	public void selectCitizenshipOfIndiaBy() {
		Select select = new Select(citizenshipOfIndiaBy);
		select.selectByVisibleText("Birth");
	}

	public void enterPAN(String number) {
		PAN.sendKeys(number);
	}

	public void enterVoterID(String number) {
		voterID.sendKeys(number);
	}

	public void selectEducationalQualification() {
		Select select = new Select(educationalQualification);
		select.selectByVisibleText("Graduate And Above");
	}

	public void selectEmploymentType() {
		Select select = new Select(employmentType);
		select.selectByVisibleText("Private");
	}

	public void selectParentGovtServent() {
		Select select = new Select(isYourParent);
		select.selectByVisibleText("Yes");
	}

	public void selectNonECRcategory() {
		Select select = new Select(nonECRcategory);
		select.selectByVisibleText("No");
	}

	public void enterVisibleDistinguishingMark(String mark) {
		visibleDistinguishingMark.sendKeys(mark);
	}

	public void selectAnyOtherName() {
		Select select = new Select(anyOtherName);
		select.selectByVisibleText("No");
	}

	public void selectHaveYouChangedYourName() {
		Select select = new Select(changedYourname);
		select.selectByVisibleText("No");
	}

	// -------------------------------- New Application form -> 3.Family details
	// Declaration
	@FindBy(xpath = "//input[@id=\"myform_3_father_f_name\"]")
	WebElement fatherFirstName;
	@FindBy(xpath = "//input[@id=\"myform_3_father_m_name\"]")
	WebElement fatherMiddleName;
	@FindBy(xpath = "//input[@id=\"myform_3_father_l_name\"]")
	WebElement fatherSurname;
	@FindBy(xpath = "//input[@id=\"myform_3_mother_f_name\"]")
	WebElement motherFirstName;
	@FindBy(xpath = "//input[@id=\"myform_3_mother_m_name\"]")
	WebElement motherMiddleName;
	@FindBy(xpath = "//input[@id=\"myform_3_mother_l_name\"]")
	WebElement motherSurname;
	@FindBy(xpath = "//input[@id=\"myform_3_gard_f_name\"]")
	WebElement legalGuardianFirstName;
	@FindBy(xpath = "//input[@id=\"myform_3_gard_m_name\"]")
	WebElement legalGuardianMiddleName;
	@FindBy(xpath = "//input[@id=\"myform_3_gard_l_name\"]")
	WebElement legalGuardianSurname;

	// Usage
	// New Application form -> 3. Family details
	public void enterFatherFirstName(String fname) {
		fatherFirstName.sendKeys(fname);
	}

	public void enterFatherMiddleName(String mname) {
		fatherMiddleName.sendKeys(mname);
	}

	public void enterFatherSurname(String sname) {
		fatherSurname.sendKeys(sname);
	}

	public void enterMotherFirstName(String fname) {
		motherFirstName.sendKeys(fname);
	}

	public void enterMotherMiddleName(String mname) {
		motherMiddleName.sendKeys(mname);
	}

	public void enterMotherSurname(String sname) {
		motherSurname.sendKeys(sname);
	}

	// -------------------------------- New Application form -> 4. Present Residential Address Details
	// Declaration
	@FindBy(xpath = "//select[@id='sel_present_adr_1']")
	WebElement presentAddressOutOfIndia;
	@FindBy(xpath = "//input[@id=\"contact_4_house_no\"]")
	WebElement houseAndStreet;
	@FindBy(xpath = "//input[@id=\"contact_4_town\"]")
	WebElement villageOrTownOrCity;
	@FindBy(xpath = "//select[@id=\"contact_4_country\"]")
	WebElement country1;
	@FindBy(xpath = "//select[@id=\"state-list\"]")
	WebElement state1;
	@FindBy(xpath = "//select[@id=\"district-list\"]")
	WebElement district1;
	@FindBy(xpath = "//select[@id=\"p_station_list\"]")
	WebElement policeStation;
	@FindBy(xpath = "//input[@id=\"contact_4_pincode\"]")
	WebElement pinCode;
	@FindBy(xpath = "//input[@id=\"contact_4_mobile\"]")
	WebElement mobileNo;
	@FindBy(xpath = "//input[@id=\"contact_4_email\"]")
	WebElement emailID;
	@FindBy(xpath = "//select[@id=\"sel_permanent_adr\"]")
	WebElement haveAPermanentAddress;

	// Usage
	// New Application form -> 4. Present Residential Address Details
	public void selectPresentAddressOutOfIndia() {
		Select select = new Select(presentAddressOutOfIndia);
		select.selectByVisibleText("No");
	}

	public void enterHouseAndStreet() {
		houseAndStreet.sendKeys("101, Lotus road");
	}

	public void enterVillageOrCity() {
		villageOrTownOrCity.sendKeys("Delhi");
	}

	public void selectCountry1() {
		Select select = new Select(country1);
		select.selectByVisibleText("INDIA");
	}

	public void selectState1() {
		Select select = new Select(state1);
		select.selectByVisibleText("Delhi");
	}

	public void selectDistrict1() {
		Select select = new Select(state1);
		select.selectByVisibleText("New Delhi");
	}

	public void selectPoliceStation() {
		Select select = new Select(policeStation);
		select.selectByVisibleText("Mandir Marg");
	}

	public void enterPinCode() {
		pinCode.sendKeys("888999");
	}

	public void enterMobileNo() {
		mobileNo.sendKeys("8899889900");
	}

	public void enterEmailID() {
		emailID.sendKeys("demouser@gmail.com");
	}

	public void selectHaveAPermanentAddress() {
		Select select = new Select(haveAPermanentAddress);
		select.selectByVisibleText("No");
	}

	// ------------------New Application form -> 5. Emergency Contact Details
	// Declaration
	@FindBy(xpath = "//textarea[@id=\"contact_5_name_address\"]")
	WebElement nameAndAddress;
	@FindBy(xpath = "//input[@id=\"contact_5_mobile\"]")
	WebElement emergencyMobileNo;
	@FindBy(xpath = "//input[@id=\"email5\"]")
	WebElement emergencyEmailID;

	// Usage
	// New Application form -> 5. Emergency Contact Details
	public void enterNameAndAddress() {
		nameAndAddress.sendKeys("Mr. Amar Akbar Anthony, A/P - Gurudwara Chowk, PUNE ");
	}

	public void enterEmergencyMobileNo() {
		emergencyMobileNo.sendKeys("9988556622");
	}

	public void enterEmergencyEmailID() {
		emergencyEmailID.sendKeys("demouser@gmail.com");
	}

	// -------------------------------- New Application form -> 6. Previous
	// Application Details
	// Declaration
	@FindBy(xpath = "//select[@id=\"sel_identity_cer\"]")
	WebElement haveYouEverHoldAnyIdentityCertificate;
	@FindBy(xpath = "//select[@id=\"sel_prev_cd_opass\"]")
	WebElement detailsOfPreviousPassport;
	@FindBy(xpath = "id=\"sel_appl_not_issue\"")
	WebElement haveYouEverAppliedForPassport;

	// Usage
	// New Application form -> 6. Previous Application Details
	public void selectHaveYouEverHeldAnyIdentityCertificate() {
		Select select = new Select(haveYouEverHoldAnyIdentityCertificate);
		select.selectByVisibleText("No");
	}

	public void selectDetailsOfPreviousPassport() {
		Select select = new Select(detailsOfPreviousPassport);
		select.selectByIndex(0);
	}

	public void selectHaveYouEverAppliedForPassport() {
		Select select = new Select(haveYouEverAppliedForPassport);
		select.selectByVisibleText("No");
	}

	// -------------------------------- New Application form -> 7. Other Details
	// Declaration
	@FindBy(xpath="//select[@id=\"sel_arrest_warrant\"]")
	WebElement areAnyProceedings;
	@FindBy(xpath="//select[@id=\"sel_warrant\"]")
	WebElement hasAnyWarrant;
	@FindBy(xpath="//select[@id=\"sel_criminal_offence\"]")
	WebElement haveYouAtAnyTime;
	@FindBy(xpath="//select[@id=\"sel_denied_passport\"]")
	WebElement haveYouEverBeenRefusedPassport;
	@FindBy(xpath="//select[@id=\"sel_passport_revoked\"]")
	WebElement hasYourPassportEverBeenImpounded;
	@FindBy(xpath="//select[@id=\"sel_political_asylum\"]")
	WebElement haveYouEverAppliedForGrantedPoliticalAsylum;
	@FindBy(xpath="id=\"sel_ec\"")
	WebElement haveYouEverReturnedToIndiaOnEC;
	@FindBy(xpath="//select[@id=\"prohibit_warrant\"]")
	WebElement hasAnOrderProhibitingYourDepartureFromIndia;
	
	// Usage
	// New Application form -> 7. Other Details
	public void selectAreAnyProceedings() {
		Select select = new Select(areAnyProceedings);
		select.selectByVisibleText("No");
	}
	public void selectHasAnyWarrant() {
		Select select = new Select(hasAnyWarrant);
		select.selectByVisibleText("No");
	}
	public void selectHaveYouAtAnyTime() {
		Select select = new Select(haveYouAtAnyTime);
		select.selectByVisibleText("No");
	}
	public void selectHaveYouEverBeenRefusedPassport() {
		Select select = new Select(haveYouEverBeenRefusedPassport);
		select.selectByVisibleText("No");
	}
	public void selectHasYourPassportEverBeenImpounded() {
		Select select = new Select(hasYourPassportEverBeenImpounded);
		select.selectByVisibleText("No");
	}
	public void selectHaveYouEverAppliedForGrantedPoliticalAsylum() {
		Select select = new Select(haveYouEverAppliedForGrantedPoliticalAsylum);
		select.selectByVisibleText("No");
	}
	public void selectHaveYouEverReturnedToIndiaOnEC() {
		Select select = new Select(haveYouEverReturnedToIndiaOnEC);
		select.selectByVisibleText("No");
	}
	public void selectHasAnOrderProhibitingYourDepartureFromIndia() {
		Select select = new Select(hasAnOrderProhibitingYourDepartureFromIndia);
		select.selectByVisibleText("No");
	}
	
	// -------------------------------- New Application form -> 8. Documents Submitted As Proof
	// Declaration
	@FindBy(xpath="//select[@id=\"contact_8_document_proof\"]")
	WebElement addressProof;
	@FindBy(xpath="//select[@id=\"contact_8_id_proof\"]")
	WebElement IdProof;
	@FindBy(xpath="//select[@id=\"contact_8_education_proof\"]")
	WebElement educationProof;
	@FindBy(xpath="//select[@id=\"contact_8_dob_proof\"]")
	WebElement DobProof;
	@FindBy(xpath="//input[@name=\"address_doc\"]")
	WebElement uploadAddressProof;
	@FindBy(xpath="//input[@name=\"id_doc\"]")
	WebElement uploadIdProof;
	@FindBy(xpath="//input[@name=\"education_doc\"]")
	WebElement uploadEducationProof;
	@FindBy(xpath="//input[@name=\"dob_doc\"]")
	WebElement uploadDobProof;
	
	
	// Usage
	// New Application form -> 8. Documents Submitted As Proof
	public void selectAddressProof() {
		Select select = new Select(addressProof);
		select.selectByVisibleText("Aadhaar Card");
	}
	public void selectIdProof() {
		Select select = new Select(IdProof);
		select.selectByVisibleText("Aadhaar Card");
	}
	public void selectEducationProof() {
		Select select = new Select(educationProof);
		select.selectByVisibleText("10th Certificate");
	}
	public void selectDobProof() {
		Select select = new Select(DobProof);
		select.selectByVisibleText("Aadhaar Card");
	}
	
	public void uploadAddressProof() {
		
	}
	public void uploadIdProof() {
		
	}
	public void uploadEducationProof() {
	
	}
	public void uploadDobProof() {
	
	}
	
	
	// -------------------------------- New Application form -> Submit&Pay
	//Declaration
	@FindBy(xpath="//button[@class=\"btn btn-warning\"]")
	WebElement submitAndPay;
	
	//Usage
	public void submitAndPay() {
		submitAndPay.click();
	}
	
	
	//pagescroll
	/*
		public void pageScroll(WebElement webElement) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", webElement);
		}
	*/
	

}
