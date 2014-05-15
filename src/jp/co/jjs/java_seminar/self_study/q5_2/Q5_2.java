package jp.co.jjs.java_seminar.self_study.q5_2;

public class Q5_2 {

    public static void main(String[] args) {
        Person man = new Person();

        man.name = "山田太一";
        man.age = 29;
        man.income = 500.5f;
        System.out.println(man.name);
        System.out.println(man.age);
        System.out.println(man.income);

        Sphere en = new Sphere();
        en.line = 5.5;
        en.x = 2;
        en.y = 5;
        System.out.println(en.line);
        System.out.println("中心座標(" + en.x + "," + en.y + ")");
    }
}
