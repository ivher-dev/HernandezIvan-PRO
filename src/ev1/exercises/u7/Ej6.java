package ev1.exercises.u7;

import java.util.HashMap;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        HashMap<String, Integer> notas = new HashMap<String, Integer>();
        String[] keys = {"Ana", "Pedro", "Antonio", "Amparo", "Luis", "María"};
        for (String string : keys) {
            System.out.print("Introduce la nota de " + string + ": ");
            notas.put(string, reader.nextInt());
        }
        System.out.println("\nNotas:");
        for (String string : keys) {
            System.out.println(string + " - " + notas.get(string));
        }
        reader.close();
    }
}