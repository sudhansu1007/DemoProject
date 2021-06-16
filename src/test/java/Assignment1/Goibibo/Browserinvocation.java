package Assignment1.Goibibo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserinvocation {
	
	public WebDriver getDriver() {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
	}
	
}
