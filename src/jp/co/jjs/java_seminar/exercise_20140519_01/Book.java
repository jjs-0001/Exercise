package jp.co.jjs.java_seminar.exercise_20140519_01;

public class Book {

    String id; // 本のID
    String title; // 本のタイトル
    String writer; // 本の著者
    String publisher; // 本の出版社
    String price; // 本の値段

    public Book(String title, String id, String writer, String publisher,
            String price) {
        this.id = id;
        this.title = title;
        this.writer = writer;
        this.publisher = publisher;
        this.price = price;
    }

    @Override
    public String toString() {
        return ">>>>>Book [id=" + id + ", title=" + title + ", writer=" + writer
                + ", publisher=" + publisher + ", price=" + price + "]";
    }


}