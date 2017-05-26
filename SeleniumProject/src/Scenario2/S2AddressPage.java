package Scenario2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S2AddressPage {

	WebDriver driver;
	
	By verifyAddressPage = By.xpath("//*[@id='address_delivery']/li[1]/h3");
	By clickProceed = By.xpath("//*[@id='center_column']/form/p/button/span");
	
	public S2AddressPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String verifyAddressPage()
	{
		return driver.findElement(verifyAddressPage).getText();
	}
	
	public void clickProceed()
	{
		driver.findElement(clickProceed).click();
	}
}
