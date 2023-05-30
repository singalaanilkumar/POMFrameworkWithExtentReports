package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Lizards {
	WebDriver driver;
	By searchbar=By.name("keyword");
	By clicksearch=By.name("searchProducts");
	By returnpage=By.linkText("Return to Main Menu");
	public Lizards(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Lizards_Search() throws InterruptedException
	{
		driver.findElement(searchbar).clear();	
		driver.findElement(searchbar).sendKeys("Lizards");
		Thread.sleep(1000);
		driver.findElement(clicksearch).click();
		driver.findElement(returnpage).click();
		Reporter.log("Lizards product is not available",true);
	} 
}
