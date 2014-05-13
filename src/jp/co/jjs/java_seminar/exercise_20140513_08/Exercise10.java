package jp.co.jjs.java_seminar.exercise_20140513_08;

public class Exercise10 {

    public static void main(String[] args) {
        int i;
        for(i = 1; i <= 30; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("fizzbuzz");
            }else if(i % 3 == 0){
                System.out.println("fizz");
            }else if(i % 5 == 0){
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
