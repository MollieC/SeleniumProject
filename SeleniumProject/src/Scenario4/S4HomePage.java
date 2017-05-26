package Scenario4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S4HomePage {

	WebDriver driver;
	
	By verifyHomePage = By.xpath("//*[@id='editorial_block_center']/h1"); 
	By signInLink = By.className("login");
	
	public S4HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String verifyHomePage()
	{
		return driver.findElement(verifyHomePage).getText();
		
	}
	
	public void clickSignInLink()
	{
		driver.findElement(signInLink).click();
	}
}
