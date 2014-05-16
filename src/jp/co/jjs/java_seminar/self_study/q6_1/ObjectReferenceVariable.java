package jp.co.jjs.java_seminar.self_study.q6_1;

public class ObjectReferenceVariable {

    public static void main(String[] args) {
        Parent p;
        p = new Parent();
        p = new Child();
        Child c;
        c = new Child();
        //c = new Parent();      Q6_1 ParentからChildの変換ができないため

    }
}
