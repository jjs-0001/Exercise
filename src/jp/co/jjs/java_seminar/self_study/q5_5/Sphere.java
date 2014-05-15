package jp.co.jjs.java_seminar.self_study.q5_5;

public class Sphere {

    double line;
    double x;
    double y;

    public Sphere() {
        this.line = 1;
        this.x = 0;
        this.y = 0;
    }

    public Sphere(double line){
        this.line = line;
        this.x = 0;
        this.y = 0;
    }

    public Sphere(double line, double x, double y) {
        this.line = line;
        this.x = x;
        this.y = y;
    }
}
