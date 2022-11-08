package ev1.exercises.u7;

import java.util.HashMap;
import java.util.Scanner;

public class Ej5c {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<String, Integer> alumnosSuspendidos = new HashMap<String, Integer>();
        HashMap<String, Integer> alumnosAprobados = new HashMap<String, Integer>();
        String name;
        int value;
        while (showMenu() != 2){
            System.out.print("Introduce el nombre del alumno: ");
            name = reader.nextLine();
            System.out.print("Introduce la nota del alumno: ");
            value = reader.nextInt();
            reader.nextLine();
            if (value < 5) {
                System.out.println("El alumno " + name + " ha suspendido con un " + value + "\n");
                alumnosSuspendidos.put(name, value);
            } else {
                System.out.println("El alumno " + name + " ha aprobado con un " + value + "\n");
                alumnosAprobados.put(name, value);
            }
        }
        System.out.println("Alumnos suspendidos:");
        for (String key : alumnosSuspendidos.keySet()) {
            System.out.println(key + " - " + alumnosSuspendidos.get(key));
        }
        System.out.println("\nAlumnos aprobados:");
        for (String key : alumnosAprobados.keySet()) {
            System.out.println(key + " - " + alumnosAprobados.get(key));
        }
    }
    public static int showMenu(){
        int option;
        System.out.println("1. Añadir alumno");
        System.out.println("2. Salir");
        System.out.print("Introduce una opcion: ");
        option = reader.nextInt();
        reader.nextLine();
        System.out.println();
        if ((option == 1 || option == 2)) {
            return option;
        }
        System.out.println("Opcion no valida\n");
        return showMenu();
    }
}