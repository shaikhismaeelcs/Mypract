package browser;




import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenAshvini {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\programmersk\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\programmersk\\developer files\\shot\\image2.jpg");
		FileHandler.copy(src, dest);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@href='support.php'])[6]")).click();
		File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest1=new File("C:\\programmersk\\developer files\\shot\\image.jpg");
		FileHandler.copy(src1, dest1);
}
}