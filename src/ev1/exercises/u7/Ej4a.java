package ev1.exercises.u7;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ej4a {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        Scanner reader = new Scanner(System.in);
        int size;
        
        System.out.print("Introduce la cantidad de numeros a introducir: ");
        size = reader.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("Introduce un numero: ");
            set.add(reader.nextInt());
        }

        for (int i : set) {
            System.out.print(i + " ");
        }

        reader.close();
    }
}
