package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Cat {
	WebDriver driver;
	By searchbar=By.name("keyword");
	By clicksearch=By.name("searchProducts");
	By returnpage=By.linkText("Return to Main Menu");
	public Cat(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Cat_Search() throws InterruptedException
	{
		driver.findElement(searchbar).clear();;
		driver.findElement(searchbar).sendKeys("cats");
		Thread.sleep(1000);
		driver.findElement(clicksearch).click();
		driver.findElement(returnpage).click();
		Reporter.log("cat product is available",true);
	}
}
