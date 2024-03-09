//Tutorial 1
// Md Rabiul Islam Shaon
//mdrabiulislamshaonn@gmail.com

package connectingToWebDriverPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConnectingToWebDriver {

    public static void main(String[] args) throws InterruptedException {
        // Set the path for the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");

        // Initialize the ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Open Google search engine
            driver.get("https://www.google.com");

            // Pause execution for 2 seconds (1s = 1000 milliseconds)
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Quit the WebDriver session if you want
            driver.quit();
        }
    }

}
