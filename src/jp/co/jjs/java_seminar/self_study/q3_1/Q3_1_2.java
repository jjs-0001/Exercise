package jp.co.jjs.java_seminar.self_study.q3_1;

public class Q3_1_2 {

    public static void main(String[] args) {
        float n = Float.valueOf(args[0]).floatValue();
        if(args[1].equals("feet")){
            n /= 3.28;
            System.out.println(n);
        }else if(args[1].equals("meters")){
            n *= 3.28;
            System.out.println(n);
        }else{
            System.out.println("単位がわかりません");
        }
    }
}
