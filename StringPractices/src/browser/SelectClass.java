package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\programmersk\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();	
	driver.get("http://demo.guru99.com/test/newtours/register.php");
	Select s=new Select(driver.findElement(By.name("country")));
	s.selectByVisibleText("BANGLADESH");
	driver.findElement(By.name("firstName")).sendKeys("Shaikh");
	driver.findElement(By.name("lastName")).sendKeys("Ismail");
	driver.findElement(By.name("phone")).sendKeys("8805921218");
	driver.findElement(By.name("userName")).sendKeys("Ismail@ebv");
	driver.findElement(By.name("address1")).sendKeys("dulheshah raheman nagar");
	driver.findElement(By.name("postalCode")).sendKeys("431602");
	driver.findElement(By.name("state")).sendKeys("Maharashtra");
	driver.findElement(By.name("email")).sendKeys("Shaikhism.o07@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Aa5520@*");
	driver.findElement(By.name("confirmPassword")).sendKeys("Aa5520@*");
	driver.findElement(By.name("city")).sendKeys("Nanded");
}
}
