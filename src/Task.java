//package collection;//

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.lang.String;
import java.util.Scanner;



public class Task
{
    public String project;
    public String title;
    public String date;
    public boolean status;

    public static void main(String[] args) {

        Scanner inputTask = new Scanner(System.in);

        Scanner task = new Scanner(System.in);
        System.out.println("enter title : ");

        String title = task.nextLine();
        //System.out.println("title : " + title);

        //System.out.println(date);

       // Scanner date = new Scanner(System.in);
        System.out.println("enter due date (dd/mm/yyyy) : ");
        String userDueDate = task.nextLine();
        //int userDate = Integer.parseInt(userDueDate);
        //int length = userDueDate.length();

        try {
            DateFormat format = new SimpleDateFormat("dd/mm/yyyy");
            format.setLenient(false);
            format.parse(userDueDate);
            System.out.println(userDueDate + " date is valid");

        } catch (ParseException e) {
            System.out.println(userDueDate + " date is invalid");

            // ask the user to rewrite
            // do a loop until the date is correct

        }

        //String Date = task.nextLine();
        //System.out.println("date : " + dueDate );

        System.out.println("  Task  " + '\n' + "title : " + title + '\n' + "due date : " + userDueDate);
    }
}




    /*public static void addTask() {
        ArrayList<Task>.add(System.in);
    }

    public static boolean check() {
        if (task == true) {
            System.out.println("The task "+ task + " is done" );
         else { System.out.println("The task " + task + "needs to be done");
        }
    } */