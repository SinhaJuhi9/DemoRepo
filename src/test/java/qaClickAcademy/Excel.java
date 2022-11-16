package qaClickAcademy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis =new FileInputStream("G:\\SHIKSHA\\Juhi\\Eclipse_workspace\\ApachePOIpractice.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		int sheets= workbook.getNumberOfSheets();
		for(int i=0;i<=sheets;i++) {
			if( workbook.getSheetName(i).equalsIgnoreCase("Sheet1"));
		XSSFSheet sheet=	workbook.getSheetAt(i);
		}
	}

}
