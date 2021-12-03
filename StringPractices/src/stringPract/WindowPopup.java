package stringPract;



import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\programmersk\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		WebElement alert = driver.findElement(By.xpath("(//a[@class='w3-btn w3-margin-bottom'])[1]"));
		WebElement conf = driver.findElement(By.xpath("(//a[@class='w3-btn w3-margin-bottom'])[2]"));
		WebElement prom = driver.findElement(By.xpath("(//a[@class='w3-btn w3-margin-bottom'])[3]"));
		WebElement line = driver.findElement(By.xpath("(//a[@class='w3-btn w3-margin-bottom'])[4]"));
		
		
		
		
		
		alert.click();
		conf.click();
		prom.click();
		line.click();
		String home=driver.getWindowHandle();
		//System.out.println(home);
	ArrayList<String> allads=new ArrayList<String>(driver.getWindowHandles());
		//System.out.println(driver.getCurrentUrl());
		//ArrayList<String> alladr=new ArrayList<String>(driver.getWindowHandles());
	Thread.sleep(5000);	
	driver.switchTo().window(allads.get(0));
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(5000);	
		driver.switchTo().window(allads.get(1));
		url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(5000);	
			
		driver.switchTo().window(allads.get(2));
		url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(5000);	
		
		driver.switchTo().window(allads.get(3));
		url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(5000);	
	
		driver.switchTo().window(allads.get(4));
		url=driver.getCurrentUrl();
		System.out.println(allads.get(4)+"        "+url);
				Actions act =new Actions(driver);
				//act.moveToElement(alert).click().build().perform();
				//act.click();//left click
				//act.doubleClick();//double left
				//act.contextClick();//right click
				//act.moveToElement();//move pointer to ele
				//act.dragAndDrop(source, target);//drag 
				//act.build();//to combine 2 methods of actions class in 1statement
				//act.perform();
}
}