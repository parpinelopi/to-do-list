package toDoLy;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Class Interface contains mostly the interface of the application, print methods and switch cases
 * for the option of the main menu.
 */


public class Interface {

    public void startScreen(ArrayList<Task> list) throws IOException, ParseException {
        SaveFile saveFile = new SaveFile();
        TaskManager taskManager = new TaskManager();
        String menuInput;

        Scanner menu = new Scanner(System.in);

        while (true) {

            System.out.println("\n");
            System.out.println("Welcome to toDoLY");

            try{
                saveFile.readFile();
            }
            catch(FileNotFoundException ex){
                ex.printStackTrace();
            }
            taskManager.countStatus(list);
            System.out.println("Enter your choice from the menu");
            System.out.println("\n");
            System.out.println(" Menu ");
            System.out.println("1. Show task list");
            System.out.println("2. Add new task ");
            System.out.println("3. Edit task");
            System.out.println("4. Clear task list");
            System.out.println("5. Save to file");
            System.out.println("6. Quit application");


            menuInput = menu.nextLine();

            switch (menuInput) {
                case "1":
                    System.out.println("Sort by 1. Date or 2. project, 0. exit");

                    taskManager.sortDisplay(list, menu.nextLine());
                    break;
                case "2":
                    list = taskAdd(list);
                    break;
                case "3":
                    taskManager.editOption(list);
                    break;
                case "4":
                    list.removeAll(list);
                    break;
                case "5":
                    saveFile.arrayToOutput(list);
                    break;
                case "6":
                    menu.close();
                    System.out.println("Thank you for using ToDoLy");
                    return;
                default:
                    System.out.println("You have entered invalid choice. Please try again");

            }
        }
    }

    public ArrayList taskAdd(ArrayList<Task> tasks) {
        Scanner userInput = new Scanner(System.in);


        System.out.println("enter project: ");
        String project = userInput.nextLine();
        Scanner titleInput = new Scanner(System.in);
        System.out.println("enter title: ");
        String title = titleInput.nextLine();
        System.out.println("enter due date (dd/mm/yyyy) : ");

        Date dueDate = insertDate();

        Task task = new Task(project, title, dueDate);

        tasks.add(task);
        System.out.println(tasks.size());
        return tasks;
    }

    /**
     * This method handles the due date input from the user and iterates until the valid date
     * type is given. Printing also messages to notify of invalid or valid input.
     *
     * @return the valid due date after validating user's due date input from the user and when repeating it.
     */
    public Date insertDate() {

        String userDueDateInput;
        Date validDate;
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        while (true) {
            Scanner dateInput = new Scanner(System.in);
            userDueDateInput = dateInput.nextLine();


            try {
                validDate = format.parse(userDueDateInput);



                System.out.println(userDueDateInput + " date is valid");
                break;

            } catch (ParseException e) {
                System.out.println(userDueDateInput + " date is invalid, please enter the date again");

            }
        }

        Date dueDate = validDate;
        return dueDate;
    }
}