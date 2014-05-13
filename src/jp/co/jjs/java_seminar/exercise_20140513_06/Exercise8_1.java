package jp.co.jjs.java_seminar.exercise_20140513_06;

public class Exercise8_1 {

    public static void main(String[] args) {
        String element = "水";
        switch (element) {
        case "月":
            System.out.println("今日は月曜日です。週の始まりです");
            break;
        case "火":
            System.out.println("今日は火曜日です。まだまだ仕事は続きます");
            break;
        case "水":
            System.out.println("今日は水曜日です。週の真ん中です気持ちを入れなおします");
            break;
        case "木":
            System.out.println("今日は木曜日です。一番つらいですが頑張ります");
            break;
        case "金":
            System.out.println("今日は金曜日です。明日から休みです頑張ります");
            break;
        case "土":
            System.out.println("今日は土曜日です。休みです仕事のことは忘れます");
            break;
        case "日":
            System.out.println("今日は日曜日です。明日のことは考えないです");
            break;
        }
    }
}
