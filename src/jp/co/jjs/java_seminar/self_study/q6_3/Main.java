package jp.co.jjs.java_seminar.self_study.q6_3;

public class Main {

    public static void main(String[] args) {
        Bond[] bond = new Bond[6];

        bond[0] = new Bond();
        bond[1] = new Bond();
        bond[2] = new Bond();
        bond[3] = new ConvertibleBond();
        bond[4] = new ConvertibleBond();
        bond[5] = new ConvertibleBond();

        for(int i = 0; i < 6; i++){
            bond[i].display();
        }
    }
}
