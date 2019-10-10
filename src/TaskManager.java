import java.util.*;

public class TaskManager  {


    public void sortDisplay(ArrayList<Task> list, String sortBy) {

        if (sortBy.equals("Date")) {

            Collections.sort(list, new Comparator<Task>() {

                @Override
                public int compare(Task o1, Task o2) {

                    return o1.getDueDate().compareTo(o2.getDueDate());
                }
            });
        }
        if (sortBy.equals("Project")){

                Collections.sort(list, new Comparator<Task>() {

                    @Override
                    public int compare(Task o1, Task o2) {
                return o1.getProject().compareTo(o2.getProject());
            }
                });
        }

        for (Task task:list){
            System.out.println("Project :" + task.getProject() + "Title :" + task.getTitle() + "Due date :" + task.getDueDate());
        }

    }




}