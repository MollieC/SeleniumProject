package Scenario2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S2Cart {
		
	WebDriver driver;
	
	By verifyShoppingCart = By.id("cart_title");//SHOPPING-CART SUMMARY
	By proceed = By.xpath("//*[@id='center_column']/p[2]/a[1]/span");
	
	public S2Cart(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String verifyShoppingCart()
	{
		return driver.findElement(verifyShoppingCart).getText();
	}
	
	public void proceed()
	{
		driver.findElement(proceed).click();
	}
}
