package readexcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XSSFWorkbook workbook=null;
		
		try {
		 workbook=new XSSFWorkbook("C:\\Users\\nisha\\eclipse-workspace\\July23Intership\\src\\readexcel\\data.xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFSheet sheet1= workbook.getSheet("sheet1");
		
         int rowcount=sheet1.getPhysicalNumberOfRows();
         
         System.out.println(rowcount); 
         
         int colcount=sheet1.getRow(0).getPhysicalNumberOfCells();
       
         System.out.println(colcount); 
         
      //   String Data=sheet1.getRow(0).getCell(0).getStringCellValue();
        // System.out.println(Data); 
         
         for (int i=0;i<rowcount;i++) {
        	 
        	String Data= sheet1.getRow(i).getCell(0).getStringCellValue();
        	 System.out.println(Data); 
         }
	}

}
