//package collection;//

import java.util.HashMap;
import java.lang.String;
import java.util.Scanner;


public class taskTitleDate {
    public static void main(String[] args) {

       // HashMap<String, String> tasks = new HashMap<String, String>();
        Scanner task = new Scanner(System.in);
        System.out.println("enter title: ");

        String title = task.nextLine();
        //System.out.println("title : " + title);

        Scanner date = new Scanner(System.in);
        System.out.println("enter due date (dd/mm/yy): ");

        String dueDate = task.nextLine();
        //System.out.println("date : " + dueDate );

        System.out.println(" Task: " + '\n' + "title : " + title + '\n' + "due date : " + dueDate);
    }
}
