package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SaucedemoLoginpage {
WebDriver driver;
	
	By usernamefield=By.id("username");
	By passwordfield=By.id("password");
	By login=By.id("loginbutton");
	
	public SaucedemoLoginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalue(String username,String password)
	{
		driver.findElement(usernamefield).sendKeys(username);
		driver.findElement(passwordfield).sendKeys(password);
	}
	public void logins()
	{
		driver.findElement(login).click();
	}

}
