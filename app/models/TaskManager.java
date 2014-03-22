package models;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    public static List<Task> listOfTasks() {

        List<Task> listOfTasks = new ArrayList<Task>();
        listOfTasks.add(new Task("Soccer"));
        listOfTasks.add(new Task("swimming"));
        listOfTasks.add(new Task("eating"));

        return listOfTasks;
    }
}
