package toDoLy;
import java.io.IOException;
import java.util.ArrayList;

/**
 * main method of the application which starts the screen and loads the interface content
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Interface screen = new Interface();

        ArrayList<Task> tasks = new ArrayList<Task>();
        screen.startScreen (tasks);

    }

}
