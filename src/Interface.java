import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Interface {

    public void startScreen(ArrayList<Task> list) {

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

            System.out.println(" Welcome to toDoLY");
            System.out.println("You have " + /*taskTodo+*/ " and " + /*taskDone*/ "+  tasks are done"); ///variables are instantiated in TaskManager countTasks method
            System.out.println(" Menu ");
            System.out.println("1. Show task list");
            System.out.println("2. Add new task ");
            System.out.println("3. Edit task");
            System.out.println("4. Clear task list"); //create method for clearing the task list
            System.out.println("5. Save and quit");
            System.out.println("Enter your choice from the menu");

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
                    //("Save and quit");
                    //quit
                    menu.close();
                    break;
                default:
                    System.out.println("You have entered invalid choice. Please try again");

            }
                //Should this be here or in the TaskManager Class?
            /*public void editOption(ArrayList<Task> list) {
                System.out.println("Insert title of task to edit");
                Scanner edit = new Scanner(System.in);
                String taskTitle = edit.nextLine();
                int i = 0;
                for (Task task : list) {
                    if (task.getTitle().equals(taskTitle)) {
                        break;
                    }
                    i++;
                }
                System.out.println("Choose option to edit task");
                System.out.println("1.Change Project name");
                System.out.println("2.Change the due date");
                System.out.println("3.Change the title");
                System.out.println("4.Mark task as done");
                System.out.println("0. Return to previous");
                String taskOption = edit.nextLine();

                switch (taskOption) { //enter attributes for the methods
                    case "0":
                        start.startScreen(ArrayList<Task> list);
                    case "1":
                        task.changeProject();
                        break;
                    case "2":
                        task.changeDueDate();
                        break;
                    case "3":
                        task.changeTitle();
                        break;
                    case "4":
                        task.taskDone();
                        break;
                    default:
                        System.out.println("If you pressed wrong input, return with 0");
                }
            }*/
        }




    }
}