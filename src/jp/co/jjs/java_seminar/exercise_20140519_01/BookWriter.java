package jp.co.jjs.java_seminar.exercise_20140519_01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class BookWriter {

    public static void writer(ArrayList<Book> booke) {

        try (BufferedWriter writer = Files.newBufferedWriter(
                Paths.get("Book1.csv"), Charset.forName("UTF-8"),
                StandardOpenOption.APPEND)) {
            for (Book books : booke) {
                if (books != null) {
                    writer.write(books.title + "," + books.id + ","
                            + books.writer + "," + books.publisher + ","
                            + books.price);
                    writer.newLine();
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
