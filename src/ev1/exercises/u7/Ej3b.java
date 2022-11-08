package ev1.exercises.u7;

public class Ej3b {
    public static void main(String[] args) {
        boolean[][] matrix1 = {
            {true, true, true, true, true},
            {true, false, false, false, true},
            {true, false, false, false, true},
            {true, false, false, false, true},
            {true, false, false, false, true},
            {true, false, false, false, true},
            {true, false, false, false, true},
            {true, true, true, true, true}
        };
        boolean[][] matrix2 = {
            {false, false, false, false, true},
            {false, false, false, true, true},
            {false, false,  true, false, true},
            {false, true, false, false, true},
            {true, false, false, false, true},
            {false, false, false, false, true},
            {false, false, false, false, true},
            {false, false, false, false, true}
        };
        showMatrix(matrix1);
        System.out.println();
        showMatrix(matrix2);
    }

    public static void showMatrix(boolean[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] ? "0" : " ");
            }
            System.out.println();
        }
    }
}
