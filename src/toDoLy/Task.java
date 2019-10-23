package toDoLy;

import java.util.ArrayList;
import java.util.Date;
import java.lang.String;


/**
 * Class Task contains the field constructor of the task parameters
 * as well as the constructor of the Task.
 * @author
 * @version
 */

public class Task {
    //use list in taskManager instead
    ArrayList<Task> list = new ArrayList();
    private String Project; //should I make them non capital?
    private String Title;
    private Date DueDate;
    private boolean Status;


    public Task(String project, String title, Date dueDate) {
        Project = project;
        Title = title;
        DueDate = dueDate;
        Status = false;
    }

    public Task() {

    }

    //setter
    public void setProject(String project) {
        this.Project = project;
    }


    /**
     * The method getProject fetches the project name
     *
     * @return the project name
     */
    //getter
    public String getProject() {
        return Project;
    }

    /**
     * The method setTitle sets the title of the project from the user input into the ArrayList
     *
     * @param title holds the title of the task
     */
    public void setTitle(String title) {
        this.Title = title;
    }

    /**
     * The method getProject fetches the task title.
     *
     * @return the title of the task
     */
    public String getTitle() {
        return Title;
    }

    /**
     * The method getDueDate fetches the due date of the task.
     *
     * @return the due date of the task
     */
    public Date getDueDate() {
        return DueDate;
    }

    /**
     * The method getStatus fetches the status of the task.
     *
     * @return the status of the task
     */
    public boolean getStatus() {
        return Status;
    }

    /**
     * The method taskDone changes the task status from the default
     * false to true.
     */
    public void taskDone() {
        Status = true;
    }

    /**
     * The method changeTitle
     *
     * @param newTitle
     */
    public void changeTitle(String newTitle) {
        Title = newTitle;
    }

    /**
     * The method changeDueDate changes the due date of the
     * task.
     *
     * @param newDueDate holds the changed due date of the
     *                   task.
     */
    public void changeDueDate(Date newDueDate) {
        DueDate = newDueDate;
    }

    /**
     * The method changeProject changes the project name
     * of the task.
     *
     * @param project returns the new name of the
     *                project.
     */
    public void changeProject(String project) {
        Project = project;
    }


    /**
     *
     * @return the string with the fields and the input
     */
//method for the writing to file
    @Override
    public String toString() {
        return (Project + " " + Title + " " + DueDate + " " + Status);
    }



}





