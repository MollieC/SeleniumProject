package Scenario2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S2LogIn {
	
	WebDriver driver;
	
	By verifyLogInPage = By.xpath("//*[@id='center_column']/h1"); 
	By email = By.id("email");
	By password = By.name("passwd");
	By signInButton = By.xpath("//*[@id='SubmitLogin']/span");
	
	public S2LogIn(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String verifyLogInPage() throws InterruptedException
	{
		Thread.sleep(2000);
		return driver.findElement(verifyLogInPage).getText();
	}
	
	public void enterEmail()
	{
		driver.findElement(email).sendKeys("testemail2@live.co.uk");
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
