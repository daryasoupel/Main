import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int i = 10;
        while (i >- 0) {
            System.out.println(i);
            i -- 3;
        }
        //for (int i =8; i>=0; i -= 2) {
            //if (i == 6) continue;
            //System.out.println(i);
       // }

        for (int i =0; i<5; i++) {
            System.out.println(i);
        }

        for (int i =4; i<0; i--) {
            System.out.println(i);
        }

        for (int i =8; i>=0; i -= 2) {
            System.out.println(i);
            if (i == 6) break;
        }
    }
}