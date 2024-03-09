# Automated Google Search Analyzer

This Java program automates Google searches based on keywords provided in an Excel file and analyzes the suggestions returned by Google.

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

- The program starts by setting the path for the ChromeDriver executable.
- It iterates over each sheet in the Excel file (assumed to contain keyword data).
- For each keyword in each sheet, it performs a Google search and retrieves the suggestions.
- It calculates the longest and shortest suggestions and writes them back to the Excel file.
- Suggestions are printed for analysis.
- The program closes the WebDriver session after each iteration.

## Notes

- Ensure the specified file path is correct and accessible.
- Adjust the path to the ChromeDriver executable based on your system configuration.
- Handle exceptions appropriately for robustness in real-world applications.
- This program assumes that the Excel file contains keyword data in multiple sheets, and each sheet represents keywords to be searched.
- Adjust the iteration and cell indices according to your Excel file structure.
- Additional analysis or processing can be added based on the retrieved suggestions.