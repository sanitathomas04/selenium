package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.SaucedemoBase;

public class SaucedemoHomeTest extends SaucedemoBase {
	@Test(priority = 1)
	public void validateText()
	{
		String actual_text = Home.validateText();
		Assert.assertEquals(actual_text, "Products");
	}
	
	@Test(priority = 2)
	public void sortProducts()
	{
		Home.sortProducts();
	}
	
	@Test(priority = 3)
	public void addToCart()
	{
		Home.addToCart();
	}
	
	@Test(priority = 4)
	public void cartButtonClick()
	{
		Home.cartButtonClick();
	}

}


