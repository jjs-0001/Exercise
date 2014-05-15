package jp.co.jjs.java_seminar.self_study.q2_3;

public class Q2_3 {

    public static void main(String[] args) {
        String str = "ASDFGHJKLKJHGFDSA";

        int n = str.length();

        if(n < 10){
            n = 10;
        }

        for(int i = n - 10; i < str.length(); i++){ //Q2_3_1
            System.out.println(str.charAt(i));
        }

        String math = "5,4,3,2,7";

        int m = math.length();

        System.out.println(math.charAt(m - 1));
    }
}
