package test;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Page.SaucedemoLoginpage;
import basepkg.SaucedemoBase;

public class SaucedemoLoginTest extends SaucedemoBase {
	

	@Test
	public void test() {
		SaucedemoLoginpage sd=new SaucedemoLoginpage(driver);
		sd.setvalue("standard_user", "secret_sauce");
		sd.logins();
		
	}

}
