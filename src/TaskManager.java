import java.util.*;

public class TaskManager {

    Task task = new Task();
    Interface startscreen;


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
                startscreen.startScreen();
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


        }
    }


}


