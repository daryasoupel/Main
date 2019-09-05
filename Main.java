import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] number ={1,2,3};
        int [][] matrice ={{1,2,3},
                           {4,5,6},
                           {7,8,9}};
        System.out.println(matrice[2][2]);
        System.out.println(matrice[1][0]);
        System.out.println();

        int [][] matrice1 ={{1,2,3},
                {4,5,6},
                {7,8,9}};
        for (int i=0; i<matrice1.length; i++){
            for(int j =0; j<matrice1[i].length;j++){
                System.out.print(matrice1[i][j]+" ");
            }
            System.out.println();
        }
        }
    }
