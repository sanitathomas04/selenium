package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SaucedemoCartpage {
WebDriver driver1;
	
	By cart_title_text1 = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
	By continue_shopping_button1 = By.id("continue-shopping");
	By checkout_button1 = By.id("checkout");
	
	
	public SaucedemoCartpage(WebDriver driver)
	{
		this.driver1 = driver;
	}
	
	public String cartTitleTextVerify1()
	{
		return driver1.findElement(cart_title_text1).getText();
	}
	
	public boolean checkContinueShoppingButtonEnabled1()
	{
		return driver1.findElement(continue_shopping_button1).isEnabled();
	}
	
	public boolean checkCheckoutButtonEnabled1()
	{
		return driver1.findElement(checkout_button1).isEnabled();
	}
	
	public void checkoutButtonClick1()
	{
		driver1.findElement(checkout_button1).click();
	}

WebDriver driver;
	
	By cart_title_text = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
	By continue_shopping_button = By.id("continue-shopping");
	By checkout_button = By.id("checkout");
	
	
	public SaucedemoCartpage(WebDriver driver)
	{
		this.driver1 = driver;
	}
	
	public String cartTitleTextVerify()
	{
		return driver1.findElement(cart_title_text1).getText();
	}
	
	public boolean checkContinueShoppingButtonEnabled()
	{
		return driver1.findElement(continue_shopping_button1).isEnabled();
	}
	
	public boolean checkCheckoutButtonEnabled()
	{
		return driver1.findElement(checkout_button1).isEnabled();
	}
	
	public void checkoutButtonClick()
	{
		driver1.findElement(checkout_button1).click();
	}



}
