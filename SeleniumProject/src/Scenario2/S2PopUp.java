package Scenario2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S2PopUp {
	
	WebDriver driver;
	
	By verifyPopUp = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[1]/h2"); 
	///html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[1]/h2
	By proceedToCheckout = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span");

	public S2PopUp(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String verifyPopUp() throws InterruptedException
	{
		Thread.sleep(2000);
		return driver.findElement(verifyPopUp).getText();
	}
	
	public void proceedToCheckout()
	{
		driver.findElement(proceedToCheckout).click();
	}
}
