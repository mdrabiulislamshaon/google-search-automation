//Tutorial 6
// Md Rabiul Islam Shaon
//mdrabiulislamshaonn@gmail.com


package readExcelDataPackage;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelData {

    public static void main(String[] args) {
        try {
            // Path to your Excel file
            String excelFilePath = "D:\\Learn Java\\Java Project\\learnHowToReadExcelData\\ReadExcelData.xlsx";

            // Create a FileInputStream to read the Excel file
            FileInputStream fis = new FileInputStream(excelFilePath);

            // Create a workbook instance from the Excel file
            Workbook workbook = WorkbookFactory.create(fis);

            // Get the first sheet from the workbook
            Sheet sheet = workbook.getSheetAt(0); // Index 0 represents the first sheet

            // Iterate through each row in the sheet
            for (Row row : sheet) {
                // Iterate through each cell in the row
                for (Cell cell : row) {
                    // Print the cell value based on its type
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue() + "\t");
                            break;
                        case BLANK:
                            System.out.print("BLANK\t");
                            break;
                        default:
                            System.out.print("UNKNOWN\t");
                    }
                }
                System.out.println(); // Move to the next line after printing each row
            }

            // Close the FileInputStream
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
