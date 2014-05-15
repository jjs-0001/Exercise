package jp.co.jjs.java_seminar.exercise_20140515_05_2;

import java.util.ArrayList;

public class TaskList {

    ArrayList<Task> list = new ArrayList<>();

    void add(Task task){
        list.add(task);
    }

    void showAll(){
        for(Task task: list){
            System.out.printf("%s%s\n", task.task, task.finish ? "":"(DONE)");
        }
    }
}
