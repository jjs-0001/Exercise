package jp.co.jjs.java_seminar.exercise_20140516_01;

import java.util.ArrayList;

public class TaskList {

    private ArrayList<Task> list = new ArrayList<>();

    void add(Task task){
        list.add(task);
    }

    void showAll(){
        for(Task task: list){
            task.showtask();
            System.out.println(task);
        }
    }
}
