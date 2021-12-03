package test.pack;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import base.pack.Base;

public class VerifyHome extends Base {
	private WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser){
		if(browser.equals("chrome"))
		{
			driver= launchcBrowser();
		}
		if(browser.equals("firefox"))
		{
			driver=launchfBrowser();	
		}
	}
}