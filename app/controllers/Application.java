package controllers;

import play.*;
import play.mvc.*;
import models.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok("hello world.");
    }
    public static Result tasks() {
        return TODO;
    }

    public static Result newTask() {
        return TODO;
    }

    public static Result deleteTask(Long id) {
        return TODO;
    }
}