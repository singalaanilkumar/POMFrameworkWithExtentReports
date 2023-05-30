package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Snake {
	WebDriver driver;
	By searchbar=By.name("keyword");
	By clicksearch=By.name("searchProducts");
	By clickOnsnake=By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");
	By snake_itemid=By.linkText("EST-11");
	By snake_addtocart=By.linkText("Add to Cart");
	By snake_checkout=By.linkText("Proceed to Checkout");
	By snake_continue=By.name("newOrder");
	By snake_confirm=By.linkText("Confirm");
	By returnpage=By.linkText("Return to Main Menu");
	public Snake(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Snake_Search() throws InterruptedException
	{
		driver.findElement(searchbar).clear();
		driver.findElement(searchbar).sendKeys("Snake");
		Thread.sleep(1000);
		driver.findElement(clicksearch).click();
		Thread.sleep(1000);
    }
	public void Snake_Purchase() throws InterruptedException
	{
		driver.findElement(clickOnsnake).click();
		driver.findElement(snake_itemid).click();
		driver.findElement(snake_addtocart).click();
		driver.findElement(snake_checkout).click();
		driver.findElement(snake_continue).click();
		driver.findElement(snake_confirm).click();
		Thread.sleep(1000);
		driver.findElement(returnpage).click();
		Reporter.log("completed the snake Purchase order sucessfully",true);
	}
}
