package utility.pack;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
	static WebDriver driver;
	Date d;
	static FileInputStream fs;
	public UtilityClass(WebDriver driver)
	{ //constructor
		this.driver=driver;
		}
	//pass shot
	public void pshot() throws IOException {

		 d=new Date();
		String date = d.toString().replace(" ", "").replace(":", "");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\programmersk\\developer files\\shot\\image"+date+".jpg");
		FileHandler.copy(src, dest);
	}
	//fail shot
	
	public void fshot() throws IOException {
		// TODO Auto-generated method stub
		 d=new Date();
			String date = d.toString().replace(" ", "").replace(":", "");
				//SimpleDateFormat sdf=new SimpleDateFormat(d);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\programmersk\\developer files\\shot1\\image"+date+".jpg");
		FileHandler.copy(src, dest);
	}
	
	
	

}