package ev1.exercises.u7;

import java.util.Scanner;

public class Ej2b {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Introduce el tamaño del array: ");
        int[] array = new int[reader.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el elemento " + i + ": ");
            array[i] = reader.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento " + i + ": " + array[i]);
        }
        reader.close();
    }
}
