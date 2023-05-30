package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
	WebDriver driver;
	By signIn=By.linkText("Sign In");
	
	public SignIn(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void click_SignIn()
	{
		driver.findElement(signIn).click();
    }
}
