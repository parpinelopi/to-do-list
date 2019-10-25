# ToDoLy

## To-do list in Java

This project’s purpose is to help users with the management of their daily tasks. It is a checklist where all tasks that need to be done daily are listed and  can managed  (edited, added, deleted, sorted,  marked as completed and saved to file) via the menu interface. 


## Getting Started

Read through the instructions for running the program on your computer. 


## Prerequisites

For running the application on the computer a code editor is required, such as IntelliJ, Visual Studio Code etc. 
**JUnit** plugin for running the tests

# Installing
In order to run ToDoLy on your computer clone the application folder via the terminal, after the folder is created in the assigned location, open a code  editor and add the application folder (open project).Finally, when the project has loaded, run ‘Main’ and interact with the application via the menu that will appear on the code editor console by giving input according to  instructions that will be displayed on the terminal. 


## Running the tests 

The application folder includes a test package that tests some of the functions. Throughout the development application tests were also run manually in order to simulate user input and observe the application’s behaviour. 

### Tests

Three types of tests were considered of special interest. The test for checking the creation of a CSV file that stores the tasks and if the tasks are properly read from the file and if the formatting is consistent. Additional tests were done for the sorting of the task list according to date and to project. 

The following methods were created 
-sortTask (JUnit method : *assertEquals*)
-csvFileCreation (JUnit method : *assertTrue*)
-readFromFile(JUnit method : *assertEquals*)

## Built with 
Java API

## Versioning 
SemVer

## Authors
Pinelopi Paraskevopoulou

## License
Open source

## Acknowledgements
Thank you:
-internet for the numerous learning resources
-mentor for the support and inspiration





Access to [ToDoLy Trello board for the project](https://trello.com/invite/b/aUi7NWE8/1a66bb5040e717c9c4b202808aea680d/java-project)
