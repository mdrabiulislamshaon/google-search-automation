# Read Excel Data

This Java program demonstrates how to read data from an Excel file using Apache POI library.

## Prerequisites

Before running this code, ensure you have the following installed:

- Java Development Kit (JDK)
- Apache POI library

## Setup

1. **Java Development Kit (JDK):**
   Install JDK appropriate for your system. You can download it from [Oracle's website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

2. **Apache POI Library:**
   Add Apache POI library to your project. You can download it from [Apache POI's official website](https://poi.apache.org/download.html).

## Running the Program

To run the program:

1. Clone this repository to your local machine.
2. Navigate to the directory containing the code.
3. Compile the Java file.
4. Execute the compiled Java program.

## Code Explanation

- The program starts by specifying the file path of the Excel file.
- It creates a `FileInputStream` to read the Excel file.
- A `Workbook` instance is created from the Excel file using `WorkbookFactory.create(fis)`.
- It retrieves the first sheet from the workbook.
- Iterates through each row and each cell in the sheet.
- Depending on the cell type, it prints the cell value.
- Finally, it closes the `FileInputStream`.

## Notes

- Ensure the specified file path is correct and accessible.
- Make sure the Apache POI library is included in your project's build path.
- Handle exceptions appropriately for robustness in real-world applications.
- This example reads data from the first sheet of the Excel file. Adjust the sheet index according to your requirements.
- Different cell types (STRING, NUMERIC, BOOLEAN, BLANK) are handled accordingly.
- Ensure your Excel file is in the correct format and contains data as expected.



# Read Specific Excel Data

This Java program demonstrates how to read data from a specific cell of an Excel file using Apache POI library.

## Prerequisites

Before running this code, ensure you have the following installed:

- Java Development Kit (JDK)
- Apache POI library

## Setup

1. **Java Development Kit (JDK):**
   Install JDK appropriate for your system. You can download it from [Oracle's website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

2. **Apache POI Library:**
   Add Apache POI library to your project. You can download it from [Apache POI's official website](https://poi.apache.org/download.html).

## Running the Program

To run the program:

1. Clone this repository to your local machine.
2. Navigate to the directory containing the code.
3. Compile the Java file.
4. Execute the compiled Java program.

## Code Explanation

- The program starts by specifying the file path of the Excel file.
- It opens the Excel file using `FileInputStream` and creates a `Workbook` instance.
- It retrieves the first sheet from the workbook.
- It accesses a specific row and cell based on the provided indices.
- Checks if the cell is not empty and its type is STRING.
- If the conditions are met, it retrieves the cell value as a string and prints it.
- If the cell is empty or its type is not STRING, it prints a message indicating no data found.

## Notes

- Ensure the specified file path is correct and accessible.
- Make sure the Apache POI library is included in your project's build path.
- Handle exceptions appropriately for robustness in real-world applications.
- This example reads data from the first sheet of the Excel file and a specific cell (row 2, column 3). Adjust the sheet index and cell coordinates according to your requirements.
- Ensure your Excel file is in the correct format and contains data as expected.