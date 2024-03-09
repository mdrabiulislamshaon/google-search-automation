//Tutorial 4
// Md Rabiul Islam Shaon
//mdrabiulislamshaonn@gmail.com

package writeDataIntotheExcelPackage;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

        public class InputDataIntotheExcel {
            public static void main(String[] args) {
                String filePath = "D:\\\\Learn Java\\\\Java Project\\\\learnHowToInputDataIntotheExcel\\\\WriteExcelData.xlsx";

                try (FileInputStream fis = new FileInputStream(filePath);
                     Workbook workbook = WorkbookFactory.create(fis)) {

                    Sheet sheet = workbook.getSheetAt(0); // Assuming you want to write to the first sheet

                    // Access the cell you want to write to (for example, row 0, column 0)
                    Row row = sheet.getRow(0); // Assuming you want to write to the first row
                    Cell cell = row.createCell(0); // Assuming you want to write to the first column

                    // Write your data to the cell
                    cell.setCellValue("Md Rabiul Islam Shaon");

                    // Save the changes back to the Excel file
                    try (FileOutputStream fos = new FileOutputStream(filePath)) {
                        workbook.write(fos);
                        System.out.println("Data has been written to the Excel file.");
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
