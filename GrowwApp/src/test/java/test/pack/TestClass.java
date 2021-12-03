package test.pack;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;


import utility.pack.XlSheet;
public class TestClass {
	@Test
	void test1() throws EncryptedDocumentException, IOException  {
		//System.setProperty("webdriver.chrome.driver","C:\\programmersk\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//UtilityClass u =new UtilityClass(driver);
		//VerifyHome v=new VerifyHome();
		//v.launchBrowser("firefox");
	//	driver.get("https://www.facebook.com");
	//	u.pshot();
	//	driver.get("https://www.google.com/");
		//u.fshot();
	String data1=XlSheet.xl(1,1);
		System.out.println(data1);
}}