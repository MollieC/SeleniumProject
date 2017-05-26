package Scenario2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S2OrderSummary {

	WebDriver driver;
	
	By verifyOrderSum= By.xpath("//*[@id='center_column']/h1"); //ORDER SUMMARY
	By clickProceedAgain = By.xpath("//*[@id='cart_navigation']/button/span");
	
	public S2OrderSummary(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String verifyOrderSummary()
	{
		return driver.findElement(verifyOrderSum).getText();
	}
	
	public void clickProceedAgain()
	{
		driver.findElement(clickProceedAgain).click();
	}
}
