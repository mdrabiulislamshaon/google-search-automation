# Find Element By SendKeys

This Java program demonstrates how to use Selenium WebDriver to interact with a web page by finding elements and sending keys to them. Specifically, it opens Google search engine, enters a search query into the search box, and submits the query.

## Prerequisites

Before running this code, ensure you have the following installed:

- Java Development Kit (JDK)
- Selenium WebDriver library
- ChromeDriver executable

## Setup

1. **Java Development Kit (JDK):**
   Install JDK appropriate for your system. You can download it from [Oracle's website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

2. **Selenium WebDriver Library:**
   Add Selenium WebDriver library to your project. You can download it from [Selenium's official website](https://www.selenium.dev/downloads/).

3. **ChromeDriver Executable:**
   Download ChromeDriver executable compatible with your Chrome browser version. Ensure you have set the system property pointing to the ChromeDriver executable's location.

## Running the Program

To run the program:

1. Clone this repository to your local machine.
2. Navigate to the directory containing the code.
3. Compile the Java file.
4. Execute the compiled Java program.

## Code Explanation

- The program starts by setting the path for the ChromeDriver executable.
- It then initializes a ChromeDriver instance.
- The program navigates to the Google search engine.
- After a pause, it finds the search input element by its name attribute and enters the search query.
- The search query is submitted.
- Finally, the WebDriver session is quit.

## Notes

- Ensure your Chrome browser is installed and updated to the latest version.
- Adjust the path to the ChromeDriver executable based on your system configuration.
- Handle exceptions appropriately for robustness in real-world applications.
- This example uses a simple sleep mechanism for demonstration purposes. In actual test automation scenarios, consider using more robust waiting strategies like explicit waits.
