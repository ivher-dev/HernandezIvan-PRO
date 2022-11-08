package ev1.exercises.u7;

import java.util.Scanner;

public class Ej2c {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Introduce el tamaño del array: ");
        int[] array = new int[reader.nextInt()];

        initializeArray(array);

        printArray(array);
    }
    public static void initializeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el elemento " + i + ": ");
            array[i] = reader.nextInt();
        }
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento " + i + ": " + array[i]);
        }
    }
}
