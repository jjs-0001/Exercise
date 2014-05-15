package jp.co.jjs.java_seminar.self_study.q5_6;

public class Q5_6 {

    public static void main(String[] args) {
        Sphere en = new Sphere();

        System.out.println(en.x);
        System.out.println(en.y);
        System.out.println(en.z);

        en.move(3, 3, 3);

        System.out.println(en.x);
        System.out.println(en.y);
        System.out.println(en.z);
    }
}
