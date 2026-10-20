package seleniumdemo2;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExcelReadDemo {
	
	private static final Logger logger = LoggerFactory.getLogger(ExcelReadDemo.class);

    public static void main(String[] args) throws Exception {

    	logger.info("Opening Excel file...");
        FileInputStream file = new FileInputStream("test-data/LoginData.xlsx");

        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet("Login");
      
        //verify row and cell exists before reading data to avoid Null pointer exception
        if(sheet.getRow(1)!=null && sheet.getRow(1).getCell(0)!=null) {
        	  String username = sheet.getRow(1).getCell(0).getStringCellValue();
              String password = sheet.getRow(1).getCell(1).getStringCellValue();
              
              logger.info("Username: {}", username);
              logger.info("Password: {}", password);
        }
        else {
        	logger.error("Row or cell is empty in Excel sheet");
        }


       workbook.close();
        file.close();
    }
}