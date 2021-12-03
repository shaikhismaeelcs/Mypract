package stringPract;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicT {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\programmersk\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		List<WebElement> head= driver.findElements(By.xpath("//table[@class='dataTable']//th"));
		int sizehe= head.size();
		System.out.println("no of headers"+sizehe);
		for(int x=0;x<sizehe;x++) {
			String str=head.get(x).getText();
			System.out.print(str+"  ");
		}
		
		List<WebElement> row= driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
		int sizerow=row.size();
		System.out.println("no of rows"+sizerow);
		
		for(int i=1;i<sizerow;i++)
		{
				List<WebElement> elements= driver.findElements(By.xpath("//table[@class='dataTable']//tr["+i+"]//td"));
				int esize=elements.size();
				System.out.println("no of ele in row"+(i)+"="+esize);
				for(int a=0;a<esize;a++) {
					String str2=elements.get(a).getText();
					System.out.print(str2+"         ");	 	
				}
				System.out.println();
		}
	}
 
}