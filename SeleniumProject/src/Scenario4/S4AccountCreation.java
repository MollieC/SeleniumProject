package Scenario4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S4AccountCreation {

	WebDriver driver;
	
	By verifyAccountCreation = By.xpath("//*[@id='noSlide']/h1");
	By gender = By.name("id_gender");
	By firstName = By.id("customer_firstname");
	By lastName = By.id("customer_lastname");
	By password = By.id("passwd");
	By DOBday = By.name("days");
	By DOBmonth = By.name("months");
	By DOByear = By.name("years");
	By firstName1 = By.id("firstname");
	By lastName1 = By.id("lastname");
	By address = By.id("address1");
	By city = By.id("city");
	By state = By.name("id_state");
	By postcode = By.id("postcode");
	By country = By.id("id_country");
	By phone = By.id("phone_mobile");
	By alias = By.id("alias");
	By register = By.xpath("//*[@id='submitAccount']/span");

	public S4AccountCreation(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String verifyAccountCreation() throws InterruptedException
	{
		Thread.sleep(2000);
		return driver.findElement(verifyAccountCreation).getText();
	}
	
	public void clickGender()
	{
		driver.findElement(gender).click();
	}
	
	public void enterFirstName()
	{
		driver.findElement(firstName).sendKeys("Mollie");
	}
	
	public void enterLastName()
	{
		driver.findElement(lastName).sendKeys("Cooke");
	}
	
	public void enterPassword()
	{
		driver.findElement(password).sendKeys("qactraining");	
	}
	
	public void clickDOBDays()
	{
		driver.findElement(DOBday).sendKeys("11");
	}
	
	public void clickDOBMonth()
	{
		driver.findElement(DOBmonth).sendKeys("January");
	}
	
	public void clickDOBYear()
	{
		driver.findElement(DOByear).sendKeys("2011");	
	}
	
	public void enterFirstName1()
	{
		driver.findElement(firstName1).sendKeys("Mollie");
	}
	
	public void enterLastName1()
	{
		driver.findElement(lastName1).sendKeys("Cooke");
	}
	
	public void enterAddress()
	{
		driver.findElement(address).sendKeys("Anchorage 1");
	}
	
	public void enterCity()
	{
		driver.findElement(city).sendKeys("Manchester");
	}
	
	public void clickState()
	{
		driver.findElement(state).sendKeys("Alabama");
	}
	
	public void enterPostcode()
	{
		driver.findElement(postcode).sendKeys("23456");
	}
	
	public void clickCountry()
	{
		driver.findElement(country).sendKeys("United States");
	}
	
	public void enterPhone()
	{
		driver.findElement(phone).sendKeys("01234567891");
	}
	
	public void enterAlias()
	{
		driver.findElement(alias).sendKeys("Home");
	}
	
	public void clickRegister()
	{
		driver.findElement(register).click();
	}
}
