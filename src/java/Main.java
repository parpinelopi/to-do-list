package java;

import java.Interface;
import java.io.IOException;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException {
        Interface screen = new Interface();

        ArrayList<Task> tasks = new ArrayList<Task>();
        screen.startScreen (tasks);

    }

}
