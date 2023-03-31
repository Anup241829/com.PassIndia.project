
package Utilities;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import globalObject.ObjectPage;

public class BaseTest extends ObjectPage {

	private Properties objproperties;
	private String browserName;
	public WebDriver driver;
	
	/*
	public WebDriver initializerDriver() throws IOException {

		objproperties = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\Resourses\\config.properties");
		objproperties.load(file);
		browserName = objproperties.getProperty("browser");

//System.setProperty("Webdriver.chrome.driver",(System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe"));

		
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("IE")) {
			driver = new FirefoxDriver();
		}
	
		driver.manage().deleteAllCookies();
		
		//this.setWebDriver(driver);
		return driver;

	}
	*/
	@BeforeClass
	
	public void launchApplication() throws IOException {
		System.setProperty("Webdriver.chrome.driver","\\Drivers\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("start-maximized");
		op.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(op);
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://passport.quiestatechnologies.com/index.php");
		
	}

	@AfterClass //(enabled=false)
	public void tearDown() {
		driver.close();
	}

	/*
	 * public void captureScreen(WebDriver driver, String tName) throws IOException
	 * { TakesScreenshot ts = (TakesScreenshot) driver;
	 * 
	 * File source = ts.getScreenshotAs(OutputType.FILE); File target = new
	 * File(System.getProperty("user.dir") + "/Screenshots/" + tName + ".png");
	 * FileUtils.copyFile(source, target); System.out.println("Screenshot taken"); }
	 */
	
	
	
	
	
}
