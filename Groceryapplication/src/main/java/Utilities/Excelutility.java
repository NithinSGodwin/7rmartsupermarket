package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility {
	public static FileInputStream f;
	public static XSSFWorkbook w;
	public static XSSFSheet s;

	public static String readStringData(int i, int j,String sheet) throws IOException {
		f = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\GroceryAppDetails.xlsx\"");
		w = new XSSFWorkbook(f);
		s = w.getSheet(sheet);
		XSSFRow r = s.getRow(i);
		XSSFCell c = r.getCell(j);
		return c.getStringCellValue();

	}

	public static String readIntegerData(int i, int j,String sheet) throws IOException

	{
		f = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\GroceryAppDetails.xlsx\"");
		w = new XSSFWorkbook(f);
		s = w.getSheet(sheet);
		XSSFRow r = s.getRow(i);
		XSSFCell c = r.getCell(j);
		int y = (int) c.getNumericCellValue();
		return String.valueOf(y);

	}
}
