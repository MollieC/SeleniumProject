package Scenario2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S2ShippingPage {
	
	WebDriver driver;
	
	By verifyShippingPage = By.xpath("//*[@id='carrier_area']/h1"); //SHIPPING
	By tickAgree = By.name("cgv");
	By clickContinue = By.xpath("//*[@id='form']/p/button/span");

	public S2ShippingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String verifyShippingPage()
	{
		return driver.findElement(verifyShippingPage).getText();
	}
	
	public void tickAgree()
	{
		driver.findElement(tickAgree).click();
	}
	
	public void clickContinue()
	{
		driver.findElement(clickContinue).click();
	}
}
