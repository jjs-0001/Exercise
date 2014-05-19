package jp.co.jjs.java_seminar.exercise_20140519_01;

public class BookShelf {

    Book[] book = new Book[100]; //本棚の本の情報
    String info; //本棚の種類
    int height; //本棚の高さ
    int large; //本棚の幅

    public void bookinsert(Book b){
        for(int i = 0; i < 100; i++){
            if(book[i] == null){
                book[i] = b;
                break;
            }
        }
    }

    public Book bookoutsert(Book b){
        for(int i = 0; i < 100; i++){
            if(book[i] == b){
                return b;
            }
        }
        return null;
    }

}
