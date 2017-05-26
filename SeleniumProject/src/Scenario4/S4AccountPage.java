package Scenario4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S4AccountPage {

	WebDriver driver;
	
	By myAccount = By.xpath("//*[@id='center_column']/h1");
	By logOut = By.linkText("Sign out");

	public S4AccountPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String verifyMyAccount()
	{
		return driver.findElement(myAccount).getText();
	}
	
	public void clickSignOut()
	{
		driver.findElement(logOut).click();
	}
}
