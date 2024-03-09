//Tutorial 5
// Md Rabiul Islam Shaon
//mdrabiulislamshaonn@gmail.com

package writeDataIntotheExcelPackage;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputDataIntotheSpecificCell {
    public static void main(String[] args) {
        String filePath = "D:\\Learn Java\\Java Project\\learnHowToInputDataIntotheExcel\\WriteExcelData.xlsx";

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = WorkbookFactory.create(fis)) {

            Sheet sheet = workbook.getSheetAt(0); // Assuming you want to write to the first sheet

            // Access the cell you want to write to (for example, row 2, column 1)
            Row row = sheet.getRow(0); // 3rd row
            if (row == null) {
                row = sheet.createRow(2); // Create the row if it doesn't exist
            }
            Cell cell = row.createCell(1); // 2nd column

            // Write your data to the cell
            cell.setCellValue("BSc in CSE");

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
