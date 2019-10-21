package toDoLy;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class AppToDo {

    /**
     * This method includes user input upon creation of the task, entering project,
     * title, due date and task status.
     * @param tasks is the task that is created containing the fields mentioned above
     * entered by the user.
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

        Date dueDate = insertDate();

        Task task = new Task(project, title, dueDate);

        tasks.add(task);
        System.out.println(tasks.size());
            return tasks;
    }

    /**
     * This method handles the due date input from the user and iterates until the valid date
     * type is given. Printing also messages to notify of invalid or valid input.
     * @return the valid due date after validating user's due date input from the user and when repeating it.
     */
    public Date insertDate() {
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
                break;

            } catch (ParseException e) {
                System.out.println(userDueDateInput + " date is invalid, please enter the date again");

            }
        }

        Date dueDate = validDate;
        return dueDate;
    }
}