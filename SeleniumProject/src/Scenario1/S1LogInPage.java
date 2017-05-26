package Scenario1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S1LogInPage {

	WebDriver driver;
	
	By verifyLogInPage = By.className("page-heading"); 
	By email = By.id("email");
	By password = By.name("passwd");
	By signInButton = By.xpath("//*[@id='SubmitLogin']/span");

	public S1LogInPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String verifyLogInPage()
	{
		return driver.findElement(verifyLogInPage).getText();
	}
	
	public void enterEmail()
	{
		driver.findElement(email).sendKeys("testemail7@hotmail.com");
	}
	
	public void enterPassword()
	{
		driver.findElement(password).sendKeys("qactraining");
	}
	
	public void clickSignInButton()
	{
		driver.findElement(signInButton).click();
	}
		
}
	
