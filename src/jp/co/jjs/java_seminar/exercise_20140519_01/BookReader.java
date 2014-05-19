package jp.co.jjs.java_seminar.exercise_20140519_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class BookReader {

    ArrayList<String> spl = new ArrayList<>();
    String[] info = new String[5];

    public ArrayList<String> reader(){
        try(BufferedReader reader = Files.newBufferedReader(
                Paths.get("Book.csv"),
                Charset.forName("SHIFT-JIS"))){

            String line = null;

            while((line = reader.readLine()) != null){
                spl.add(line);
            }


        }catch(IOException e){
            e.printStackTrace();
        }
        return spl;
    }
}
