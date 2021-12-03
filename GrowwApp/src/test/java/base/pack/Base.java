package base.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	
	public WebDriver launchcBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\programmersk\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				return driver;
	}
	public WebDriver launchfBrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\programmersk\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("https://www.facebook.com");
				return driver;
	}
}
