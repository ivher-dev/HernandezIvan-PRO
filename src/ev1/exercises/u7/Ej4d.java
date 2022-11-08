package ev1.exercises.u7;

import java.util.HashSet;
import java.util.Scanner;

public class Ej4d {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> pares = new HashSet<Integer>();
        HashSet<Integer> impares = new HashSet<Integer>();
        Scanner reader = new Scanner(System.in);
        int number;

        while (true){
            System.out.print("Introduce un numero: ");
            number = reader.nextInt();
            if (number == 0) {
                break;
            }
            if (!set.add(number)) {
                System.out.println("El numero " + number + " ya esta en el conjunto.");
            }
        }

        for (int i : set) {
            if (i % 2 == 0) {
                pares.add(i);
            } else {
                impares.add(i);
            }
        }

        System.out.println("Pares:");
        for (int i : pares) {
            System.out.print(i + " ");
        }
        System.out.println("\nImpares:");
        for (int i : impares) {
            System.out.print(i + " ");
        }

        reader.close();
    }
}
