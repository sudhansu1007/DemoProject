package Assignment1.Goibibo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepageobjects {
	WebDriver driver;
	
	public Homepageobjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By from=By.cssSelector("input[id='gosuggest_inputSrc']");
	By destination= By.cssSelector("input[id='gosuggest_inputDest']");
	By fromdt=By.cssSelector("div[aria-label*='22 2021']");
	By returndt=By.cssSelector("div[aria-label*='28 2021']");
	By rndtrp=By.id("roundTrip");
	By trvl=By.cssSelector("#pax_label");
	By ad=By.cssSelector("#adultPaxPlus");
	By srch=By.cssSelector("#gi_search_btn");
	
	
	public WebElement Roundtrip()
	{
		return driver.findElement(rndtrp);
	}	
	public WebElement Fromplace()
	{
		return driver.findElement(from);
	}
	public WebElement Destinationplace()
	{
		return driver.findElement(destination);
	}
	public WebElement Boardingdate()
	{
		return driver.findElement(fromdt);
	}
	public WebElement Returndate()
	{
		return driver.findElement(returndt);
	}
	public WebElement Addtravellers()
	{
		return driver.findElement(trvl);
	}
	public WebElement Plusone()
	{
		return driver.findElement(ad);
	}
	public WebElement Search()
	{
		return driver.findElement(srch);
	}

}
