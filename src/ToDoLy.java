
package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ToDoLy {

    public static void main(String [] args){
        List<String> toDoLy = new ArrayList<>();

        toDoLy.add("Tara");
        toDoLy.add("Dane");

        toDoLy.forEach(System.out::println);
    }

}
