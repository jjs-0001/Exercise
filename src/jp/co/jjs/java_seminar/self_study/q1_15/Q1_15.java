package jp.co.jjs.java_seminar.self_study.q1_15;

public class Q1_15 {

    public static void main(String[] args) {
        // Q1_15_1 double型とfloat型の要素両方を含む宣言はできない

        double[] d = {3.4, 4.5, 2.3, 1.7};
        double v = 0;
        byte[]  by = {2, 3, 4 ,5};

        for(int i = 0; i < by.length; i++){
            System.out.println(by[i]); // Q1_15_2
        }

        for(int i = 0; i < d.length; i++){
            v += d[i];
        }
        v /= d.length;
        System.out.println(v); // Q1_15_3
    }
}
