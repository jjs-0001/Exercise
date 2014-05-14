package jp.co.jjs.java_seminar.exercise_20140514_01;

public class Book {

    int id; //本のID
    String title; //本のタイトル
    String writer; //本の著者
    String publisher; //本の出版社
    boolean lend; //本の貸し出し状況

    public void out(){
        lend = false;
    }

    public void in(){
        lend = true;
    }

    public Book(String title) {
        // TODO 自動生成されたコンストラクター・スタブ
    }
}