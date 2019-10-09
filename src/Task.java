//package collection;//

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.String;
import java.util.Scanner;



public class Task
{

    public String project;
    public String title;
    public String date;
    public boolean status;


    public static void main(String[] args)
    {


        Scanner inputTask = new Scanner(System.in);

        Scanner task = new Scanner(System.in);
        System.out.println("enter title : ");

        String title = task.nextLine();

        System.out.println("enter due date (dd/mm/yyyy) : ");
        String userDueDateInput = task.nextLine();


        while(true)
        {
            Date validDate=null;
            try {
                DateFormat format = new SimpleDateFormat("dd/mm/yyyy");
                format.setLenient(false);
                validDate = format.parse(userDueDateInput);
                System.out.println(userDueDateInput + " date is valid");

            } catch (ParseException e) {
                System.out.println(userDueDateInput + " date is invalid");


                System.out.println("please enter the date again");

                // ask the user to rewrite
                // do a loop until the date is correct

            }

            System.out.println("  Task  " + '\n' + "title : " + title + '\n' + "due date : " + validDate);
            break;
        }

    } // end of the main method

} // end of the class




    /*public static void addTask() {
        ArrayList<Task>.add(System.in);
    }

    public static boolean check() {
        if (task == true) {
            System.out.println("The task "+ task + " is done" );
         else { System.out.println("The task " + task + "needs to be done");
        }
    } */