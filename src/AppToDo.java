
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class AppToDo {

    //public static void main(String[] args) {

    //    Interface screen = new Interface();

    //   ArrayList<Task> tasks = new ArrayList<Task>();
    //    screen.startScreen (tasks);

    /**
     * This method includes user input and validates the date parameter
     * @param tasks
     */

    public ArrayList taskAdd(ArrayList<Task> tasks) {
        Scanner userInput = new Scanner(System.in);


        System.out.println("enter project: ");
        String project = userInput.nextLine();
        Scanner titleInput = new Scanner(System.in);
        System.out.println("enter title: ");
        String title = titleInput.nextLine();
        System.out.println(title);
        System.out.println("enter due date (dd/mm/yyyy) : ");
        String userDueDateInput;
        Date validDate = null;
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);

        while (true) {
            Scanner dateInput = new Scanner(System.in);
            userDueDateInput = dateInput.nextLine();


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
            return tasks;

//start application from here
    }

}