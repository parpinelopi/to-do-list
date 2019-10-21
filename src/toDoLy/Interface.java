package toDoLy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Class Interface contains mostly the interface of the application, print methods and switch cases
 * for the option of the main menu.
 */


public class Interface {

    public void startScreen(ArrayList<Task> list) throws IOException {
        SaveFile saveFile = new SaveFile();
        TaskManager taskManager = new TaskManager();
        AppToDo appToDo = new AppToDo();
        Task task = new Task();
        Interface start= new Interface();
        //list.add(
               // new Task("taskremove", "remove", new Date() )
        //);

        String menuInput;

        Scanner menu = new Scanner(System.in);

        while (true) {

            System.out.println("Welcome to toDoLY");

            System.out.println("You have " + /*taskTodo+*/ " and " + /*taskDone*/ "+  tasks are done" ); ///variables are instantiated in java.TaskManager countTasks method
            System.out.println("\n");
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


            /**
             * switch statement menuInput represents the options of the main menu that are
             * executed with numerical input from the user that are assigned to every option.
             */
            // switch cases written according to options in the menu, 1..2..3 etc. Should I use switch in a switch for the further options in the menu?
            switch (menuInput) {
                case "1":
                    System.out.println("Sort by 1. Date or 2. project, 0. exit");

                    taskManager.sortDisplay(list, menu.nextLine());
                    //taskManager.displayTasks();
                    //method ("show");
                    break;
                case "2":
                    //taskManager.taskAdd(createTask());
                    list = appToDo.taskAdd(list);
                    break;
                case "3":
                    taskManager.editOption(list);
                    break;
                case "4":
                    list.removeAll(list);
                    //clear list method perhaps from generics
                    break;
                case "5":
                    //("Save");
                    saveFile.arrayToOutput(list);
                    //saveFile.write();
                    break;
                case"6":
                    System.out.println("Thank you for using ToDoLy");
                    menu.close();
                default:
                    System.out.println("You have entered invalid choice. Please try again");

            }
        }
    }
}