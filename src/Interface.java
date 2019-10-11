import java.util.ArrayList;
import java.util.Scanner;


public class Interface {

    public void startScreen(ArrayList<Task> list) {

        TaskManager taskManager = new TaskManager();
        AppToDo appToDo = new AppToDo();


        String menuInput;

        Scanner menu = new Scanner(System.in);

        while (true) {

            System.out.println(" Welcome to toDoLY");
            //("You can have X (method that will sort the tasks to do and) and Y tasks are done. " Should be displayed.

            System.out.println(" Menu ");
            System.out.println("1. Show task list");
            System.out.println("2. Add new task ");
            System.out.println("3. Edit task");
            System.out.println("4. Save and quit");
            System.out.println("Enter your choice from the menu");

            menuInput = menu.nextLine();

            // switch cases written according to options in the menu, 1..2..3 etc. Should I use switch in a switch for the further options in the menu?
            switch (menuInput) {
                case "1":
                    System.out.println("Sort by 1. Date or 2. project, 0. exit");

                    taskManager.sortDisplay(list, menu.nextLine());
                    //method ("show");
                    break;
                case "2":
                    appToDo.taskAdd(list);
                    break;
                case "3":
                    //editOption();
                    //("edit");
                    break;
                case "4":
                    //("Save and quit");
                    // call a save method
                    menu.close();
                    break;
                default:
                    System.out.println("You have entered invalid choice. Please try again");

            }


        }




    }
}