package Scenario3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S3SuccessPage {

	WebDriver driver; 
	
	By verifyPasswordReset = By.xpath("//*[@id='center_column']/div/p");

	public S3SuccessPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String verifyResetPassword()
	{
		return driver.findElement(verifyPasswordReset).getText();
	}
	
}
