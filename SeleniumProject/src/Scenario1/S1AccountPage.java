package Scenario1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S1AccountPage {

	WebDriver driver;
	
	By verifyAccountPage = By.xpath("//*[@id='center_column']/h1"); 
	By signOutButton = By.linkText("Sign out");

	public S1AccountPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String verifyAccountPage()
	{
		return driver.findElement(verifyAccountPage).getText();
	}
	
	public void clickSignOut()
	{
		driver.findElement(signOutButton).click();
	}
}
