package stringPract;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeShot {
	static WebDriver driver;
		
		
			public static void shot1() throws IOException{
						Date d=new Date();
						String date = d.toString().replace(" ", "").replace(":", "");
			//SimpleDateFormat sdf=new SimpleDateFormat(d);
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\programmersk\\developer files\\shot\\javed"+date+".jpg");
			FileHandler.copy(src, dest);
			}
			
			 
		

		public static void main(String[] args) throws IOException, InterruptedException{
			
			
			System.setProperty("webdriver.chrome.driver","C:\\programmersk\\chromedriver.exe");
			driver= new ChromeDriver();
			shot1();
			Thread.sleep(2000);			
			driver.get("https://paytm.com/");
			shot1();
			Thread.sleep(2000);	
			WebElement ele= driver.findElement(By.xpath("(//div[@class='_2EGQY cqA0P'])[1]"));
			ele.click();
			shot1();
			
			
			
			
			 //driver.manage().window().maximize();
			 //window().maximize();
			/*
			File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
	   		 File dest=new File("C:\\\\programmersk\\\\developer files\\\\image.jpg");
			 FileHandler.copy(scr, dest);*/
			//Thread.sleep(3000);
		
			//driver.findElement(By.xpath("//div[@class='_2EGQY cqA0P'][1]")).click();

		
			//driver.findElement(By.xpath("//div[@class='_2EGQY cqA0P']")).sendKeys("8805921218");
		
			//driver.findElement(By.xpath("//input[@id='radio1'][1]")).click();
			
			//WebElement fname=driver.findElement(By.xpath(("(//input[@type='text'])[2]")));
			//fname.sendKeys("ismail");

			//String ashu = driver.getCurrentUrl();
			// System.out.println(ashu);
			 //String ashu2 = driver.getTitle();
			 //System.out.println(ashu2);
			// Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
			// WebElement fname=driver.findElement(By.xpath("//input[@name='firstname']"));
			 //fname.click();
			// fname.sendKeys("ashvini");
		
	       // Thread.sleep(3000);	
	     //   Select day=new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
			//day.selectByVisibleText("12");
			// Select month=new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
			//	month.selectByVisibleText("Feb");
			//	WebElement gen = driver.findElement(By.xpath("//input[@name='sex'][@value='1']"));
		//	 gen.click();
		//	 boolean value=gen.isSelected();
		//	 System.out.println(value);
	   
			 //	 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		}}		//File dest2=new File("C:\\programmersk\\developer files\\image2.jpg");
			//	 FileHandler.copy(src, dest2);
			// driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8805921218");
			// driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Shaikh@oo7");
			//Dimension d= new Dimension(200,600);
			//driver.manage().window().setSize(d);
			//	Point p = new Point(100,300);  
			//driver.manage().window().setPosition(p);
			//driver.navigate().to("https://paytm.com/");
			//driver.navigate().refresh();
			 //driver.navigate().back();
			// driver.navigate().forward();
			 //WebElement r = driver.findElement(By.xpath("//div[@class='_2EGQY cqA0P'][1]"));
			 //r.click();
			 //Thread.sleep(3000);
			//WebElement prepaid=driver.findElement(By.xpath("//label[@class='_3M_F']"));
			//Thread.sleep(3000);
			//boolean status=prepaid.isSelected();
			//System.out.println(status);
			// driver.get("http://www.facebook.com");
			// String url = driver.getCurrentUrl();
			// System.out.println(driver.getCurrentUrl());
			// boolean r=url.equals("https://www.facebook.com/");
			// System.out.println(r);
		
			// if(r==true)
			// {
			//	 System.out.println("test pass");
			//	 System.out.println("test case is passed and now go to another test case");
			 //}
			//else {
			//	 System.out.println("test fail");	 
			// }
			// String title=driver.getTitle();
			// Thread.sleep(5000);
			// System.out.println(title);
			// System.out.println("designing the website");
			//System.setProperty("webdriver.gecko.driver",value);
			//System.setProperty("webdriver.ie.driver",value);
		//System.setProperty("webdriver.opera.driver",value);
		//Thread.sleep(5000);
		//driver.navigate().to("https://www.facebook.com");
		//Dimension d= new Dimension(200,400);
		//driver.manage().window().setSize(d);
		 
		 //driver.manage().window().maximize();
		// driver.navigate().to("http://www.paytm.com");
		
		 //driver.navigate().forward();
		// String url = driver.getCurrentUrl();
		// System.out.println(url);

			
		 //System.out.println(driver.manage().window().getSize());
		

		//private static void getCurrentUrl() {
		
			


