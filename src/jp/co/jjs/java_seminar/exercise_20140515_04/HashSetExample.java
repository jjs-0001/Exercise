package jp.co.jjs.java_seminar.exercise_20140515_04;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        System.out.println(set);

        set.add("bbb");
        System.out.println(set);
        set.remove("bbb");

        System.out.println(set);
    }
}
