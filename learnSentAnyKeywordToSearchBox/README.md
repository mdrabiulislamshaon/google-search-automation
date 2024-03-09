# Send Any Keyword to Search Box

This Java program opens Google search engine, sends any keyword to the search box, and then closes the browser.

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
- It initializes a ChromeDriver instance.
- The program opens the Google search engine.
- After a pause, it finds the search input element by its name attribute and enters the search query.
- Finally, it closes the WebDriver session.

## Notes

- Adjust the path to the ChromeDriver executable based on your system configuration.
- Handle exceptions appropriately for robustness in real-world applications.
- This example sends the keyword "Md Rabiul Islam Shaon" to the Google search box. Modify the sent keyword according to your requirements.
