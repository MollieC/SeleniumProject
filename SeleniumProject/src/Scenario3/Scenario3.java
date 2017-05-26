package Scenario3;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class Scenario3 {
//RESETTING THE PASSWORD
	
		//Extent Report
		ExtentReports report;
		ExtentTest test;
		//Driver
		WebDriver driver;
		//Pages
		S3HomePage verifyHomePage;
		S3HomePage homePageItem;
		S3HomePage signInLink;
		S3LogInPage verifyLogInPage;
		S3LogInPage forgottenPassword;
		S3ResetPage verifyResetPage;
		S3ResetPage email;
		S3ResetPage resetButton;
		S3SuccessPage verifyPasswordReset;
	
	 	@Before
	 	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\Sele\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
	 	}
	 	
	 	@Test
		public void testVerifyHomePage(){
	 	//Homepage
	 		//report
	 	report = new ExtentReports("C:\\Users\\Administrator\\Desktop\\Selenium\\ExtentReports\\Scenario3.html", true);
	 	test = report.startTest("Scenario 3 Homepage");
	 	test.log(LogStatus.INFO, "Page successfully loaded");
	 		//test
	 	verifyHomePage = new S3HomePage(driver);
	 	String homePageTitle = verifyHomePage.verifyHomePage();	
	 	assertEquals("Automation Practice Website", homePageTitle);
	 	System.out.println("Home Page Title: " + homePageTitle);
	 	verifyHomePage.clickSignInLink();
	 	test.log(LogStatus.INFO, "Clicked to navigate to sign in page");
		test.log(LogStatus.PASS, "Homepage test passed");

	 	
	 	//Logging In
			//report
		test = report.startTest("Scenario 3 Login Page");
		test.log(LogStatus.INFO, "Page successfully loaded");
			//test
	 	verifyLogInPage = new S3LogInPage(driver);
		String verifyLogIn = verifyLogInPage.verifyLogInPage();
		assertEquals("AUTHENTICATION", verifyLogIn);
		System.out.println("Log in Page: " + verifyLogIn);
		verifyLogInPage.clickResetButton();
		test.log(LogStatus.INFO, "Clicked to navigate to reset password page");
		test.log(LogStatus.PASS, "Test passed");

		
		//Reset Page
			//report
		test = report.startTest("Scenario 3 Reset Password Page");
		test.log(LogStatus.INFO, "Page successfully loaded");
			//test
		verifyResetPage = new S3ResetPage(driver);
		String verifyReset = verifyResetPage.verifyResetPage();
		assertEquals("FORGOT YOUR PASSWORD?", verifyReset);
		System.out.println("Password page: " + verifyReset);
		verifyResetPage.enterEmail();
		test.log(LogStatus.INFO, "Email entered");
		verifyResetPage.clickReset();
		test.log(LogStatus.INFO, "Clicked to reset password");
		test.log(LogStatus.PASS, "Reset page test passed");
		
		//Assert Successful Reset
			//report
		test = report.startTest("Scenario 3 Reset Confirmation Page");
		test.log(LogStatus.INFO, "Page successfully loaded");
			//test
		verifyPasswordReset = new S3SuccessPage(driver);
		String verifyPasswordChange = verifyPasswordReset.verifyResetPassword();
		assertEquals("A confirmation email has been sent to your address: testemail2@live.co.uk", verifyPasswordChange);
		System.out.println(verifyPasswordChange);
		test.log(LogStatus.PASS, "Password successfully changed, test passed");

		test.log(LogStatus.PASS, "Scenario 3 Test Passed");
		
		report.endTest(test);
		report.flush();
	 	}
	 	
		@After
		public void tearDown(){
			try{
				driver.close();
				System.out.println("Scenario 3 Test Finished");
			}catch (Exception e){
				System.out.println(e.toString());
			}
	}
}

	 	/*
		//Inital User Flow
		try{
			//Navitgate to page
			driver.findElement(By.linkText("Sign in")).click();
		
			//Forgotten Password
			driver.findElement(By.linkText("Forgot your password?")).click();
			
			//Enter email
			final String email = "testemail@live.co.uk";
			WebElement emailBox = driver.findElement(By.id("email"));
			emailBox.sendKeys(email);
			
			//Retrieve password
			driver.findElement(By.xpath("//*[@id='form_forgotpassword']/fieldset/p/button/span")).click();
			
			//Assert confirmation
			WebElement textElement = driver.findElement(By.xpath("//*[@id='center_column']/div/p"));
			String text = textElement.getText();
			System.out.println(text);
			
			//Back to homepage
			driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/a/img"));
			 
		}catch(NoSuchElementException e){
			System.out.println(e);
			result = false;
		}
		
		if(result)
			System.out.println("Test Passed");
		else
			System.out.println("Test Failed");
		
		driver.close();
		System.exit(0);
}
*/
