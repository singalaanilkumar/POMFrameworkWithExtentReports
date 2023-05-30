package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Hamster {
	WebDriver driver;
	By searchbar=By.name("keyword");
	By clicksearch=By.name("searchProducts");
	By returnpage=By.linkText("Return to Main Menu");
	public Hamster(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Hamster_Search() throws InterruptedException
	{
		driver.findElement(searchbar).clear();
		driver.findElement(searchbar).sendKeys("Hamster");
		Thread.sleep(1000);
		driver.findElement(clicksearch).click();
		driver.findElement(returnpage).click();
		Reporter.log("Hamster product is available",true);
    }
}