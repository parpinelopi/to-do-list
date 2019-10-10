//package collection;//

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.lang.String;
import java.util.Scanner;



public class Task {

    public static void main(String[] args) {

    }
    private String Project;
    private static String Title;
    private Date DueDate;
    private boolean Status;

    //add main method

    public Task(String project, String title, Date dueDate) {
        Project = project; //if else statement to check if project exists
        Title = title;
        DueDate = dueDate;
        Status = false;
    }

    //setter
    public void setProject(String project){
        this.Project = project;
    }

    //getter
    public String getProject(){
        return Project;}

    public void setTitle(String title){
        this.Title = title;
    }

    public String  getTitle (){
        return Title;
    }

    public Date getDueDate (){
        return DueDate;
    }

    public boolean status (){
        return Status;
    }


    //edit methods
    public void taskDone (){
        Status=true;
    }
    public void changeTitle(String newTitle){
        Title=newTitle;
    }

    public void changeDueDate(Date newDueDate){
        DueDate=newDueDate;
    }

    public void changeProject(String project){
        Project=project;
    }


}







