package jp.co.jjs.java_seminar.self_study.q6_2;

public class Main {

    public static void main(String[] args) {
        N Q6_2_1 = new N();

        Q6_2_1.f = 12.5f;
        Q6_2_1.str = "abcd";
        Q6_2_1.d = 55.5;

        System.out.println(Q6_2_1.f);
        System.out.println(Q6_2_1.str);
        System.out.println(Q6_2_1.d);

        S S1 = new S(1);
        T T1 = new T(2);

        S1.x = 1;
        T1.x = new StringBuffer("1234");

        System.out.println(S1.x);
        System.out.println(T1.x);

        H H1 = new H();
        H1.display();
    }
}
