package xlshee;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Xlsheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path= "C:\\Users\\DCC\\Desktop\\myfile.xlsx";
		FileInputStream fs = new FileInputStream(path);
		String data=WorkbookFactory.create(fs).getSheet("vctc").getRow(2).getCell(1).getStringCellValue();
				System.out.println(data);
		//Row row=she.getRow(0);
	//Cell cell=row.getCell(1);
		//int lastcell= row.getLastCellNum();
	/*int lastrow=sheet.getLastRowNum();
	for(int x=0;x<lastrow;x++) {
		for(int y=0;y<lastcell;y++)
		{
	String data=sheet.getRow(x).getCell(y).getStringCellValue();
		System.out.print(data+"  ");
		//System.out.print("  ");}
		}
		System.out.println();*/
}}