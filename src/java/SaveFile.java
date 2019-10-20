package java;

import java.io.*;
import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SaveFile {

        ArrayList<Task> list = new ArrayList<>();
        String CSV_TASKS_OUTPUT = "/Users/pinelopiparaskevopoulou/Desktop/Checklist/CSV_OUTPUT.CSV";
        public File csvOutputFile = new File(CSV_TASKS_OUTPUT);

        public void saveToFile(){

            try {
                FileOutputStream toFile = new FileOutputStream("/Users/pinelopiparaskevopoulou/Desktop/Checklist/FILE_OUTPUT.CSV");

                ObjectOutputStream fileOutput = new ObjectOutputStream(toFile);
                fileOutput.writeObject(list);
                toFile.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }


    //public static void createOutput() {
    //String tasksToFile = String.join(",", project, title, dueDate, status);
    //I need to get the original array list
    // }

      public  String convertToCSV (String tasksToFile)
        { //I need to get the original array list ArrayList<java.Task> list as a parameter to be written to a file.
            return Stream.of(tasksToFile)
                    .map(this::escapeSpecialCharacters)
                    .collect(Collectors.joining(","));
        }

        /**
         * This method converts the array list of tasks to a CSV file
         *
         * @throws IOException
         */

     //The output
        public  void arrayToOutput (ArrayList<Task> list) throws IOException {

            try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
                list.stream()
                        .map((Task tasksToFile) -> convertToCSV(tasksToFile.toString()))
                        .forEach(pw::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
            //
        }

        //escape special characters method in order to not create more columns for input
        public String escapeSpecialCharacters (String data){
            String escapedData = data.replaceAll("\\R", " ");
            if (data.contains(",") || data.contains("\"") || data.contains("'")) {
                data = data.replace("\"", "\"\"");
                escapedData = "\"" + data + "\"";
            }
            System.out.println(data);
            return escapedData;
        }

    }







    /*public static String readTextFile(String fileName) throws IOException {
        String content= new String(Files.readAllBytes(Paths.get(fileName)));
        return content;
    }

    public static ArrayList<java.Task> readTextFileByLines(String fileName) throws
            IOException {
        ArrayList<java.Task> lines=Files.readAllLines((Paths.get(fileName)));
        return lines;
    }
    public static void writeToTextFile(String fileName, String content) throws
            IOException{
        Files.write(Paths.get(fileName), content.getBytes(), StandardOpenOption.CREATE);
    }
    public void saveToFile(){

        //read by line probably as the project is printed by line
        //List<java.Task> list = Files.readAllLines(Paths.get(fileName));

        //method
       // Files.lines(new File("input.txt").toPath())


    }
}*/
