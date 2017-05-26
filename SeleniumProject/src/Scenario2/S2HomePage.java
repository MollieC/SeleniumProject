package Scenario2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S2HomePage {
	
	WebDriver driver;
	
	By verifyHomePage = By.xpath("//*[@id='editorial_block_center']/h1"); 
	By clickWomensClothes = By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"); 

	public S2HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String verifyHomePage()
	{
		return driver.findElement(verifyHomePage).getText();
	}
	
	public void clickWomensClothes()
	{
		driver.findElement(clickWomensClothes).click();
	}

}
