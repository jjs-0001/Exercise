package jp.co.jjs.java_seminar.self_study.q3_4;

public class Q3_4_3 {

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int length = num;

        for(int i = 2; i < length; i++){
            if(num % i == 0){
                System.out.println(i);
                num /= i;
            }
        }
    }
}
