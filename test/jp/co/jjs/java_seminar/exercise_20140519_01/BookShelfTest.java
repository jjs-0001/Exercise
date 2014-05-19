package jp.co.jjs.java_seminar.exercise_20140519_01;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class BookShelfTest {

    @Test
    public void 全て表示されること() {
        BookShelf get = new BookShelf();
        get.book[0].title = "aaaa";
        get.book[0].id = "aaaa";
        get.book[0].writer = "aaaa";
        get.book[0].publisher = "aaaa";
        get.book[0].price = "aaaa";
        Book[] actual = get.getAll();
        assertThat(actual.length, is(1));
    }

}
