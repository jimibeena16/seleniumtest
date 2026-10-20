package seleniumdemo2;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MultiExcelReadDemo {
	
	//static {System.setProperty("org.slf4j.simpleLogger.logFile", "System.out");}

    private static final Logger logger =
            LoggerFactory.getLogger(MultiExcelReadDemo.class);

    public static void main(String[] args) {

        try {

            logger.info("Opening Excel file...");

            FileInputStream file = new FileInputStream("test-data/LoginData.xlsx");

            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheet("Login");

            if (sheet == null) {
                logger.error("Sheet 'Login' not found");
                return;
            }

            int lastRowNum = sheet.getLastRowNum();

            logger.info("Total rows of test data: {}", lastRowNum);

            // Start from row 1 because row 0 contains headers
            for (int i = 1; i <= lastRowNum; i++) {

                Row row = sheet.getRow(i);

                if (row == null) {
                    logger.warn("Row {} is empty", i);
                    continue;
                }

                Cell usernameCell = row.getCell(0);
                Cell passwordCell = row.getCell(1);

                if (usernameCell == null || passwordCell == null) {
                    logger.warn("Row {} has missing cell data", i);
                    continue;
                }

                String username = usernameCell.getStringCellValue();
                String password = passwordCell.getStringCellValue();

                logger.info("=================================");
                logger.info("Row Number : {}", i);
                logger.info("Username   : {}", username);
                logger.info("Password   : {}", password);
            }

            workbook.close();
            file.close();

            logger.info("Excel file reading completed.");

        } catch (Exception e) {
            logger.error("Error while reading Excel file", e);
        }
    }
}

