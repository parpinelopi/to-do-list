
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class AppToDo {

    public static void main(String[] args) {

    /*String menuInput;

    Scanner menu = new Scanner(System.in);

    while(true) {

        System.out.println(" Welcome to toDoLY");
        //("You can have X (method that will sort the tasks to do and) and Y tasks are done. " Should be displyed.

        System.out.println(" Menu ");
        System.out.println("1. Show task list (sort by date or project");
        System.out.println("2. Add new task ");
        System.out.println("3. Edit task ");
        System.out.println("4. Save and quit ");
        System.out.println("Enter your choice from the menu ");

        menuInput = menu.next();

        // switch cases written according to options in the menu, 1..2..3 etc.
        switch (menuInput) {
            case "1":
                System.out.println("show");
                break;
            case "2":
                System.out.println("add");

                break;
            case "3":
                System.out.println("edit");
                break;
            case "4":
                System.out.println("Save and quit");
                // call a save method
                menu.close();
                break;
            default:
                System.out.println("You have entered invalid choice. Please try again");

        }
    } */

        ArrayList<Task> tasks = new ArrayList<Task>();
        Scanner userInput = new Scanner(System.in);


        System.out.println("enter project: ");
        String project = userInput.nextLine();
        System.out.println("enter title: ");
        String title = userInput.nextLine();
        //System.out.println("enter due date: ");
        System.out.println("enter due date (dd/mm/yyyy) : ");
        String userDueDateInput;
        Date validDate = null;
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy");
        format.setLenient(false);

        while (true) {
            userDueDateInput = userInput.nextLine();


            try {
                validDate = format.parse(userDueDateInput);
                System.out.println(userDueDateInput + " date is valid");

                //System.out.println("  Task  " + '\n' + "title : " + title + '\n' + "due date : " + validDate);
                break;

            } catch (ParseException e) {
                System.out.println(userDueDateInput + " date is invalid, please enter the date again");

            }


        }

        Date dueDate = validDate;
        Task task = new Task(project, title, dueDate);
        tasks.add(task);

        System.out.println(tasks.size());



//start application from here
    }
}
