import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Interface screen = new Interface();

        ArrayList<Task> tasks = new ArrayList<Task>();
        screen.startScreen (tasks);

    }
    /*public static void main(String[]args) throws IOException{
        String input = SaveFile.readTextFile("file.txt");
        System.out.println(input);
        SaveFile.writeToTextFile("copy.txt", input);

        System.out.println(SaveFile.readTextFile("copy.txt"));

        SaveFile.readTextFileByLines("files.txt");
        Path path = Paths.get("file");*/

}
