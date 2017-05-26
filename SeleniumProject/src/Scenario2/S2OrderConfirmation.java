package Scenario2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S2OrderConfirmation {
	
	WebDriver driver;
	
	By verifyOrderConfirm = By.xpath("//*[@id='center_column']/h1"); //ORDER CONFIRMATION
	By logOut = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[2]/a");
	
	public S2OrderConfirmation(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String verifyOrderConfirm()
	{
		return driver.findElement(verifyOrderConfirm).getText();
	}
	
	public void clickLogOut()
	{
		driver.findElement(logOut).click();
	}
}
