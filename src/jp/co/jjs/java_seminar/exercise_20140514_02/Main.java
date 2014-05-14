package jp.co.jjs.java_seminar.exercise_20140514_02;

public class Main {

    public static void main(String[] args) {
        Student man = new Student("山田太郎", 11011);

        System.out.println(man.name);
        System.out.println(man.id);
        System.out.println(man.age);
        System.out.println(man.from);


        System.out.println(man.answer);
        man.answerplus();
        man.answerplus();
        man.answerplus();
        System.out.println(man.answer);
    }
}
