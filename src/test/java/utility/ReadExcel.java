package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	FileInputStream fis;
	File f;
	XSSFWorkbook wb;
	
	public ReadExcel(String path) {
		try {
			f = new File(path);
			fis = new FileInputStream(f);
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getData(int sheetIndex, int row, short column) {
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
	
	public int getRowCount(int sheetIndex) {
		return wb.getSheetAt(sheetIndex).getLastRowNum();
	}
	
	public short getColumnCount(int sheetIndex) {
		return wb.getSheetAt(sheetIndex).getRow(0).getLastCellNum();
	}

}
