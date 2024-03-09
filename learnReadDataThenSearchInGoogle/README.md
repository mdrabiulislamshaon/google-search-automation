# Read Data Then Search in Google

This Java program reads data from an Excel file and performs a Google search using Selenium WebDriver.

## Prerequisites

Before running this code, ensure you have the following installed:

- Java Development Kit (JDK)
- Apache POI library
- Selenium WebDriver library
- ChromeDriver executable

## Setup

1. **Java Development Kit (JDK):**
   Install JDK appropriate for your system. You can download it from [Oracle's website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

2. **Apache POI Library:**
   Add Apache POI library to your project. You can download it from [Apache POI's official website](https://poi.apache.org/download.html).

3. **Selenium WebDriver Library:**
   Add Selenium WebDriver library to your project. You can download it from [Selenium's official website](https://www.selenium.dev/downloads/).

4. **ChromeDriver Executable:**
   Download ChromeDriver executable compatible with your Chrome browser version. Ensure you have set the system property pointing to the ChromeDriver executable's location.

## Running the Program

To run the program:

1. Clone this repository to your local machine.
2. Navigate to the directory containing the code.
3. Compile the Java file.
4. Execute the compiled Java program.

## Code Explanation

- The program starts by specifying the file path of the Excel file containing search queries.
- It sets the path for the ChromeDriver executable.
- It initializes a ChromeDriver instance.
- The program reads the search query from the Excel file.
- It navigates to Google and performs the search using the search query.
- Finally, it closes the WebDriver session.

## Notes

- Ensure the specified file path is correct and accessible.
- Adjust the path to the ChromeDriver executable based on your system configuration.
- Handle exceptions appropriately for robustness in real-world applications.
- This example assumes you want to read data from the first sheet of the Excel file and perform a Google search using the search query from the first cell (row 1, column 1). Adjust the sheet index and cell coordinates according to your requirements.
- Additional code can be added to handle search results or perform other actions after the search.