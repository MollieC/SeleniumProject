package Scenario1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Scenario1 {
//LOGGING IN AND SIGNING OUT
	
	//Extent Report
	ExtentReports report;
	ExtentTest test;
	//Driver
	WebDriver driver;
	//Pages
	S1HomePage verifyHomePage;
	S1HomePage homePageItem;
	S1HomePage signInLink;
	S1LogInPage verifyLogInPage;
	S1LogInPage email;
	S1LogInPage password;
	S1LogInPage signInButton;
	S1AccountPage verifyAccountPage;
	S1AccountPage signOutButton;
	
	@Before 
	public void setUp(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\Sele\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	}
		
	@Test
	public void testHomePageLogIn(){
	//Homepage
		//report
	report = new ExtentReports("C:\\Users\\Administrator\\Desktop\\Selenium\\ExtentReports\\Scenario1.html", true);
	test = report.startTest("Homepage");
	test.log(LogStatus.INFO, "Page successfully loaded");
		//test
	verifyHomePage = new S1HomePage(driver);
	String homePageTitle = verifyHomePage.verifyHomePage();	
	assertEquals("Automation Practice Website", homePageTitle);
	System.out.println("Home Page Title: " + homePageTitle);
	verifyHomePage.clickSignInLink();
	test.log(LogStatus.INFO, "Clicked to navigate to sign in page");
	test.log(LogStatus.PASS, "Homepage test passed");
	
	//Logging in 
		//test
	test = report.startTest("Login Page");
	test.log(LogStatus.INFO, "Page successfully loaded");
		//test
	verifyLogInPage = new S1LogInPage(driver);
	String verifyLogIn = verifyLogInPage.verifyLogInPage();
	assertEquals("AUTHENTICATION", verifyLogIn);
	System.out.println("Log in Page: " + verifyLogIn);
	verifyLogInPage.enterEmail();
	test.log(LogStatus.INFO, "Email entered");
	verifyLogInPage.enterPassword();
	test.log(LogStatus.INFO, "Password entered");
	verifyLogInPage.clickSignInButton();
	test.log(LogStatus.INFO, "Clicked sign in");
	test.log(LogStatus.PASS, "Logged in successfully, test passed");
	
	//Logging Out
		//report
	test = report.startTest("MyAccount Page");
	test.log(LogStatus.INFO, "Page successfully loaded");
		//test
	verifyAccountPage = new S1AccountPage(driver);
	String accountTitle = verifyAccountPage.verifyAccountPage();
	assertEquals("MY ACCOUNT", accountTitle);
	System.out.println("Account: " + accountTitle);
	verifyAccountPage.clickSignOut();
	test.log(LogStatus.INFO, "Clicked sign out");
	test.log(LogStatus.PASS, "Logged out successfully, test passed");
	
	test.log(LogStatus.PASS, "Scenario 1 Test Passed");

	report.endTest(test);
	report.flush();
	}
		
	@After
	public void tearDown(){
		try{
			System.out.println("Scenario 1 Test Finished");
			driver.close();
		}catch (Exception e){
			System.out.println(e.toString());
		}
}
}
		
		//Inital User Flow
		/*
		try{
			//Navigate to Webpage
			driver.findElement(By.xpath( "//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click(); //click sign in button
			
			//Enter Email
			final String email = "testemail@live.co.uk";
			WebElement emailBox = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input"));
			emailBox.sendKeys(email);
			
			//Enter Password
			final String password = "qactraining";
			WebElement passwordBox = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/input"));
			passwordBox.sendKeys(password);
			
			//Submit
			driver.findElement(By.xpath("//*[@id='SubmitLogin']/span")).click();
			
			//Order History
			driver.findElement(By.xpath("//*[@id='center_column']/div/div[1]/ul/li[1]/a/span")).click();
			
			//Order
			driver.findElement(By.linkText("OYLHFZEEX")).click();
			
			Thread.sleep(7000);
			
			//Navigate back
			driver.findElement(By.xpath("//*[@id='columns']/div[1]/a[2]")).click();
			
			//My wishlist
			driver.findElement(By.xpath("//*[@id='center_column']/div/div[2]/ul/li/a/span")).click();
			
			//Add to wishlist
			final String wishList = "Printed Summer Dress";
			WebElement addBox = driver.findElement(By.id("name"));
			addBox.sendKeys(wishList);
			
			Thread.sleep(2000);
			
			//Save
			driver.findElement(By.xpath("//*[@id='submitWishlist']/span")).click();
			
			Thread.sleep(3000);
			
			//Back to homepage
			driver.findElement(By.xpath("//*[@id='mywishlist']/ul/li[2]/a/span")).click();
			
			//Sign out
			driver.findElement(By.linkText("Sign out")).click();
			
		}catch(NoSuchElementException e){
			System.out.println(e);
			result = false;
		}
		
		
		if(result)
			System.out.println("Test Passed");
		else
			System.out.println("Test Failed");
		
		//Close driver
		driver.close();
		System.exit(0);
		*/

