//Tutorial 8
// Md Rabiul Islam Shaon
//mdrabiulislamshaonn@gmail.com

package readDataThenSearchInGooglePackage;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;

public class readDataThenSearchInGoogle {
    public static void main(String[] args) {
        String filePath = "D:\\Learn Java\\Java Project\\learnReadDataThenSearchInGoogle\\DataSearch.xlsx";
        
        // Path to ChromeDriver executable. You need to replace it with the actual path.
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = WorkbookFactory.create(fis)) {

            Sheet sheet = workbook.getSheetAt(0); // Assuming you want to read from the first sheet

            // Access the cell you want to read (for example, row 0, column 0)
            Row row = sheet.getRow(0); // Assuming you want to read from the first row
            Cell cell = row.getCell(0); // Assuming you want to read from the first column

            // Get the value from the cell
            String searchQuery = cell.getStringCellValue();

            // Navigate to Google and perform the search
            driver.get("https://www.google.com");
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys(searchQuery);
            searchBox.submit();

            // You may want to add additional code to handle the search results

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the WebDriver session
            driver.quit();
        }
    }
}
