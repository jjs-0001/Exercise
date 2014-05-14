package jp.co.jjs.java_seminar.exercise_20140514_03;

public class Main {

    public static void main(String[] args) {
        Bookshelf tana = new Bookshelf();
        Book book = new Book(11, "aa", "bb", "cc", 400);
        Book book2 = new Book(22, "dd", "ee", "ff", 800);
        Book book3 = new Book(33, "gg", "hh", "ii", 1200);

        tana.bookinsert(book);
        tana.bookinsert(book2);
        tana.bookinsert(book3);

        System.out.println(tana.book[0].title);
        System.out.println(tana.book[1].title);
        System.out.println(tana.book[2].title);

        Book book4 = tana.bookoutsert(book);

        System.out.println(tana.book[0].title);
        System.out.println(tana.book[1].title);
        System.out.println(tana.book[2].title);
        System.out.println(book4.title);
    }
}
