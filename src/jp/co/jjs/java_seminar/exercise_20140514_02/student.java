package jp.co.jjs.java_seminar.exercise_20140514_02;

public class Student {

    //属性
    int id; //学生番号
    String name; //学生の名前
    int age; //学生の年齢
    int grade; //学生の学年
    String from; //学生の出身
    int answer; //何問解いたか

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void answerplus(){
        this.answer++;
    }

    public String report(){
        String str = Integer.toString(this.answer);
        return str;
    }
}