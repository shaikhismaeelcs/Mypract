package browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTab {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\programmersk\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://demo.guru99.com/test/web-table-element.php");
	List<WebElement> ele= driver.findElements(By.xpath("//table[@class='dataTable']//th"));
	int sizeof=ele.size();
	System.out.println("no of headers"+sizeof);
}
}
