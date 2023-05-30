package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOut {
	WebDriver driver;
	By signout=By.linkText("Sign Out");
	
	public SignOut(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void click_Signout()
	{
		driver.findElement(signout).click();
    }

}
