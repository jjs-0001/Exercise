package jp.co.jjs.java_seminar.exercise_20140515_01;

public class RapparExample {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        int i = 123;
        System.out.println(Integer.toString(i));

        char ch = 'a';

        System.out.println(Character.isDigit(ch));

        String str = "123";
        Integer j = Integer.valueOf(str);
        int num = j.intValue();

        System.out.println(num);
    }
}
