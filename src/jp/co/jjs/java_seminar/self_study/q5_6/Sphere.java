package jp.co.jjs.java_seminar.self_study.q5_6;

public class Sphere {

    double line;
    double x;
    double y;
    double z;

    public Sphere() {
        this.line = 1;
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Sphere(double line){
        this.line = line;
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Sphere(double line, double x, double y, double z) {
        this.line = line;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void move(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void scale(double line){
        this.line = line;
    }
}
