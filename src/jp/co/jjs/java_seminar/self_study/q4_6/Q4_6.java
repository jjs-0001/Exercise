package jp.co.jjs.java_seminar.self_study.q4_6;

public class Q4_6 {

    public static void main(String[] args) {
        char ch = args[0].charAt(0);
        boolean q = Character.isLowerCase(ch);
        if(q == true){
            System.out.println("先頭の文字が大文字ではありません。"); //Q4_6_1
        }else{
            System.out.println(args[0]);
        }

        for(int i = 0; i < 10; i++){
            System.out.println(i);
            if(i == 5){
                break;
            }
        }

        while(true){
            System.out.println(args[0]);    //Q4_6_2
            break;
        }

    }
}
