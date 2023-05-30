package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Persian {
	WebDriver driver;
	By searchbar=By.name("keyword");
	By clicksearch=By.name("searchProducts");
	By clickOnpersian=By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");
	By persian_itemid=By.linkText("EST-16");
	By persian_addtocart=By.linkText("Add to Cart");
	By persian_checkout=By.linkText("Proceed to Checkout");
	By persian_continue=By.name("newOrder");
	By persian_confirm=By.linkText("Confirm");
	By returnpage=By.linkText("Return to Main Menu");
	public Persian(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Persian_Search() throws InterruptedException
	{
		driver.findElement(searchbar).clear();
		driver.findElement(searchbar).sendKeys("persian");
		Thread.sleep(1000);
		driver.findElement(clicksearch).click();
		Thread.sleep(1000);
    }
	public void Persian_Purchase() throws InterruptedException
	{
		driver.findElement(clickOnpersian).click();
		driver.findElement(persian_itemid).click();
		driver.findElement(persian_addtocart).click();
		driver.findElement(persian_checkout).click();
		driver.findElement(persian_continue).click();
		driver.findElement(persian_confirm).click();
		Thread.sleep(1000);
		driver.findElement(returnpage).click();
		Reporter.log("completed the persian Purchase order sucessfully",true);
	}
}
