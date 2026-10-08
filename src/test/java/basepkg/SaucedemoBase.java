package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Page.SaucedemoCartpage;
import Page.SaucedemoLoginpage;
import Page.saucedemoHomepage;
import Page.saucedemocheckout;

public class SaucedemoBase {
public static WebDriver driver;
public static WebDriver wait;

public static ExtentReporter reporter;
public static ExtentTest test;
public static ExtentReports extent;


public SaucedemoLoginpage login;
public saucedemoHomepage Home;
public SaucedemoCartpage cart;
public saucedemocheckout checkout;

	@BeforeTest
	public void setUp()
	{
		reporter=new ExtentSparkReporter("./Reports/MyReport1.html");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver=new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();}
		@BeforeMethod
		public void test() {
			login=new SaucedemoLoginpage(driver);
			Home=new saucedemoHomepage(driver);
			cart=new SaucedemoCartpage(driver);
			checkout=new saucedemocheckout(driver);
		
		}
		
}
