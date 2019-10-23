package toDoLy;

import java.io.IOException;
import java.util.*;

/**
 * The class TaskManager contains most of the methods that are connected to the editing
 * option of the main menu, such as sort and display tasks according to due date or project,
 * change project name, title, due date, as well as the status. Additionally the delete task
 * method.
 */

public class TaskManager {

    //private
    private ArrayList<Task> tasks = new ArrayList<Task>();
    private ArrayList<Task> list = new ArrayList<>();

    private Task task = new Task();
    private Interface start = new Interface();


    /**
     * The method is sorting the task according to date or project with numerical options
     * using the Comparator class.
     * class.
     */

    public TaskManager() { //wrote it with capital letter

    }

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
            System.out.println("Project :" + task.getProject() + "  Title :" + task.getTitle() + "  Due date:" + task.getDueDate() + "  Status :" + (task.getStatus() ? "Done" : "Not done"));
        }

    }

    /**
     * The method editOption includes all of the editing options for the task by giving
     * the task title. All of the fields can be edited, project, title, due date, status
     * as well as removes the task completely. Switch statements are also used for this
     * purpose
     *
     * @param list
     * @throws IOException
     */

    public void editOption(ArrayList<Task> list) throws IOException {
        System.out.println("Insert title of task to edit");
        Scanner edit = new Scanner(System.in);
        String taskTitle = edit.nextLine();
        Task currentTask = new Task();
        int i = 0;
        for (Task task : list) {
            if (task.getTitle().equals(taskTitle)) {
                currentTask = task;
                break;
            }
            i++;
        }

        System.out.println("Choose option to edit task");
        System.out.println("1.Change Project name");
        System.out.println("2.Change the due date");
        System.out.println("3.Change the title");
        System.out.println("4.Mark task as done");
        System.out.println("5.Remove task");
        System.out.println("0. Return to previous");
        String taskOption = edit.nextLine();

        switch (taskOption) { //enter attributes for the methods
            case "0":
                start.startScreen(list);
            case "1":
                System.out.println("Rename the project");
                String f = edit.nextLine();
                currentTask.changeProject(f);
                break;
            case "2":
                System.out.println("Change due date");
                currentTask.changeDueDate(start.insertDate());
                break;
            case "3":
                System.out.println("Change the title");
                String newTitle = edit.nextLine();
                currentTask.changeTitle(newTitle);
                break;
            case "4":
                currentTask.taskDone();
                break;
            case "5":
                System.out.println("Enter title of the task to be removed");
                String taskToRemove = edit.nextLine();
                removeTask(taskToRemove, list);
            default:
                System.out.println("If you pressed wrong input, return with 0");
        }
    }

    /**
     * The method taskAdd adds a new task to the array list
     *
     * @param t task added
     */
    public void taskAdd(Task t) {
        tasks.add(t);
    }

    /**
     * The method displayTasks displays the tasks from the option
     */
    public void displayTasks() {
        for (Task t :
                tasks) {
            System.out.println(t.getTitle());
        }
    }

    /**
     * The method removeTask stores the chosen to remove task in a string and uses the
     * Iterator interface to iterate through the ArrayList and uses .equals to find
     * the title that was given to be removed and removes it.
     *
     * @param remTask stores the chosen according to title task to be removed
     * @param list    array list that stores the
     */
    public void removeTask(String remTask, ArrayList<Task> list) {
        String taskToRemove = remTask;
        Iterator<Task> iterator = list.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.getTitle().equals(taskToRemove)) {
                iterator.remove();
            }
        }
    }


    /**
     * The method getList fetches the created ArrayList
     *
     * @return returns the tasks of the list.
     */
    public ArrayList<Task> getList() {
        return tasks;
    }


    /**
     * The method countStatus counts the done and undone statuses of the objects of the ArrayList
     */


    public void countStatus() {
        int done;
        int undone;

        done = (int) list.stream().filter(Task::getStatus).count();
        undone = list.size() - done;
        System.out.println("You have " + undone + " undone and " + done + " done tasks");
    }

}