import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[5]; //5-размерность м
        for (int i = 0; i < 5; i++) {
            arr[i] = i * 2;
            System.out.println(arr[i]);
        }

        int[] [] arr = new int[5][5]; //5-размерность м
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                arr [i][j] = i * j;
            System.out.println(arr[i][j] + " ");
        }
        System.out.println(" ");
    }
    }
