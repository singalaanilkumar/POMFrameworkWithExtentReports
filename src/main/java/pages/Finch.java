package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Finch {
		WebDriver driver;
		By searchbar=By.name("keyword");
		By clicksearch=By.name("searchProducts");
		By clickOnfinch=By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");
		By finch_itemid=By.linkText("EST-19");
		By finch_addtocart=By.linkText("Add to Cart");
		By finch_checkout=By.linkText("Proceed to Checkout");
		By finch_continue=By.name("newOrder");
		By finch_confirm=By.linkText("Confirm");
		By returnpage=By.linkText("Return to Main Menu");
		public Finch(WebDriver driver)
		{
			this.driver=driver;
		}
		public void Finch_Search() throws InterruptedException
		{
			driver.findElement(searchbar).clear();
			driver.findElement(searchbar).sendKeys("finch");
			Thread.sleep(1000);
			driver.findElement(clicksearch).click();
			Thread.sleep(1000);
	    }
		public void Finch_Purchase() throws InterruptedException
		{
			driver.findElement(clickOnfinch).click();
			driver.findElement(finch_itemid).click();
			driver.findElement(finch_addtocart).click();
			driver.findElement(finch_checkout).click();
			driver.findElement(finch_continue).click();
			driver.findElement(finch_confirm).click();
			Thread.sleep(1000);
			driver.findElement(returnpage).click();
			Reporter.log("completed the finch Purchase order sucessfully");
		}
	}

