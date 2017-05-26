package Scenario4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S4LogInPage {
	
	WebDriver driver;
	
	By verifyLogInPage = By.xpath("//*[@id='center_column']/h1");
	By inputEmail = By.id("email_create");
	By createAccountButton = By.xpath("//*[@id='SubmitCreate']/span");
	
	public S4LogInPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String verifyLogInPage()
	{
		return driver.findElement(verifyLogInPage).getText();
	}
	
	public void inputEmail()
	{
		driver.findElement(inputEmail).sendKeys("testemail12345@live.co.uk"); //This will need to be changed each time the test is run
	}
	
	public void clickCreateAccount()
	{
		driver.findElement(createAccountButton).click();
	}
}
