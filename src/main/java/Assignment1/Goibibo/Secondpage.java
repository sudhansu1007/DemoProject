package Assignment1.Goibibo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Secondpage {
	
WebDriver driver;
	
	public Secondpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By book=By.cssSelector("input[class*='srp-card-uistyles__Fltbook-sc-3flq99-35']");
	
	
	public WebElement Clicktobook()
	{
		return driver.findElement(book);
	}	

}
