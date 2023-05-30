package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;


public class Dog {
	WebDriver driver;
	By searchbar=By.name("keyword");
	By clicksearch=By.name("searchProducts");
	By clickOndog=By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");
	By dog_itemid=By.linkText("EST-7");
	By dog_addtocart=By.linkText("Add to Cart");
	By dog_checkout=By.linkText("Proceed to Checkout");
	By dog_continue=By.name("newOrder");
	By dog_confirm=By.linkText("Confirm");
	By returnpage=By.linkText("Return to Main Menu");
	public Dog(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Dog_Search() throws InterruptedException
	{
		driver.findElement(searchbar).clear();
		driver.findElement(searchbar).sendKeys("Dog");
		Thread.sleep(1000);
		driver.findElement(clicksearch).click();
		Thread.sleep(1000);
    }
	public void dog_Purchase()
	{
		driver.findElement(clickOndog).click();
		driver.findElement(dog_itemid).click();
		driver.findElement(dog_addtocart).click();
		driver.findElement(dog_checkout).click();
		driver.findElement(dog_continue).click();
		driver.findElement(dog_confirm).click();
		driver.findElement(returnpage).click();
		Reporter.log("completed the dog Purchase order sucessfully",true);
	}
}
