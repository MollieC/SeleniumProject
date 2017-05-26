package Scenario2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S2PaymentPage {

	WebDriver driver;
	
	By verifyPaymentPage = By.className("page-heading"); //PLEASE CHOOSE YOUR PAYMENT METHOD
	By paymentMethod = By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a");
	
	public S2PaymentPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String verifyPaymentPage()
	{
		return driver.findElement(verifyPaymentPage).getText();
	}
	
	public void clickPaymentMethod()
	{
		driver.findElement(paymentMethod).click();
	}
}
