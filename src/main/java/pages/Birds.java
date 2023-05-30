package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Birds {
	WebDriver driver;
	By searchbar=By.name("keyword");
	By clicksearch=By.name("searchProducts");
	By returnpage=By.linkText("Return to Main Menu");
	public Birds(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Birds_Search() throws InterruptedException
	{
		driver.findElement(searchbar).clear();
		driver.findElement(searchbar).sendKeys("birds");
		Thread.sleep(1000);
		driver.findElement(clicksearch).click();
		Reporter.log("bird product is  available",true);
		driver.findElement(returnpage).click();
	}
}
