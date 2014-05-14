package jp.co.jjs.java_seminar.self_study.q4_8;

public class Q4_8 {

    public static void main(String[] args) {
        /*
        int i = 1;
        int j = 2;
        switch(Integer.parseInt(args[0])){
        case i:
            System.out.println("1");       //Q4_8_1  caseは定数式でないとエラーがでる
            break;
        case j:
            System.out.println("2");
            break;
        default:
            System.out.println("Default");
        }
        */

        switch(Integer.parseInt(args[0])){
        case 1:
            System.out.println("1");
            break;
        case 2:
            System.out.println("2");       //Q4_8_2
            break;
        default:
            System.out.println("Default");
            break;
        }
    }

}

