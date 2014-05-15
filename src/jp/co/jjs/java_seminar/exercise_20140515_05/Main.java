package jp.co.jjs.java_seminar.exercise_20140515_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        int count = 1;
        while(true){
            System.out.println("要件を入力してください");
            BufferedReader input =
                    new BufferedReader (new InputStreamReader (System.in));
            String str = input.readLine();

            Task.taskIn(str);

            for(int i = 0; i < count; i++){
                System.out.println(i + 1 + ". "+ Task.task[i]);
            }
            count++;

            System.out.println("1を入力すると終了します、2を入力すると完了要件を選択できます、それ以外は要件入力に移ります");
            BufferedReader ques =
                    new BufferedReader (new InputStreamReader (System.in));
            String hit = ques.readLine();

            if(hit.equals("2")){
                Task.finish();
            }

            if(hit.equals("1")){
                break;
            }
        }
    }
}
