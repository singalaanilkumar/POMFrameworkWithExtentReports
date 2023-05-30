package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Rabbits {
	WebDriver driver;
	By searchbar=By.name("keyword");
	By clicksearch=By.name("searchProducts");
	By returnpage=By.linkText("Return to Main Menu");
	public Rabbits(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Rabbits_Search() throws InterruptedException
	{
		driver.findElement(searchbar).clear();
		driver.findElement(searchbar).sendKeys("Rabbits");
		Thread.sleep(1000);
		driver.findElement(clicksearch).click();
		driver.findElement(returnpage).click();
		Reporter.log("Rabbits product is not available",true);
	}
}
