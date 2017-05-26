package Scenario3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S3LogInPage {
	
	WebDriver driver;
	
	By verifyLogInPage = By.className("page-heading"); 
	By forgottenPassword = By.linkText("Forgot your password?");
	
	public S3LogInPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String verifyLogInPage()
	{
		return driver.findElement(verifyLogInPage).getText();
	}
	
	public void clickResetButton()
	{
		driver.findElement(forgottenPassword).click();
	}
		
}
