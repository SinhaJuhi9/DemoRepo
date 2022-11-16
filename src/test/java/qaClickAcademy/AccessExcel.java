package qaClickAcademy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AccessExcel {
	public static void main(String[] args) throws IOException {
	FileInputStream fis =new FileInputStream("G:\\SHIKSHA\\Juhi\\Eclipse_workspace\\ApachePOIpractice.xlsx");
	XSSFWorkbook workbook =new  XSSFWorkbook(fis);
	for(int i=0;i<workbook.getNumberOfSheets();i++) {
		if (workbook.getSheetName(i).equalsIgnoreCase("Sheet2"))
		{
			
	XSSFSheet sheet=	workbook.getSheetAt(i);
	Iterator<Row> rows=sheet.rowIterator();
	Row firtRow=rows.next();
	
	
	Iterator<Cell> cells=firtRow.cellIterator();
	int k =0;
	int count =0;
	while(cells.hasNext()) {
		Cell value=cells.next();	
		//System.out.println(value.getStringCellValue());
			if(value.getStringCellValue().equalsIgnoreCase("TestCases")) {
				 count=k;
		}	
			k++;	
	}
	
	
	System.out.println(count);
	
	
	while(rows.hasNext()) {
		Row r=rows.next();	
	
		if(r.getCell(count).getStringCellValue().equalsIgnoreCase("Purchase")) {
			
			Iterator<Cell> cv=r.cellIterator();
			while(cv.hasNext()) {
		
				System.out.println(	cv.next().getStringCellValue());
			}
		
	}		
		
		
	}
	}
	}
	}}
