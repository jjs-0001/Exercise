package jp.co.jjs.java_seminar.exercise_20140516_01;

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

    public void showtask(){
        System.out.printf("%s%s\n",this.task, this.finish ? "" : "(DONE)");
    }

    @Override
    public String toString() {
        return String.format("%s%s",this.task, this.finish ? "" : "(DONE)");
    }


}
