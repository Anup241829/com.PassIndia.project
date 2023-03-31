package globalObject;



import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

public class ObjectPage {
	
	
	public static WebDriver driver;
	public static ExtentTest objextenttest;
	
	public void setWebDriver(WebDriver driver) {
		
		ObjectPage.driver=driver;
	}
	public static WebDriver getWebDriver() {
		return driver;
	}
	public static void setExtentTest(ExtentTest objextentTest) {
		ObjectPage.objextenttest= objextenttest;
	}
	
	public static ExtentTest getExtentTest() {
		return objextenttest;
	}

}
