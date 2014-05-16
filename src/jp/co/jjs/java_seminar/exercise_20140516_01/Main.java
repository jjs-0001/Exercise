package jp.co.jjs.java_seminar.exercise_20140516_01;

public class Main {

    public static void main(String[] args) {

        TaskList list = new TaskList();

        Task t1 = new Task("1234");
        Task t2 = new Task("abcd");
        Task t3 = new Task("kiuj");
        BuyTask t4 = new BuyTask("牛乳", 190);

        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);

        t1.finish();
        t2.finish();
        t4.finish();

        list.showAll();
    }

}
