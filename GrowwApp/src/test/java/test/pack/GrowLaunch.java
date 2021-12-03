package test.pack;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.pack.Base;

public class GrowLaunch {
	WebDriver driver;
	//WebDriverWait Wait;
	@BeforeClass
	public void beforeclass() {
		Base base=new Base();
		driver=base.launchcBrowser();
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		driver.get("https://groww.in/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text() = 'Login/Register']")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='login_email1']")).sendKeys("sharukh.ebv@gmail.com");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("Aa5520@*");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//span[text() = 'Submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("5");
		Thread.sleep(1500);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("5");
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("2");
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("0");

	}
	@Test
	public void test1() {
		System.out.println("test1 pass");
		
	}
	@AfterMethod
	public void aftEvery() {
		
		//driver.get("https://groww.in/");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterclass pass");
	}
	

}
