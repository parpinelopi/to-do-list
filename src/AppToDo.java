
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class AppToDo {

    //public static void main(String[] args) {

    //    Interface screen = new Interface();

    //   ArrayList<Task> tasks = new ArrayList<Task>();
    //    screen.startScreen (tasks);

    public void taskAdd(ArrayList<Task> tasks) {
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