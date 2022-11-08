package ev1.exercises.u7;

import java.util.HashMap;
import java.util.Scanner;

public class Ej5b {
    public static void main(String[] args) {
        HashMap<String, Integer> alumnosSuspendidos = new HashMap<String, Integer>();
        HashMap<String, Integer> alumnosAprobados = new HashMap<String, Integer>();
        Scanner reader = new Scanner(System.in);
        String[] keys = {"Ana", "Pedro", "Antonio", "Amparo", "Luis", "María"};
        int value;
        for (String string : keys) {
            System.out.println("Introduce la nota de " + string);
            value = reader.nextInt();
            if (value < 5) {
                System.out.println("El alumno " + string + " ha suspendido con un " + value);
                alumnosSuspendidos.put(string, value);
            } else {
                System.out.println("El alumno " + string + " ha aprobado con un " + value);
                alumnosAprobados.put(string, value);
            }
        }
        reader.close();
    }
}