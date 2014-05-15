package jp.co.jjs.java_seminar.exercise_20140515_05_2;

public class Task {

    String task;
    boolean finish = true;

    public Task(String task) {
        this.task = task;
    }

    void finish(){
        this.finish = false;
    }
}
