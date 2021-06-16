package Assignment1.Goibibo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Detailspage {
WebDriver driver;
	
	public Detailspage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By ni=By.cssSelector("button[class*='iKkGzW joMLfq gEvPUo']");
	By t1=By.cssSelector("div[class*='padR10'] select[class*='jGncYu']");
	By n1m1=By.cssSelector("input[placeholder='First & Middle Name']");
	By l1=By.cssSelector("input[placeholder='Last Name']");
	By p2=By.xpath("(//span[@class='padL20 padR20 font14'])[2]");
	By t2= By.xpath("//select[@class='common-elementsstyles__CustSelectTrvl-ilw4bs-9 jGncYu']");
	By n2m2=By.xpath("//input[@placeholder='First & Middle Name']");
	By l2=By.xpath("//input[@placeholder='Last Name']");
	By em=By.cssSelector("input[placeholder='Email']");
	By mob=By.cssSelector("input[placeholder='Mobile No']");
	By clk=By.cssSelector("button[class*='duFBIr']");
	
	
	
	public WebElement Noinsurance()
	{
		return driver.findElement(ni);
	}	
	public WebElement Prefix1()
	{
		return driver.findElement(t1);
	}
	public WebElement Firstname1()
	{
		return driver.findElement(n1m1);
	}
	public WebElement Lastname1()
	{
		return driver.findElement(l1);
	}
	public WebElement Secondperson()
	{
		return driver.findElement(p2);
	}
	public WebElement Prefix2()
	{
		return driver.findElement(t2);
	}
	public WebElement Firstname2()
	{
		return driver.findElement(n2m2);
	}
	public WebElement Lastname2()
	{
		return driver.findElement(l2);
	}
	public WebElement Email()
	{
		return driver.findElement(em);
	}
	public WebElement Mobilenumber()
	{
		return driver.findElement(mob);
	}
	public WebElement Proceed()
	{
		return driver.findElement(clk);
	}
	

}
