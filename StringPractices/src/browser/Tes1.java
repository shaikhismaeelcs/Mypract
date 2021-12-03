package browser;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tes1 {
	
		private WebDriver driver;
		Pom1 t1;
		
			@BeforeClass
			public void beforeClass() 
			{
				System.setProperty("webdriver.chrome.driver","C:\\programmersk\\chromedriver.exe");

				 driver = new ChromeDriver();
				
				//System.out.println("beforeclass");
			}
		   @BeforeMethod 
		   public void beforeMethod() 
		   {
			   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				driver.get("https://en-gb.facebook.com/");
				t1 = new Pom1(driver);
			   
			   //System.out.println("beforemethod");
			   
		   }
		   @Test
		   public void test() 
		   {
			   System.out.println("test1");
			   
			   t1.senduser();
			  t1.sendpass();
			   t1.submit(); 
		   
		   } 
		   
		   @AfterClass
			public void afterClass() 
		   {
				System.out.println("afterclass");
		   }
		   
		   @AfterMethod
		   public void afterMethod() 
		   {
			   System.out.println("aftermethod");
			   
		   }
		   
		   
	}

