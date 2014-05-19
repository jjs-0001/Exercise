package jp.co.jjs.java_seminar.exercise_20140519_01;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> info = new ArrayList<>();
        String[] add = new String[5];

        BookShelf tana = new BookShelf();
        info = BookReader.reader();
        for (String spl : info) {
            add = spl.split(",", 5);
            Book book = new Book(add[0], add[1], add[2], add[3], add[4]);
            tana.bookinsert(book);
        }

        System.out.println(tana.booklist);

        BookWriter.writer(tana.booklist);


    }

}
