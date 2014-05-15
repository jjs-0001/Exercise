package jp.co.jjs.java_seminar.exercise_20140515_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task {

    static String task[];

    static{
        task = new String[100];
        for(int i = 0; i < 100; i++){
            task[i] = "";
        }
    }

    static void taskIn(String task) {
        for(int i = 0; i < 100; i++){
            if(Task.task[i] == ""){
                Task.task[i] = task;
                break;
            }
        }
    }

    static void finish() throws IOException{
        while(true){

            System.out.println("完了する番号はどれですか？");

            BufferedReader finish =
                    new BufferedReader (new InputStreamReader (System.in));
            String end = finish.readLine();

            Task.task[Integer.valueOf(end) - 1] += "(DONE)";

            System.out.println("1を入力する完了要件を続けます、それ以外は要件入力に戻ります");
            BufferedReader ques =
                    new BufferedReader (new InputStreamReader (System.in));
            String hit = ques.readLine();

            if(!(hit.equals("1"))){
                break;
            }
        }
    }
}
