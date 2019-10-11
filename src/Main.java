import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Interface screen = new Interface();

        ArrayList<Task> tasks = new ArrayList<Task>();
        screen.startScreen (tasks);

    }
}
