//Tutorial 2
// Md Rabiul Islam Shaon
//mdrabiulislamshaonn@gmail.com

package sentAnyKeywordToSearchBoxPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sentAnyKeywordToSearchBox {

	public static void main(String[] args) {
        // Set the path for the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");

        // Initialize the ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Open Google search engine
            driver.get("http://www.google.com");

            // Pause execution for 2 seconds (2000 milliseconds)
            Thread.sleep(2000);

            // Find the search input element by its name attribute and enter the search query
            driver.findElement(By.name("q")).sendKeys("Md Rabiul Islam Shaon");

            // Pause execution for 1 second (1000 milliseconds)
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Quit the WebDriver session
            driver.quit();
        }
	}

}
