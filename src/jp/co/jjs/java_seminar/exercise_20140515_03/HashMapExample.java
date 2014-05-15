package jp.co.jjs.java_seminar.exercise_20140515_03;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("aa", 111);
        map.put("bb", 222);
        map.put("cc", 333);

        System.out.println(map.keySet());
        System.out.println(map.values());
        int m = map.get("aa");
        System.out.println(m);
        System.out.println(map.entrySet());
        System.out.println(map);
    }
}
