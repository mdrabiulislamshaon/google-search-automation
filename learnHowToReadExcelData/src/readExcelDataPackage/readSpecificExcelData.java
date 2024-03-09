//Tutorial 7
// Md Rabiul Islam Shaon
//mdrabiulislamshaonn@gmail.com

package readExcelDataPackage;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class readSpecificExcelData {

    public static void main(String[] args) {
        String excelFilePath = "D:\\Learn Java\\Java Project\\learnHowToReadExcelData\\ReadExcelData.xlsx";

        try (FileInputStream fileInputStream = new FileInputStream(excelFilePath);
             Workbook workbook = WorkbookFactory.create(fileInputStream)) {

            Sheet sheet = workbook.getSheetAt(0); // Get the first sheet

            Row row = sheet.getRow(1); // Get the second row
            Cell cell = row.getCell(2); // Get the third cell 

            // Check if the cell is not empty and its type is STRING
            if (cell != null && cell.getCellType() == CellType.STRING) {
                String data = cell.getStringCellValue(); // Get the cell value as a string
                System.out.println("Data from the second row, first column: " + data);
            } else {
                System.out.println("No data found in the specified cell.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
