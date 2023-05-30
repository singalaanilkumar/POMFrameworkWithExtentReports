package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterStore {
	WebDriver driver;
	By enterStore=By.linkText("Enter the Store");
	
	public EnterStore(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void click_EnterStore()
	{
		driver.findElement(enterStore).click();
	}
}
