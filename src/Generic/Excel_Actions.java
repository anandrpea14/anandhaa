package Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;

public class Excel_Actions 
{
	public static void DDT(WebElement ele,String value,String sheet,int row,int cell) throws Exception
	{
		FileInputStream fis = new FileInputStream(value);
		Workbook Wb = WorkbookFactory.create(fis);
		
		Sheet SH = Wb.getSheet(sheet);
		
		Row R = SH.getRow(row);
		
		Cell C = R.getCell(cell);
		
		String data = C.getStringCellValue();
		System.out.println(data);
	}
}
