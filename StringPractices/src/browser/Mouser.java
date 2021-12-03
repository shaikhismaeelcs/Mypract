package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\programmersk\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement e1 = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		WebElement e2 = driver.findElement(By.xpath("(//span[@class='nav-text'])[7]"));
		Actions act=new Actions(driver);
		act.moveToElement(e1).moveToElement(e2).click().build().perform();	//WebElement el3 = driver.findElement(By.xpath("//input[@type='email']"));
		//el3.sendKeys("8805921218");
	//WebElement el4 = driver.findElement(By.xpath("//input[@id='continue']"));
	//act.moveToElement(el4).click().build().perform();
	}

}
