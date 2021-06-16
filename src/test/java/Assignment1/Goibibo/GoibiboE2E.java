package Assignment1.Goibibo;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jdk.internal.org.jline.utils.Log;

public class GoibiboE2E extends Browserinvocation {
	
	WebDriver driver=getDriver();
	public static Logger log = LogManager.getLogger(GoibiboE2E.class.getName());
	
	@Test(dataProvider="TestData")
	public void ticketBooking(String firstPlace, String secondPlace) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		Homepageobjects x=new Homepageobjects(driver);
		
		Thread.sleep(3000);
		
		x.Roundtrip().click(); //Selecting the round trip option
		
		
		WebElement f=x.Fromplace();
		f.sendKeys(firstPlace);
		Thread.sleep(2000);
		f.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		f.sendKeys(Keys.ENTER);
		log.debug("Boarding from Delhi is Selected");
		
		
		WebElement d=x.Destinationplace();
		d.sendKeys(secondPlace);
		Thread.sleep(2000);
		d.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		d.sendKeys(Keys.ENTER);	
		log.info("Destination Chandigarh is Selected");

		
		
		x.Boardingdate().click();//travelling date
		x.Returndate().click(); //return date
		log.info("Dates are selected Selected");

		
		x.Addtravellers().click();
		x.Plusone().click(); //Adding one more adult
		x.Search().click(); //clicking search
		Thread.sleep(1000);
		
		Secondpage y=new Secondpage(driver);
		y.Clicktobook().click(); //Clicked on book now
		
		Thread.sleep(5000);

		js.executeScript("window.scrollBy(0,1000)");
		
		Detailspage z=new Detailspage(driver);
		z.Noinsurance().click();
		
		
		js.executeScript("window.scrollBy(0,500)");
		
		WebElement a1=z.Prefix1();
		Select drop1=new Select(a1);
		drop1.selectByVisibleText("Mr");
		
		z.Firstname1().sendKeys("Sandeep Kumar");
		z.Lastname1().sendKeys("Devra");
		Thread.sleep(2000);
		
		z.Secondperson().click();
		Thread.sleep(2000);
		
		WebElement b1=z.Prefix2();
		Select drop2=new Select(b1);
		drop2.selectByVisibleText("Mr");
		
		z.Firstname2().sendKeys("Bikram Kumar");
		z.Lastname2().sendKeys("Sharma");
		
		z.Email().sendKeys("example1243@xyz.com");
		z.Mobilenumber().sendKeys("4568901234");
		log.info("Customer Details are entered");

		z.Proceed().click();
		Thread.sleep(2000);
		
		
	}
	

@DataProvider(name="TestData")

public Object[][] getDataprovider()
{
	return new Object[][]
			{
				{"Delhi", "Chandigarh"},
				{"Bhubaneswar", "Bangalore"},
			};
	
}

@AfterTest
public void closeBrowser() {
	driver.quit();
	}

}

