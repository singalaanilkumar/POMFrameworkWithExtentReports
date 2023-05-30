package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Fish {
	WebDriver driver;
	By searchbar=By.name("keyword");
	By clicksearch=By.name("searchProducts");
	By clickOnfish=By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a");
	By fish_itemid=By.linkText("EST-1");
	By fish_addtocart=By.linkText("Add to Cart");
	By fish_checkout=By.linkText("Proceed to Checkout");
	By fish_continue=By.name("newOrder");
	By fish_confirm=By.linkText("Confirm");
	By returnpage=By.linkText("Return to Main Menu");
	public Fish(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Fish_Search() throws InterruptedException
	{
		driver.findElement(searchbar).clear();
		driver.findElement(searchbar).sendKeys("fish");
		Thread.sleep(1000);
		driver.findElement(clicksearch).click();
		Thread.sleep(1000);
    }
	public void Fish_Purchase() throws InterruptedException
	{
		driver.findElement(clickOnfish).click();
		driver.findElement(fish_itemid).click();
		driver.findElement(fish_addtocart).click();
		driver.findElement(fish_checkout).click();
		driver.findElement(fish_continue).click();
		driver.findElement(fish_confirm).click();
		Thread.sleep(1000);
		driver.findElement(returnpage).click();
		Reporter.log("completed fish  purchase order sucessfully",true);
	}
	
}
