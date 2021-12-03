package stringPract;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleni {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\programmersk\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://demo.guru99.com/test/delete_customer.php");
			WebElement input = driver.findElement(By.xpath("//input[@name='cusid']"));
			input.sendKeys("53920");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
		String msg=driver.switchTo().alert().getText();
		System.out.println(msg);	 
		// String alertMessage= driver.switchTo().alert().getText();		
      		
		        // Displaying alert message		
		       // System.out.println(alertMessage);
			//alt.accept();
		//	Alert alt2=driver.switchTo().alert();
			//alt.accept();
			}
}