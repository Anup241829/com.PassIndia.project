package com.passIndia.pageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;

import globalObject.ObjectPage;

public class homepage {

	public static WebDriver driver; //= ObjectPage.getWebDriver();
	//ExtentTest test = ObjectPage.getExtentTest();

	// Initialization
	public homepage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// Declaration
	// enquiry form
	@FindBy(xpath = "//input[@id='name']")
	WebElement txtName;

	@FindBy(xpath = "//input[@id='email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='phone']")
	WebElement txtPhone;

	@FindBy(xpath = "//select[@name='service_type']")
	WebElement selectDropdown;

	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitButton;

	// Usage
	// enguiry form
	public void enterName() {
		txtName.sendKeys("Demo User");
	}

	public void email() {
		txtEmail.sendKeys("demo@email.com");
	}

	public void mobile() {
		txtPhone.sendKeys("8888899999");
	}

	public void submit() {
		submitButton.click();
	}

	public void select() {
		Select select = new Select(selectDropdown);
		select.selectByVisibleText("New Passport");
	}

	// Declaration
	// top links validation
	@FindBy(xpath = "(//a[@href='new-passport.php'])[1]")
	public WebElement NewApplication;
	@FindBy(xpath = "(//a[@href='reissue-passport.php'])[1]")
	public WebElement ReissuePassport;
	@FindBy(xpath = "(//a[@href='track.php'])[1]")
	public WebElement TrackApplication;
	@FindBy(xpath = "(//a[@href='required-document.php'])[1]")
	public WebElement RequiredDocuments;
	@FindBy(xpath = "(//a[@href='faq.php'])[1]")
	public WebElement Faq;
	@FindBy(xpath = "(//a[@href='fee.php'])[1]")
	public WebElement Fees;
	@FindBy(xpath = "(//a[@href='contact.php'])[1]")
	public WebElement ContactUs;

	// Usage
	// top links validation
	public void linkValidation(WebElement element) {
		//WebDriverWait wt = new WebDriverWait(driver, null);
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
		wt.until(ExpectedConditions.elementToBeClickable(element));
		//System.out.println(element + "is clickable");
	}

	
}
