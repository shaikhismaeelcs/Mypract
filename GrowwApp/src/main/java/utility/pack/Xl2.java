package utility.pack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Xl2 {
	
	public static String xl3(int ro, int cel) throws EncryptedDocumentException, IOException {
		FileInputStream fs=new FileInputStream("C:\\Users\\DCC\\Desktop\\myfile.xlsx");
	String data=WorkbookFactory.create(fs).getSheet("vctc").getRow(ro).getCell(cel).getStringCellValue();
	
	return data;
	}

}
