package test.pack;


import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
public class firsttestngfile {
    public String fdriver = "C:\\programmersk\\geckodriver.exe";
    public String url = "https://www.facebook.com";
    String chdriver  = "C:\\programmersk\\chromedriver.exe";
    public WebDriver driver ; 
   
     @BeforeMethod
      public void launchBrowser() {
          System.out.println("launching browser"); 
          System.setProperty("webdriver.chrome.driver",fdriver);
       driver= new FirefoxDriver();
          driver.get(url);
      }
      @Test 
      public void verifyHomepageTitle() {
          String expectedTitle = "Welcome: Mercury Tours";
          String actual = driver.getTitle();
          System.out.println(actual);
          if (actual==expectedTitle) {
        	  System.out.println("test passes");
          }
         
       Assert.assertEquals(actual, expectedTitle);
     }
      @AfterMethod
      
      public void terminateBrowser(){
        //  driver.close();
    	  System.out.println("success");
      }
}