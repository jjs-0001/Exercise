package jp.co.jjs.java_seminar.self_study.q1_16;

public class Q1_16 {

    public static void main(String[] args) {
        float[][] flo = {{-56.7f}, {500.1f, 70.70f}, {100.9f, 0.5f, 20.20f}};

        System.out.println("配列の要素数：" +flo.length);
        System.out.println("第1次元：" + flo[0].length);
        System.out.println(flo[0][0]);
        System.out.println("第2次元：" +flo[1].length);
        System.out.println(flo[1][0]);
        System.out.println(flo[1][1]);
        System.out.println("第3次元：" +flo[2].length);
        System.out.println(flo[2][0]);
        System.out.println(flo[2][1]);
        System.out.println(flo[2][2]); //Q1_16_1

        int[][] m = {{1}, {2, 3}, {4, 5, 6}};

        System.out.println("配列の要素数：" + m.length);
        System.out.println("第1次元：" + m[0].length);
        System.out.println("第2次元：" + m[1].length);
        System.out.println("第3次元：" + m[2].length); //Q1_16_2

        byte[][][] byt = new byte[3][3][3];

        byte l = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 3; k++){
                    byt[i][j][k] = l;
                    l++;
                    System.out.println(byt[i][j][k]); //Q1_16_3
                }
            }
        }


    }
}
