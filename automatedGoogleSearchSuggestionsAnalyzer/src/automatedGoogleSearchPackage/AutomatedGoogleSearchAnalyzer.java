//Tutorial 9 = Combined all tutorial basic
// Md Rabiul Islam Shaon
//mdrabiulislamshaonn@gmail.com

package automatedGoogleSearchPackage;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatedGoogleSearchAnalyzer {

  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\selenium\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");

    // Iterate 7 times
    for (int i = 0; i <7; i++) {
      WebDriver driver = new ChromeDriver();

      try {
        String excelFilePath = "D:\\Learn Java\\Java Project\\automatedGoogleSearchSuggestionsAnalyzer\\keywords.xlsx";
        FileInputStream fis = new FileInputStream(excelFilePath);
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheetAt(i);

        int rowNum = 1;
        Row row;

        while ((row = sheet.getRow(rowNum)) != null) {
          Cell cell = row.getCell(1);

          if (cell != null && cell.getCellType() == CellType.STRING) {
            String keyword = cell.getStringCellValue();
            driver.get("https://www.google.com");

            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys(keyword);
            Thread.sleep(1000);

            List < WebElement > suggestions = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
            System.out.println("Total Keywords for \"" + keyword + "\": " + suggestions.size());

            String[] suggestionsText = new String[suggestions.size()];

            for (int j = 0; j < suggestions.size(); j++) {
              suggestionsText[j] = suggestions.get(j).getText();
              System.out.println("Keyword " + (j + 1) + ": " + suggestionsText[j]);
            }

            String longestString = findLongestString(suggestionsText);
            String shortestString = findShortestString(suggestionsText);

            Cell longestCell = row.createCell(2);
            longestCell.setCellValue(longestString);
            Cell shortestCell = row.createCell(3);
            shortestCell.setCellValue(shortestString);
          }

          rowNum++;
        }

        try (FileOutputStream fos = new FileOutputStream(excelFilePath)) {
          workbook.write(fos);
        }

        System.out.println("Keyword list has been written successfully to the sheet");

        fis.close();
      } catch (IOException | InterruptedException e) {
        e.printStackTrace();
      } finally {
        driver.quit();
      }
    }
  }

  public static String findLongestString(String[] strings) {
    String longestString = "";
    int maxLength = 0;

    for (String str: strings) {
      if (str.length() > maxLength) {
        maxLength = str.length();
        longestString = str;
      }
    }

    return longestString;
  }

  public static String findShortestString(String[] strings) {
    String shortestString = strings[0];
    int minLength = strings[0].length();

    for (String str: strings) {
      if (str.length() < minLength) {
        minLength = str.length();
        shortestString = str;
      }
    }

    return shortestString;
  }
}
