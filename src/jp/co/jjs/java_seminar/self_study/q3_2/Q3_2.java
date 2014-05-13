package jp.co.jjs.java_seminar.self_study.q3_2;

public class Q3_2 {

    public static void main(String[] args) {
        double x = Double.valueOf(args[0]).doubleValue();
        double y = Double.valueOf(args[1]).doubleValue();

        if(y == 0){
            System.out.println("0のため除算できません");
        }else{
            System.out.println(x / y);
        }
    }
}
