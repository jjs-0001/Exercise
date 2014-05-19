package jp.co.jjs.java_seminar.exercise_20140519_01;

import java.util.ArrayList;

public class BookShelf {

    ArrayList<Book> booklist = new ArrayList<>(); // 本棚の本の情報
    String info; // 本棚の種類
    int height; // 本棚の高さ
    int large; // 本棚の幅

    public void bookinsert(Book b) {
        booklist.add(b);
    }

    public ArrayList<Book> getAll(){
        return booklist;
    }

}
