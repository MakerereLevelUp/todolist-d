package controllers;

import play.*;
import play.api.mvc.Rendering;
import play.data.Form;
import play.mvc.*;
import models.*;

public class Application extends Controller {


    public static Result index() {
        return ok("hello world.");
    }
    public static Result tasks() {
        return ok(views.html.index.render(TaskManager.listOfTasks()));
    }

    public static Result newTask() {
        return TODO;
    }

    public static Result deleteTask(Long id) {
        return TODO;
    }
}