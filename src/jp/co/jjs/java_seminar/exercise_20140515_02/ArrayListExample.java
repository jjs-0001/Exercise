package jp.co.jjs.java_seminar.exercise_20140515_02;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        list.remove(0);
        list.add(0, "ddd");
        System.out.println(list.size());
        System.out.println(list);
    }
}
