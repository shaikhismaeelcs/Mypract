package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeSelenium {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\programmersk\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	
	WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	create.click();
	Thread.sleep(5000);
	
	WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
	fname.sendKeys("ASHVINI");
	WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
	lname.sendKeys("Shinde");
	WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	email.sendKeys("8805921218");
	WebElement pass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	pass.sendKeys("ashu@123");	
	WebElement sel = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select obsel=new Select(sel);
	obsel.selectByVisibleText("10");
	WebElement femail = driver.findElement(By.xpath("//input[@value='1']"));
	femail.click();
}}
