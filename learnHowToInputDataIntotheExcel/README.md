# Write Data Into the Excel

This Java program demonstrates how to write data into an Excel file using Apache POI library.

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
- It accesses the desired sheet and cell where data needs to be written.
- Data is written to the cell using the `setCellValue` method.
- Finally, changes are saved back to the Excel file using `FileOutputStream`.

## Notes

- Ensure the specified file path is correct and accessible.
- Make sure the Apache POI library is included in your project's build path.
- Handle exceptions appropriately for robustness in real-world applications.
- This example assumes you want to write data to the first sheet and the first cell of the Excel file. Adjust the sheet index and cell coordinates according to your requirements.
- This example overwrites the existing Excel file. If you want to append data or handle existing data differently, adjust the logic accordingly.



# Write Data Into the Excel (Specific Cell)

This Java program demonstrates how to write data into a specific cell of an Excel file using Apache POI library.

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
- It accesses the desired sheet and cell where data needs to be written.
- If the row does not exist, it creates a new row.
- Data is written to the specified cell using the `setCellValue` method.
- Finally, changes are saved back to the Excel file using `FileOutputStream`.

## Notes

- Ensure the specified file path is correct and accessible.
- Make sure the Apache POI library is included in your project's build path.
- Handle exceptions appropriately for robustness in real-world applications.
- This example assumes you want to write data to the first sheet and a specific cell (row 3, column 2) of the Excel file. Adjust the sheet index and cell coordinates according to your requirements.
- This example overwrites the existing Excel file. If you want to append data or handle existing data differently, adjust the logic accordingly.