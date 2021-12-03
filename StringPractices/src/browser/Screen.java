package browser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class Screen {
	static WebDriver driver;
	
	public static void screen() throws IOException
	{
		Date d=new Date();
		String Fname=d.toString().replace(" ", "").replace(":", "");
		
		
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\programmersk\\developer files\\shot\\"+Fname+".jpg");
		FileHandler.copy(scr, dest);
		
	}
		public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\programmersk\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		screen();
		
		WebElement Uid=driver.findElement(By.xpath("//input[@type='email']"));
		Uid.click();
		
		Thread.sleep(10000);
		String path="C:\\Users\\DCC\\Desktop\\myfile.xlsx";
		
		FileInputStream f=new FileInputStream(path);
		String uid=WorkbookFactory.create(f).getSheet("vctc").getRow(1).getCell(0).getStringCellValue();
		Uid.sendKeys(uid);
		screen();
		WebElement next=driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[1]"));
		Thread.sleep(5000);
		next.click();
		Thread.sleep(5000);
		screen();
	}

}