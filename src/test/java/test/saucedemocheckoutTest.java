package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.SaucedemoBase;

public class saucedemocheckoutTest extends SaucedemoBase{
	@Test(priority = 1)
	public void checkoutTitleVerify()
	{
		String actual_checkout_title = checkout.checkoutTitleVerify();
		Assert.assertEquals(actual_checkout_title, "Checkout: Your Information");
	}
	
	@Test(priority = 2)
	public void fillOutForm()
	{
		checkout.fillOutForm("Sani", "Kt", "682387");
	}
	
	@Test(priority = 3)
	public void clickContinue()
	{
		checkout.clickContinue();
	}
	
	@Test(priority = 4)
	public void displayTotalAmount()
	{
		System.out.println("Total amount of Cart Items : "+checkout.displayTotalAmount());
	}
	
	@Test(priority = 5)
	public void clickFinish()
	{
		checkout.clickFinish();
	}



}
