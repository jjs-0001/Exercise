package jp.co.jjs.java_seminar.exercise_20140515_05_2;


public class Main {

    public static void main(String[] args) {

        TaskList list = new TaskList();

        Task t1 = new Task("1234");
        Task t2 = new Task("abcd");
        Task t3 = new Task("kiuj");

        list.add(t1);
        list.add(t2);
        list.add(t3);

        t1.finish();
        t2.finish();

        list.showAll();
    }

}
