
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class AppToDo {

    public static void main(String[] args) {



        System.out.println(" Welcome to toDoLY");
        System.out.println("You can have X (method that will sort the tasks to do and) and Y tasks are done. ");

        System.out.println("Pick an option: ");
        System.out.println("Show task list (sort by date or project)");
        System.out.println("Add new task");
        System.out.println("Edit task");
        System.out.println("Save and quit");

//System.out.println( "enter project:");
        //setProject(userInput.nextLine());

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
        //parse
        //would it be best to set that undone by default and then change it.
        Task task = new Task(project, title, dueDate);




        System.out.println(tasks.size());

        //System.out.println("enter due date (dd/mm/yyyy) : ");
        //String userDueDateInput = task.nextLine();



                // switch(scanner.nextLine()) {
                //case "Show task list":



//start application from here
    }
}
