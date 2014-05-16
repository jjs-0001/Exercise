package jp.co.jjs.java_seminar.exercise_20140515_05_2;

public class Task {

    private String task;
    private boolean finish = true;

    public Task(String task) {
        this.task = task;
    }

    void finish(){
        this.finish = false;
    }

    public String task(){
        return this.task;
    }

    public boolean isFinish(){
        return this.finish;
    }
}
