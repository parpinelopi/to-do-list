import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class TaskManager {

    ArrayList<Task> tasks = new ArrayList<Task>();

    Task task = new Task();
    Interface start = new Interface();


    public static void sortDisplay(ArrayList<Task> list, String sortBy) {

        if (sortBy.equals("1")) {

            Collections.sort(list, new Comparator<Task>() {

                @Override
                public int compare(Task o1, Task o2) {

                    return o1.getDueDate().compareTo(o2.getDueDate());
                }
            });
        }
        if (sortBy.equals("2")) {

            Collections.sort(list, new Comparator<Task>() {

                @Override
                public int compare(Task o1, Task o2) {
                    return o1.getProject().compareTo(o2.getProject());
                }
            });
        }

        for (Task task : list) {
            System.out.println("Project :" + task.getProject() + "Title :" + task.getTitle() + "Due date :" + task.getDueDate());
        }

    }

    public void editOption(ArrayList<Task> list) {
        System.out.println("Insert title of task to edit");
        Scanner edit = new Scanner(System.in);
        String taskTitle = edit.nextLine();
        Task currentTask=new Task();
        int i = 0;
        for (Task task : list) {
            if (task.getTitle().equals(taskTitle)) {
                currentTask=task;
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
                start.startScreen(list);
            case "1":
                System.out.println("Rename the project");
                String f=edit.nextLine();
                currentTask.changeProject(f);
                break;
            case "2":
                System.out.println("Change due date");
                //Date=edit.nextLine();
               // currentTask.changeDueDate(Date);
                break;
            case "3":
                System.out.println("Change the title");
                String newTitle=edit.nextLine();
                currentTask.changeTitle(newTitle);
                break;
            case "4":
                currentTask.taskDone();
                break;
            default:
                System.out.println("If you pressed wrong input, return with 0");
        }
    }

    public void taskAdd(Task t) {
        tasks.add(t);

//start application from here
    }

    public void displayTasks() {
        for (Task t :
             tasks) {
            System.out.println(t.getTitle());
        }
    }
}


