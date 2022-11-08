package ev1.exercises.u7;

import java.util.Scanner;

public class Ej3c {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        boolean[][] matrix0 = {
            {true, true, true, true, true},
            {true, false, false, false, true},
            {true, false, false, false, true},
            {true, false, false, false, true},
            {true, false, false, false, true},
            {true, false, false, false, true},
            {true, false, false, false, true},
            {true, true, true, true, true}
        };
        boolean[][] matrix1 = {
            {false, false, false, false, true},
            {false, false, false, true, true},
            {false, false,  true, false, true},
            {false, true, false, false, true},
            {true, false, false, false, true},
            {false, false, false, false, true},
            {false, false, false, false, true},
            {false, false, false, false, true}
        };
        String num;
        System.out.print("Introduce un numero binario: ");
        num = reader.nextLine();
        char[] digits = num.toCharArray();
        for (char i : digits) {
            switch (i){
                case '0':
                    showMatrix(matrix0);
                    break;
                case '1':
                    showMatrix(matrix1);
                    break;
                default:
                    System.out.println("No se puede representar el bit");
                    break;
            }
        }
    }
    public static void showMatrix(boolean[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] ? "0" : " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}