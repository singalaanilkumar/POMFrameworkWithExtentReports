package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	By uname=By.name("username");
	By psw=By.name("password");
	By login=By.name("signon");
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	public void unamePwd()
	{
		driver.findElement(uname).sendKeys("Anil@123");
		driver.findElement(psw).clear();
		driver.findElement(psw).sendKeys("Anil@123");
	}
	
	public void click_Login()
	{
		driver.findElement(login).click();
	}
}
