# Hospital Inspection System

This Java program models a hospital inspection system using abstract classes and interfaces. Users can input hospital details and generate an inspection report indicating whether an inspection is needed.

## Description

This project models a hospital inspection system where users can input hospital location, name, and years since the last inspection. The program generates a report indicating whether an inspection is needed based on the years since the last inspection. It demonstrates the use of abstract classes, interfaces, and object-oriented programming principles.

## Features

- **User Input**: Allows users to input hospital location, name, and years since the last inspection.
- **Inspection Report**: Generates an inspection report indicating whether an inspection is needed.
- **Abstract Classes and Interfaces**: Demonstrates the use of abstract classes and interfaces in Java.
- **Data Display**: Displays the inspection report in the console.

## Skills and Lessons Learned

- **Java Programming**: Practiced creating and managing abstract classes and interfaces.
- **Object-Oriented Design**: Utilized inheritance, encapsulation, and polymorphism to model the inspection system.
- **User Input Handling**: Implemented input handling using `Scanner` for console input.
- **Report Generation**: Created methods to generate and print inspection reports.

## Program Notes

- **Use_Inspection Class**: The main class that runs the program and handles user input.
- **Inspection Class**: An abstract class that represents inspection details and its attributes.
- **Hospital_Inspections Class**: A class that extends `Inspection` and implements `iInspection` to generate inspection reports.
- **iInspection Interface**: An interface that defines methods for inspection details.

## Setup and Installation

1. **Clone the Repository**:
   ```sh
   git clone https://github.com/LindeloNkosi/HospitalInspectionSystem.git
