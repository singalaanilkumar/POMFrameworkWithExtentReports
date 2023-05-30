package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;
import java.util.Scanner;

public class SearchWithMultipleProductThroughUserInput {

    WebDriver driver;
    String product[] = new String[6];

    @BeforeTest
    public void open_browser() throws InterruptedException {
        System.out.println("select browser(chrome/firefox/internetexplorer)");
        try (Scanner s = new Scanner(System.in)) {
            {//it shows suprise warning and resouce leak so i mentioned surround with  try-with-resources.
                String browser = s.next();
                System.out.println("Select the product(Birds/Cats/Hamster/snake/Fish/finch/persian/Dog/Rabbits/Lizards)");
                //Thread.sleep(5000);
                for (int i = 0; i < 6; i++) {
                    product[i] = s.next();
                }
                //Thread.sleep(7000);

                //selecting chrome browser
                if (browser.equalsIgnoreCase("chrome")) {
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    driver.get("https://petstore.octoperf.com/");
                    Thread.sleep(2000);
                }

            }
        }
    }

    @Test(priority = 1)
    public void Login_finish() {
        EnterStore es = new EnterStore(driver);
        es.click_EnterStore();
        SignIn s = new SignIn(driver);
        s.click_SignIn();
        Login l = new Login(driver);
        l.unamePwd();
        l.click_Login();
    }

    @Test(priority = 2)
    public void Final_Module() throws InterruptedException {
        for (int i = 0; i < 6; i++) {
            if (product[i].equalsIgnoreCase("Birds")) {
                Birds b = new Birds(driver);
                b.Birds_Search();
            } else if (product[i].equalsIgnoreCase("Cats")) {
                Cat c = new Cat(driver);
                c.Cat_Search();
            } else if (product[i].equalsIgnoreCase("hamster")) {
                Hamster h = new Hamster(driver);
                h.Hamster_Search();
            } else if (product[i].equalsIgnoreCase("Snake")) {
                Snake s = new Snake(driver);
                s.Snake_Search();
                s.Snake_Purchase();
            } else if (product[i].equalsIgnoreCase("Fish")) {
                Fish f = new Fish(driver);
                f.Fish_Search();
                f.Fish_Purchase();
            } else if (product[i].equalsIgnoreCase("Finch")) {
                Finch fi = new Finch(driver);
                fi.Finch_Search();
                fi.Finch_Purchase();
            } else if (product[i].equalsIgnoreCase("persian")) {
                Persian pe = new Persian(driver);
                pe.Persian_Search();
                pe.Persian_Purchase();
            } else if (product[i].equalsIgnoreCase("Dog")) {
                Dog d = new Dog(driver);
                d.Dog_Search();
                d.dog_Purchase();
            } else if (product[i].equalsIgnoreCase("Rabbits")) {
                Rabbits ra = new Rabbits(driver);
                ra.Rabbits_Search();
            } else if (product[i].equalsIgnoreCase("Lizards")) {
                Lizards lz = new Lizards(driver);
                lz.Lizards_Search();
            } else {
                System.out.println("Choose the valid product");
            }
        }
    }

    @Test(priority = 3)
    public void signout() {
        SignOut so = new SignOut(driver);
        so.click_Signout();
        Reporter.log("signout sucesfully", true);
    }

    @AfterTest
    public void close_browser() {
        driver.quit();// quit the method
        Reporter.log("sucesfully! closed the browser", true);// it is a inbuilt class in TestNG, which helps in logging the messages
        //in the output reports.
    }
}



