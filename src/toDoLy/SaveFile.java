package toDoLy;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This is the class which contains the methods for writing the task to a file
 * and reading the file output again into a list.
 */
public class SaveFile {


    TaskManager taskManager = new TaskManager();
    ArrayList<Task> list = new ArrayList<>();
    String CSV_TASKS_OUTPUT = "/Users/pinelopiparaskevopoulou/Desktop/Checklist/CSV_OUTPUT.CSV";
    public File csvOutputFile = new File(CSV_TASKS_OUTPUT);

    /**
     * saveToFile creates the file in which the ArrayList content is going to be written
     * and also catches exception if file is not
     */
    public void saveToFile() {

        try {
            FileOutputStream toFile = new FileOutputStream("/Users/pinelopiparaskevopoulou/Desktop/Checklist/FILE_OUTPUT.CSV");//perhaps an error here?
            ObjectOutputStream fileOutput = new ObjectOutputStream(toFile);
            fileOutput.writeObject(list);
            toFile.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Transforms the ArrayList into a string with the chosen delimiter ",".
     *
     * @param tasksToFile is the string created with the fields of the ArrayList
     * @return the string of the tasks of the ArrayList without special characters
     */

    public String convertToCSV(String tasksToFile) { //I need to get the original array list ArrayList<java.Task> list as a parameter to be written to a file.
        return Stream.of(tasksToFile).map(this::escapeSpecialCharacters).collect(Collectors.joining(","));
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
        } catch (IOException e) {
            e.printStackTrace();
        }
        //
    }

    /**
     * This method is used to avoid writing characters like , \ ' as input
     * and creating additional input fields for them.
     * @param data
     * @return returns the data after replacing them with space.
     */
//escape special characters method in order to not create more columns for input
    public String escapeSpecialCharacters(String data) {
        String escapedData = data.replaceAll("\\R", " ");
        if (data.contains(",") || data.contains("\"") || data.contains("'")) {
            data = data.replace("\"", "\"\"");
            escapedData = "\"" + data + "\"";
        }
        System.out.println(data);
        return escapedData;
    }
    // in the file the status is false and not done undone

    /**
     * This method reads the lines of input from the created CSV file and
     */

    //reading CSV file
    //return list of read tasks and add to current task list in taskManager
    public void readFile() throws IOException {

        List<List<String>> fileContent = new ArrayList<List<String>>();

        try (
                BufferedReader br = new BufferedReader(new FileReader("CSV_OUTPUT.CSV"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] taskLine = line.split(",");
                fileContent.add(Arrays.asList(taskLine));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

///might work
        BufferedReader  br = null;
        try {
            br = new BufferedReader(new FileReader("CSV_OUTPUT.CSV"));
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
                //list.add(User.parse(line));
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) { br.close(); }
        }

        //fileContent.stream().forEach(System.out::println);

    }
}
