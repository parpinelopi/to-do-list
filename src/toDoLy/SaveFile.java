package toDoLy;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This is the class which contains the methods for writing the task to a file
 * and reading the file output again into a list.
 */
public class SaveFile {

    String CSV_TASKS_OUTPUT = "CSV_OUTPUT.CSV";
    public File csvOutputFile = new File(CSV_TASKS_OUTPUT);

    /**
     * Transforms the ArrayList into a string with the chosen delimiter ",".
     *
     * @param tasksToFile is the string created with the fields of the ArrayList
     * @return the string of the tasks of the ArrayList without special characters
     */

    public String convertToCSV(String tasksToFile) {

        return Stream.of(tasksToFile).collect(Collectors.joining(","));
    }

    /**
     * This method prints into the CSV file that was created the content of the list as
     * pre-formatted by the previous method.
     *
     * @throws IOException
     */

    //The output
    public void arrayToOutput(ArrayList<Task> list) throws IOException {

        try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
            list.stream().map((Task tasksToFile) -> convertToCSV(tasksToFile.toString())).forEach(pw::println);
        }
        //
    }

    /**
     * This method reads the lines of input from the created CSV file and
     * @return fileContent ArrayList of tasks
     */
    public List<Task> readFile() throws IOException, ParseException {

        List<Task> fileContent = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("CSV_OUTPUT.CSV"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] taskLine = line.split(";");
                fileContent.add(new Task(taskLine[0], taskLine[1], DateFormat.getDateTimeInstance().parse(taskLine[2])));
            }
        }
        return fileContent;
    }
}
