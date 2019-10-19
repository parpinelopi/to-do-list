import java.io.*;

public class SaveFile {


        //Task task= new Task();
        //String TASKS_OUTPUT = "/Users/pinelopiparaskevopoulou/Desktop/Checklist/fileOut.txt";
        //ArrayList<Task> list = new ArrayList<>();
        //String tasksToFile = String.join(",", project, title, dueDate, status);

       /* public void read () {

            try {
                File input = new File("TASKS_OUTPUT");
                BufferedReader br = new BufferedReader(new FileReader(input));
                String str;
                while ((str = br.readLine()) != null) {
                    System.out.println(str);
                }
                br.close();
                //input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } */

        public void write () {
            try {
                BufferedWriter output = new BufferedWriter(new FileWriter("/Users/pinelopiparaskevopoulou/Desktop/Checklist/fileOut.txt"));
                String str = "Write this string to my file";
                //FileWriter fw = new FileWriter(output);
                output.write(str);
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

}








///MASSES MASSES MASSES OF READING METHODS PFFF

    /*public static void main(String[] args) {
        //ArrayList<Task> list = new ArrayList<>();
        //String TASKS_OUTPUT = "/Users/pinelopiparaskevopoulou/Desktop/Checklist/CSV_OUTPUT.CSV";
        ArrayList<Task> list = new ArrayList<>();

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
    }
}
    //public static void createOutput() {
    //String tasksToFile = String.join(",", project, title, dueDate, status);
    //I need to get the original array list
    // }

     /*   public  String convertToCSV (String tasksToFile)
        { //I need to get the original array list ArrayList<Task> list as a parameter to be written to a file.
            return Stream.of(tasksToFile)
                    .map(this::escapeSpecialCharacters)
                    .collect(Collectors.joining(","));
        }

        /**
         * This method converts the array list of tasks to a CSV file
         *
         * @throws IOException
         */
     /*
     //The output
        public  void arrayToOutput () throws IOException {
            File csvOutputFile = new File(CSV_TASKS_OUTPUT);
            try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
                list.stream()
                        .map((Task tasksToFile) -> convertToCSV(tasksToFile.toString()))
                        .forEach(pw::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
            //assertTrue(csvOutputFile.exists());
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
*/


//StringBuffer tasksToFile= new StringBuffer(task.getProject());
//tasksToFile.append();
//create

   /* private static final String filepath="/SDA-04-mbpro/Users/pinelopiparaskevopoulou/Desktop/Checklist/text.txt";
    public static void main(String args[]) {
        SaveFile file = new SaveFile();
        Task task = new Task ("Project", "Title", new Date());
        //Task.WriteObjectToFile(task);
        file.WriteToFile(task);



    }

    public void WriteToFile (Task t) { //This should be an array list
        //sorting first might be readable for humans and take lost file and increases the time to save to file. Best to sort while loading
        //sort files when reading

        try {

            FileOutputStream fileOut = new FileOutputStream(filepath); //add a txt file in the project folder?
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(t);
            objectOut.close();
            System.out.println("The list has been added to a file");

        } catch (Exception IO) {
            IO.printStackTrace();
        }

    }

    /*public static String readTextFile(String fileName) throws IOException {
        String content= new String(Files.readAllBytes(Paths.get(fileName)));
        return content;
    }

    public static ArrayList<Task> readTextFileByLines(String fileName) throws
            IOException {
        ArrayList<Task> lines=Files.readAllLines((Paths.get(fileName)));
        return lines;
    }
    public static void writeToTextFile(String fileName, String content) throws
            IOException{
        Files.write(Paths.get(fileName), content.getBytes(), StandardOpenOption.CREATE);
    }
    public void saveToFile(){

        //read by line probably as the project is printed by line
        //List<Task> list = Files.readAllLines(Paths.get(fileName));

        //method
       // Files.lines(new File("input.txt").toPath())


    }
}*/
