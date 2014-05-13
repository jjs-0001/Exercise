package jp.co.jjs.java_seminar.self_study.q3_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3_1_1 {

    public static void main(String[] args) throws IOException{
        BufferedReader input =
                new BufferedReader (new InputStreamReader (System.in));
        String s = input.readLine();
        int n = Integer.valueOf(s).intValue();

        if(n % 2 == 1){
            System.out.println(n +"は奇数です");
        }else{
            System.out.println(n +"は偶数です");
        }
    }
}
