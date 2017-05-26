package Scenario2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S2ClothesItem {

	WebDriver driver;
	
	By verifyClothesItem = By.xpath("//*[@id='center_column']/div/div/div[3]/h1"); //Blouse
	By increaseQuantity = By.xpath("//*[@id='quantity_wanted_p']/a[2]/span");
	By changeColour = By.id("color_8");
	By addToCart = By.xpath("//*[@id='add_to_cart']/button/span");
	
	public S2ClothesItem(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String verifyClothesItem()
	{
		return driver.findElement(verifyClothesItem).getText();
	}
	
	public void increaseQuantity()
	{
		driver.findElement(increaseQuantity).click();
	}
	
	public void changeColour()
	{
		driver.findElement(changeColour).click();
	}
	
	public void addToCart()
	{
		driver.findElement(addToCart).click();
	}
}
