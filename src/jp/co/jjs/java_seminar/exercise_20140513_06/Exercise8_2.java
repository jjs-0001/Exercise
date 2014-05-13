package jp.co.jjs.java_seminar.exercise_20140513_06;

public class Exercise8_2 {

    public static void main(String[] args) {
        String element = "木";
        if(element.equals("月")){
            System.out.println("今日は月曜日です。週の始まりです");
        }else if(element.equals("火")){
            System.out.println("今日は火曜日です。まだまだ仕事は続きます");
        }else if(element.equals("水")){
            System.out.println("今日は水曜日です。週の真ん中です気持ちを入れなおします");
        }else if(element.equals("木")){
            System.out.println("今日は木曜日です。一番つらいですが頑張ります");
        }else if(element.equals("金")){
            System.out.println("今日は金曜日です。明日から休みです頑張ります");
        }else if(element.equals("土")){
            System.out.println("今日は土曜日です。休みです仕事のことは忘れます");
        }else if(element.equals("日")){
            System.out.println("今日は日曜日です。明日のことは考えないです");
        }
    }
}
