package utility.pack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XlSheet {
	public static String xl(int r, int c) throws EncryptedDocumentException, IOException {
		String path= "C:\\Users\\DCC\\Desktop\\myfile.xlsx";
		FileInputStream fs = new FileInputStream(path);
		String data=WorkbookFactory.create(fs).getSheet("vctc").getRow(r).getCell(c).getStringCellValue();
				//System.out.println(data);
				return data;
}}