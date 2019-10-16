
import java.util.*;
import java.util.Date;
import java.lang.String;
import java.util.Scanner;



public class Task {




    private String Project;
    private String Title;
    private Date DueDate;
    private boolean Status;

    //add main method

    public Task(String project, String title, Date dueDate) {
        Project = project; //if else statement to check if project exists
        Title = title;
        DueDate = dueDate;
        Status = false;
    }
    public Task() {

    }
    //setter
    public void setProject(String project){
        this.Project = project;
    }

    //getter
    public String getProject(){
        return Project;}

    /**
     *
     * @param title
     */
    public void setTitle(String title){
        this.Title = title;
    }

    public String  getTitle (){
        return Title;
    }

    public Date getDueDate (){
        return DueDate;
    }

    public boolean getStatus (){
        return Status;
    }


    /**
     *
     */
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







