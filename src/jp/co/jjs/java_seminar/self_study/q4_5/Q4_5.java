package jp.co.jjs.java_seminar.self_study.q4_5;

public class Q4_5 {

    public static void main(String[] args) {
        int arg = args[0].length();
        for(int i = 0; i < arg; i++){
            System.out.println(args[0]); //Q4_5_1
        }

        for(int i = 100; i <= 200; i++){
            if(!(i % 2 == 0)){
                for(int j = 3; j < i; j += 2){
                    if(i % j == 0){
                        break;
                    }
                    if(j == (i - 2)){
                        System.out.println(i); //Q4_5_2
                    }
                }
            }

        }
    }
}
