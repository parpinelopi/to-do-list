package test;
import org.junit.Test;
import toDoLy.SaveFile;
import toDoLy.Task;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class SaveFileTest {

    ArrayList<Task> list = new ArrayList();

    @Test
    public void csvFileCreation () throws IOException {
        SaveFile saveFile = new SaveFile();
        saveFile.arrayToOutput(list);
        assertTrue(saveFile.csvOutputFile.exists());
    }
}
