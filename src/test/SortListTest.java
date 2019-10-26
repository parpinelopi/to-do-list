package test;
import org.junit.Test;
import toDoLy.Task;
import toDoLy.TaskManager;
import java.util.ArrayList;
import java.util.Date;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortListTest {

    /**
     * sortTask tests the sorting method by date and by project
     * adding test tasks and recreating the sorting method
     */

    @Test
    public void sortTask() {
  ArrayList<Task> list = new ArrayList<>();
  Date d = new Date();
        Task task1 = new Task("snowboarding", "mountains", d);
        Task task2 = new Task("skiing", "slope", d);
        Task task3 = new Task( "skating", "ice", d);
        list.add(task1);
        list.add(task2);
        list.add(task3);
        TaskManager.sortDisplay(list, "1");
        assertEquals("snowboarding",list.get(0).getProject());
        TaskManager.sortDisplay(list, "2");
        assertEquals( "skating", list.get(0).getProject());



    }
}
