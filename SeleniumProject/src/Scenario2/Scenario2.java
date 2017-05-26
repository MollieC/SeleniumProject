package Scenario2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Scenario2  {
//PURCHASING AN ITEM 	
	
		//Extent Report
		ExtentReports report;
		ExtentTest test;
		//Driver
		WebDriver driver;
		//Pages
		S2HomePage verifyHomePage;
		S2HomePage homePageItem;
		S2HomePage signInLink;
		S2ClothingList verifyClothingList;
		S2ClothingList blouse;
		S2ClothesItem verifyClothesItem;
		S2ClothesItem increaseQuantity;
		S2ClothesItem changeColour;
		S2ClothesItem addToCart;
		S2PopUp verifyPopUp;
		S2PopUp proceedToCheckout;
		S2Cart verifyShoppingCart;
		S2Cart proceed;
		S2LogIn verifyLogInPage;
		S2LogIn email; 
		S2LogIn password;
		S2LogIn signInButton;
		S2AddressPage verifyAddressPage;
		S2AddressPage clickProceed;
		S2ShippingPage verifyShippingPage;
		S2ShippingPage tickAgree;
		S2ShippingPage clickContinue;
		S2PaymentPage verifyPaymentPage;
		S2PaymentPage paymentMethod;
		S2OrderSummary verifyOrderSum;
		S2OrderSummary clickProceedAgain;
		S2OrderConfirmation verifyOrderConfirm;
		
		
		@Before
		public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\Sele\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		}
		
		@Test
		public void verifyCheckOut() throws InterruptedException{
		//Homepage
			//report
		report = new ExtentReports("C:\\Users\\Administrator\\Desktop\\Selenium\\ExtentReports\\Scenario2.html", true);
		test = report.startTest("Scenario 2 Homepage");
		test.log(LogStatus.INFO, "Page successfully loaded");
			//test
		verifyHomePage = new S2HomePage(driver);
	 	String homePageTitle = verifyHomePage.verifyHomePage();	
	 	assertEquals("Automation Practice Website", homePageTitle);
	 	System.out.println(homePageTitle);
	 	verifyHomePage.clickWomensClothes();
	 	test.log(LogStatus.INFO, "Clicked to navigate to womens clothing");
		test.log(LogStatus.PASS, "Homepage test passed");
	 	
	 	//Clothing List
			//report
		test = report.startTest("Scenario 2 Womens Clothes List");
		test.log(LogStatus.INFO, "Page successfully loaded");
			//test
	 	verifyClothingList = new S2ClothingList(driver);
	 	String verifyClothesTitle = verifyClothingList.verifyClothingList();
	 	assertEquals("You will find here all woman fashion collections.", verifyClothesTitle);
	 	System.out.println(verifyClothesTitle);
	 	verifyClothingList.clickBlouse();
	 	test.log(LogStatus.INFO, "Clicked on Blouse");
	 	test.log(LogStatus.PASS, "Clothes page test passed");
	 	
	 	//Clothing Item- Blouse
	 		//report
	 	test = report.startTest("Scenario 2 Blouse Product Page");
		test.log(LogStatus.INFO, "Page successfully loaded");
			//test
	 	verifyClothesItem = new S2ClothesItem(driver);
	 	String verifyBlouse = verifyClothesItem.verifyClothesItem();
	 	assertEquals("Blouse", verifyBlouse);
	 	System.out.println(verifyBlouse);
	 	verifyClothesItem.increaseQuantity();
		test.log(LogStatus.INFO, "Increased quantity of blouse to 2");
	 	verifyClothesItem.changeColour();
		test.log(LogStatus.INFO, "Changed blouse colour to white");
	 	verifyClothesItem.addToCart();
	 	test.log(LogStatus.INFO, "Clicked to add to cart");
	 	test.log(LogStatus.PASS, "Blouse initially added to cart, test passed");

	 	//PopUp
	 		//report
	 	test = report.startTest("Scenario 2 Pop Up Cart");
		test.log(LogStatus.INFO, "Pop up successfully loaded");
			//test
	 	verifyPopUp = new S2PopUp(driver);
	 	String verifyPop = verifyPopUp.verifyPopUp();
	 	assertEquals("Product successfully added to your shopping cart", verifyPop);
	 	System.out.println(verifyPop);
		verifyPopUp.proceedToCheckout();
		test.log(LogStatus.INFO, "Clicked to proceed to checkout");
	 	test.log(LogStatus.PASS, "Blouse added to cart successfully, test passed");
		
		//Cart
			//report
	 	test = report.startTest("Scenario 2 Shopping Cart");
		test.log(LogStatus.INFO, "Page successfully loaded");
			//test
		verifyShoppingCart = new S2Cart(driver);
		String verifyCart = verifyShoppingCart.verifyShoppingCart();
		assertEquals(verifyCart.contains("SHOPPING-CART SUMMARY"), true);
		System.out.println(verifyCart);
		verifyShoppingCart.proceed();
		test.log(LogStatus.INFO, "Clicked proceed");
	 	test.log(LogStatus.PASS, "Blouse added to cart successfully, test passed");
		
		//Login
	 		//report
	 	test = report.startTest("Scenario 2 Login Page");
		test.log(LogStatus.INFO, "Page successfully loaded");
			//test
		verifyLogInPage = new S2LogIn(driver);
		String verifyLogin = verifyLogInPage.verifyLogInPage();
		assertEquals("AUTHENTICATION", verifyLogin);
		System.out.println(verifyLogin);
		verifyLogInPage.enterEmail();
		test.log(LogStatus.INFO, "Email entered");
		verifyLogInPage.enterPassword();
		test.log(LogStatus.INFO, "Password entered");
		verifyLogInPage.clickSignInButton();
		test.log(LogStatus.INFO, "Clicked to sign in");
		test.log(LogStatus.PASS, "Successfully logged in, test passed");
		
		//Address
			//report
	 	test = report.startTest("Scenario 2 Address Confirmation Page");
		test.log(LogStatus.INFO, "Page successfully loaded");
			//test
		verifyAddressPage = new S2AddressPage(driver);
		String verifyAddress = verifyAddressPage.verifyAddressPage();
		assertEquals("YOUR DELIVERY ADDRESS", verifyAddress);
		System.out.println(verifyAddress);
		verifyAddressPage.clickProceed();
		test.log(LogStatus.INFO, "Clicked proceed");
		test.log(LogStatus.PASS, "Address confirmed successfully, test passed");
		
		//Shipping
			//report
	 	test = report.startTest("Scenario 2 Shipping Confirmation Page");
		test.log(LogStatus.INFO, "Page successfully loaded");
			//test
		verifyShippingPage = new S2ShippingPage(driver);
		String verifyShipping = verifyShippingPage.verifyShippingPage();
		assertEquals("SHIPPING", verifyShipping);
		System.out.println(verifyShipping);
		verifyShippingPage.tickAgree();
		test.log(LogStatus.INFO, "Ticked agree to terms and conditions");
		verifyShippingPage.clickContinue();
		test.log(LogStatus.INFO, "Clicked proceed");
		test.log(LogStatus.PASS, "Shipping confirmed successfully, test passed");

		//Payment Page
			//report
	 	test = report.startTest("Scenario 2 Payment Page");
		test.log(LogStatus.INFO, "Page successfully loaded");
			//test
		verifyPaymentPage = new S2PaymentPage(driver);
		String verifyPayment = verifyPaymentPage.verifyPaymentPage();
		assertEquals("PLEASE CHOOSE YOUR PAYMENT METHOD", verifyPayment);
		System.out.println(verifyPayment);
		verifyPaymentPage.clickPaymentMethod();
		test.log(LogStatus.INFO, "Clicked bank transfer");
		test.log(LogStatus.PASS, "Payment made successfully, test passed");
		
		//Order Summary
			//report
	 	test = report.startTest("Scenario 2 Order Summary Page");
		test.log(LogStatus.INFO, "Page successfully loaded");
			//test
		verifyOrderSum = new S2OrderSummary(driver);
		String verifySummary = verifyOrderSum.verifyOrderSummary();
		assertEquals("ORDER SUMMARY", verifySummary);
		System.out.println(verifySummary);
		verifyOrderSum.clickProceedAgain();
		test.log(LogStatus.INFO, "Clicked to continue");
		test.log(LogStatus.PASS, "Order checked successfully, test passed");
		
		
		//Order Confirmation
			//report
	 	test = report.startTest("Scenario 2 Order Confirmation Page");
		test.log(LogStatus.INFO, "Page successfully loaded");
			//test
		verifyOrderConfirm = new S2OrderConfirmation(driver);
		String verifyConfirmation = verifyOrderConfirm.verifyOrderConfirm();
		assertEquals("ORDER CONFIRMATION", verifyConfirmation);
		System.out.println(verifyConfirmation);
		test.log(LogStatus.INFO, "Clicked to confirm order");
		verifyOrderConfirm.clickLogOut();
		test.log(LogStatus.INFO, "Clicked to log out");
		test.log(LogStatus.PASS, "Order confirmed successfully, test passed");

		report.endTest(test);
		report.flush();
		}
		
		@After
		public void tearDown(){
			try{
				driver.close();
				System.out.println("Scenario 2 Test Finished");
			}catch (Exception e){
				System.out.println(e.toString());
			}
	}
	}
		

		
		/*
		//User Flow
		try{
			//Navigate to Womens' products
			driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a")).click();
			
			//View product
			driver.findElement(By.xpath("//*[@id='center_column']/ul/li[4]/div/div[1]/div/a[1]/img")).click();

			//Naviagate back to product page 
			driver.findElement(By.xpath("//*[@id='columns']/div[1]/a[2]")).click();

			//View another product
			driver.findElement(By.xpath("//*[@id='center_column']/ul/li[2]/div/div[1]/div/a[1]/img")).click();
		
			//Adjust Quantity
			driver.findElement(By.xpath("//*[@id='quantity_wanted_p']/a[2]/span/i"));

			//Adjust colour
			driver.findElement(By.id("color_8")).click();

			//Add to cart
			driver.findElement(By.xpath("//*[@id='add_to_cart']/button/span")).click();

			//Add a wait 
			Thread.sleep(2000);

			//Proceed to check out
			driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")).click();

			//Proceed to check out (again)
			driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]/span")).click();
			
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
			
			//Checkout
			driver.findElement(By.xpath("//*[@id='center_column']/form/p/button/span")).click();
			
			//Agreeing to Terms of Service
			driver.findElement(By.name("cgv")).click();
			
			//Proceed to Checkout
			driver.findElement(By.xpath("//*[@id='form']/p/button/span")).click();
			
			//Pay by bank
			driver.findElement(By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")).click();
			
			//Confirm Order
			driver.findElement(By.xpath("//*[@id='cart_navigation']/button/span")).click();
			
		}catch(NoSuchElementException e){
			System.out.println(e);
	
		}
		
		if(result==true)
			System.out.println("Test Passed");
		else
			System.out.println("Test Failed");
		
		//Close driver
		driver.close();
		System.exit(0);
}
*/

