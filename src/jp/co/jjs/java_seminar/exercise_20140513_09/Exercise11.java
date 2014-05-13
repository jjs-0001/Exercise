package jp.co.jjs.java_seminar.exercise_20140513_09;

public class Exercise11 {

    public static void main(String[] args) {
        int n = 4300;
        int buy = 3000;
        int i = n - buy;
        int[] s = new int[10];
        int[] o = {10000, 5000, 2000, 1000, 500, 100, 50, 10, 5, 1};
        String[] e = {"10000", "5000", "2000", "1000", "500", "100", "50", "10", "5", "1"};

        for(int j = 0; j < 10; j++){
            s[j] = 0;
        }

        for(int k = 0 ; k < o.length; k++){
            while(i >= o[k]){
                i -= o[k];
                s[k]++;
            }
        }

        System.out.println("買い物をした金額："+ buy);
        System.out.println("支払った金額："+ n);
        for(int j = 0; j < 9; j++){
            System.out.println(e[j] + "円：" + s[j]);
        }

    }
}