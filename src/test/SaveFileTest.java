package test;

import org.junit.Test;
import toDoLy.SaveFile;
import toDoLy.Task;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SaveFileTest {

    /**
     * The test validates if the output of lists of tasks from the application and if the csv file is indeed created
     * @throws IOException
     */
    @Test
    public void csvFileCreation() throws IOException {
        ArrayList<Task> list = new ArrayList();
        SaveFile saveFile = new SaveFile();
        saveFile.arrayToOutput(list);
        assertTrue(saveFile.csvOutputFile.exists());
    }

    /**
     * This test validates that the input is parsed in the write format, same as the output
     * @throws IOException
     * @throws ParseException
     */

    @Test
    public void readFromFile() throws IOException, ParseException {
        ArrayList<Task> list = new ArrayList<>();
        SaveFile saveFile = new SaveFile();
        Date d = new Date();
        Task task1 = new Task("snowboarding", "mountains", d); // date probably needs to be parsed in String 23/12/2019
        Task task2 = new Task("skiing", "slope", d); // 04/12/2020
        Task task3 = new Task("skating", "ice", d); //  28/11/2019
        list.add(task1);
        list.add(task2);
        list.add(task3);
        saveFile.arrayToOutput(list);
        List<Task> readfile = saveFile.readFile();
        assertEquals(list, readfile);
    }


}
