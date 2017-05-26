package Scenario2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S2ClothingList {

	WebDriver driver;
	
	By verifyClothingList = By.xpath("//*[@id='center_column']/div[1]/div/div/div/p[1]/strong"); //You will find here all woman fashion collections.
	By blouse = By.xpath("//*[@id='center_column']/ul/li[2]/div/div[1]/div/a[1]/img");

	public S2ClothingList(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String verifyClothingList()
	{
		return driver.findElement(verifyClothingList).getText();
	}
	
	public void clickBlouse()
	{
		driver.findElement(blouse).click();
	}
}
