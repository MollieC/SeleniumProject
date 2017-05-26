package Scenario4;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Scenario4 {
//CREATING AN ACCOUNT	
	
		//Extent Report
		ExtentReports report;
		ExtentTest test;
		WebDriver driver;
		//Pages
		S4HomePage verifyHomePage;
		S4HomePage signInLink;
		S4LogInPage verifyLogInPage;
		S4LogInPage inputEmail;
		S4LogInPage createAccountButton;
		S4AccountCreation verifyAccountCreation;
		S4AccountCreation gender;
		S4AccountCreation firstName;
		S4AccountCreation lastName;
		S4AccountCreation password;
		S4AccountCreation DOBday;
		S4AccountCreation DOBmonth;
		S4AccountCreation DOByear;
		S4AccountCreation firstName1;
		S4AccountCreation lastName1;
		S4AccountCreation address;
		S4AccountCreation city;
		S4AccountCreation state;
		S4AccountCreation postcode;
		S4AccountCreation country;
		S4AccountCreation phone;
		S4AccountCreation alias;
		S4AccountCreation register;
		S4AccountPage myAccount;
		S4AccountPage logOut;

		@Before
		public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\Sele\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		}
		
		@Test
		public void testCreateAccount() throws InterruptedException{
		//Homepage
			//report
		report = new ExtentReports("C:\\Users\\Administrator\\Desktop\\Selenium\\ExtentReports\\Scenario4.html", true);
		test = report.startTest("Scenario 4 Homepage");
		test.log(LogStatus.INFO, "Page successfully loaded");
			//test
		verifyHomePage = new S4HomePage(driver);
		String homePageTitle = verifyHomePage.verifyHomePage();	
		assertEquals("Automation Practice Website", homePageTitle);
		System.out.println(homePageTitle);
		verifyHomePage.clickSignInLink();
		test.log(LogStatus.INFO, "Clicked to navigate to sign in page");
		test.log(LogStatus.PASS, "Homepage test passed");
		
		//Login page
			//reports
		test = report.startTest("Scenario 4 Login Page");
		test.log(LogStatus.INFO, "Page successfully loaded");
			//test
		verifyLogInPage = new S4LogInPage(driver);
		String verifyLogIn = verifyLogInPage.verifyLogInPage();
		assertEquals("AUTHENTICATION", verifyLogIn);
		System.out.println(verifyLogIn);
		verifyLogInPage.inputEmail();
		test.log(LogStatus.INFO, "Email entered");
		verifyLogInPage.clickCreateAccount();
		test.log(LogStatus.INFO, "Clicked to navigate to account creation page");
		test.log(LogStatus.PASS, "Login page test passed");
		
		//Create account
			//reports
		test = report.startTest("Scenario 4 Account Creation Page");
		test.log(LogStatus.INFO, "Page successfully loaded");
		verifyAccountCreation = new S4AccountCreation(driver);
		String verifyCreateAccount = verifyAccountCreation.verifyAccountCreation();
		assertEquals("CREATE AN ACCOUNT", verifyCreateAccount);
		System.out.println(verifyCreateAccount);
		verifyAccountCreation.clickGender();
		test.log(LogStatus.INFO, "Gender entered");
		verifyAccountCreation.enterFirstName();
		test.log(LogStatus.INFO, "First name entered");
		verifyAccountCreation.enterLastName();
		test.log(LogStatus.INFO, "Last name entered");
		verifyAccountCreation.enterPassword();
		test.log(LogStatus.INFO, "Password entered");
		verifyAccountCreation.clickDOBDays();
		verifyAccountCreation.clickDOBMonth();
		verifyAccountCreation.clickDOBYear();
		test.log(LogStatus.INFO, "Date of birth entered");
		verifyAccountCreation.enterFirstName1();
		test.log(LogStatus.INFO, "First name entered again");
		verifyAccountCreation.enterLastName1();
		test.log(LogStatus.INFO, "Last name entered again");
		verifyAccountCreation.enterAddress();
		test.log(LogStatus.INFO, "Address entered");
		verifyAccountCreation.enterCity();
		test.log(LogStatus.INFO, "City entered");
		verifyAccountCreation.clickState();
		test.log(LogStatus.INFO, "State entered");
		verifyAccountCreation.enterPostcode();
		test.log(LogStatus.INFO, "Postcode entered");
		verifyAccountCreation.clickCountry();
		test.log(LogStatus.INFO, "Country entered");
		verifyAccountCreation.enterPhone();
		test.log(LogStatus.INFO, "Phone number entered");
		verifyAccountCreation.enterAlias();
		test.log(LogStatus.INFO, "Address alias entered");
		verifyAccountCreation.clickRegister();
		test.log(LogStatus.INFO, "Clicked to register account");
		test.log(LogStatus.PASS, "Account created successfully, test passed");
		
		//Account verification/log out
			//report
		test = report.startTest("Scenario 4 MyAccount Page");
		test.log(LogStatus.INFO, "Page successfully loaded");
			//test
		myAccount = new S4AccountPage(driver);
		String verifyAccount = myAccount.verifyMyAccount();
		assertEquals("MY ACCOUNT", verifyAccount);
		System.out.println(verifyAccount);
		myAccount.clickSignOut();
		test.log(LogStatus.INFO, "Clicked sign out");
		test.log(LogStatus.PASS, "Logged out successfully, test passed");
		
		test.log(LogStatus.PASS, "Scenario 4 Test Passed");

		report.endTest(test);
		report.flush();
		}
		
		@After
		public void tearDown(){
			try{
				driver.close();
				System.out.println("Scenario 4 Test Finished");
			}catch (Exception e){
				System.out.println(e.toString());
			}
	}
}

		
		/*
		//User Flow
		try{
			//Go to sign in
			driver.findElement(By.linkText("Sign in")).click();
			
			try{
				//Input email and Create an account
				final String userName = "testemail5@live.co.uk";
				WebElement emailAddressBox = driver.findElement(By.name("email_create"));
				emailAddressBox.sendKeys(userName);
				driver.findElement(By.xpath("//*[@id='SubmitCreate']/span")).click();
				}catch(Exception e){
					System.out.println(e + "This email already exists in the website database");
				}
				
				//Wait
				Thread.sleep(2000);
				
				//Input Title
				driver.findElement(By.id("id_gender2")).click();
				
				//Input First Name
				final String firstName = "Mollie";
				WebElement firstNameBox = driver.findElement(By.name("customer_firstname"));
				firstNameBox.sendKeys(firstName);
				
				//Input Second Name
				final String lastName = "Cooke";
				WebElement lastNameBox = driver.findElement(By.name("customer_lastname"));
				lastNameBox.sendKeys(lastName);
				
				//Input Password
				final String password = "qactraining";
				WebElement passwordBox = driver.findElement(By.name("passwd"));
				passwordBox.sendKeys(password);
				
				//Select DOB Day
				driver.findElement(By.id("days")).sendKeys("11");
				
				//Select DOB Month
				driver.findElement(By.id("months")).sendKeys("January");
				
				//Select DOB Year
				driver.findElement(By.id("years")).sendKeys("2011");
				
				//Select Newsletter
				driver.findElement(By.id("newsletter")).click();
				
				//Input First Name for Address
				driver.findElement(By.xpath("//*[@id='firstname']")).clear();
				WebElement firstAddressBox = driver.findElement(By.xpath("//*[@id='firstname']"));
				firstAddressBox.sendKeys(firstName);
				
				//Input Last Name for Address
				driver.findElement(By.xpath("//*[@id='lastname']")).clear();
				WebElement secondAddressBox = driver.findElement(By.xpath("//*[@id='lastname']"));
				secondAddressBox.sendKeys(lastName);
				
				//Address
				final String address1 = "Anchorage 1";
				WebElement address = driver.findElement(By.name("address1"));
				address.sendKeys(address1);
			
				//City
				final String city = "Manchester";
				WebElement cityInput = driver.findElement(By.name("city"));
				cityInput.sendKeys(city);
			
				//State
				driver.findElement(By.id("id_state")).sendKeys("Alabama");
				
				//Postcode
				final String postcode = "23456";
				WebElement postcodeInput = driver.findElement(By.name("postcode"));
				postcodeInput.sendKeys(postcode);
				
				//Country
				driver.findElement(By.name("id_country")).sendKeys("United States");
				
				//Mobile Phone
				final String mobileNumber = "01234567891";
				WebElement phoneInput = driver.findElement(By.name("phone_mobile"));
				phoneInput.sendKeys(mobileNumber);
				
				//Assigning Address for Future Reference
				final String addressName = "Home";
				driver.findElement(By.name("alias")).clear();
				WebElement assignAddress = driver.findElement(By.name("alias"));
				assignAddress.sendKeys(addressName);
				
				//Register
				driver.findElement(By.xpath("//*[@id='submitAccount']/span")).click();
			
				//Log out
				driver.findElement(By.linkText("Sign out"));
				
				driver.close();
				
		}catch(NoSuchElementException e){
				System.out.println(e);
				result = false;
		}
		
		if(result)
			System.out.println("Test Passed");
		else
			System.out.println("Test Failed");
		
		//Close the driver
		driver.close();
		System.exit(0);
}
*/
