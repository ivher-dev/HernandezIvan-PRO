package ev1.exercises.u7;

import java.util.HashMap;
import java.util.Scanner;

public class Ej5a {
    public static void main(String[] args) {
        HashMap<String, Integer> alumnos = new HashMap<String, Integer>();
        Scanner reader = new Scanner(System.in);
        String[] keys = {"Ana", "Pedro", "Antonio", "Amparo", "Luis", "María"};
        for (String string : keys) {
            System.out.println("Introduce la nota de " + string);
            alumnos.put(string, reader.nextInt());
        }
        reader.close();
    }
}