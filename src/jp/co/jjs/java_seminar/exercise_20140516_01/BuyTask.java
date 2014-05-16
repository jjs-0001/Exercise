package jp.co.jjs.java_seminar.exercise_20140516_01;

public class BuyTask extends Task{

    private int price;

    public BuyTask(String task, int price) {
        super(task);
        this.price = price;
    }

    public int price(){
        return this.price;
    }

    @Override
    public void showtask() {
        System.out.printf("%s(%d円)%s\n",this.task(), this.price, this.isFinish() ? "" : "(DONE)");
    }

    @Override
    public String toString() {
        return String.format("%s(%d円)%s",this.task(), this.price, this.isFinish() ? "" : "(DONE)");
    }





}
