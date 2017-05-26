package Scenario3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S3HomePage {

	WebDriver driver;
	
	By verifyHomePage = By.xpath("//*[@id='editorial_block_center']/h1"); 
	By homePageItem = By.xpath("//*[@id='homefeatured']/li[3]/div/div[1]/div/a[1]/img"); //item of Printed Dress
	By signInLink = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"); //sign in link in the top right hand corner

	public S3HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String verifyHomePage()
	{
		return driver.findElement(verifyHomePage).getText();
	}
	
	public void verifyHomePageItem()
	{
		driver.findElement(homePageItem).getAttribute("href");
	}
	
	public void clickSignInLink()
	{
		driver.findElement(signInLink).click();
	}
		
}
	