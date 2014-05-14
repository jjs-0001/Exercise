package jp.co.jjs.java_seminar.exercise_20140514_03;

public class Book {

    int id; //本のID
    String title; //本のタイトル
    String writer; //本の著者
    String publisher; //本の出版社
    int price; //本の値段

    public Book(int id, String title, String writer, String publisher, int price){
        this.id = id;
        this.title = title;
        this.writer = writer;
        this.publisher = publisher;
        this.price = price;
    }

}
