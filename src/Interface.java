import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;



public class Interface {

    public void startScreen(ArrayList<Task> list) throws IOException {
        SaveFile saveRead = new SaveFile();
        TaskManager taskManager = new TaskManager();
        AppToDo appToDo = new AppToDo();
        Task task = new Task();
        Interface start= new Interface();
        //TaskManager option = new TaskManager();
        list.add(
                new Task ("taskremove", "remove", new Date() )
        );

        String menuInput;

        Scanner menu = new Scanner(System.in);

        while (true) {

            System.out.println("Welcome to toDoLY");

            System.out.println("You have " + /*taskTodo+*/ " and " + /*taskDone*/ "+  tasks are done"); ///variables are instantiated in TaskManager countTasks method
            System.out.println("\n");
            System.out.println("Enter your choice from the menu");
            System.out.println("\n");
            System.out.println(" Menu ");
            System.out.println("1. Show task list");
            System.out.println("2. Add new task ");
            System.out.println("3. Edit task");
            System.out.println("4. Clear task list"); //create method for clearing the task list
            System.out.println("5. Save to file");
            System.out.println("6. Quit application");


            menuInput = menu.nextLine();

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
                    saveRead.write();
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