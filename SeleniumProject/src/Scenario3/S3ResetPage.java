package Scenario3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S3ResetPage {
	
	WebDriver driver;

	By verifyResetPage = By.xpath("//*[@id='center_column']/div/h1"); 
	By email = By.id("email");
	By resetButton = By.xpath("//*[@id='form_forgotpassword']/fieldset/p/button/span");

	public S3ResetPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String verifyResetPage()
	{
		return driver.findElement(verifyResetPage).getText();
	}
	
	public void enterEmail()
	{
		driver.findElement(email).sendKeys("testemail2@live.co.uk");
	}
	
	public void clickReset()
	{
		driver.findElement(resetButton).click();
	}
	
} 
