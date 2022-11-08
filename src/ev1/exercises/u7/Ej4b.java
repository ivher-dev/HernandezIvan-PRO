package ev1.exercises.u7;

import java.util.HashSet;
import java.util.Scanner;

public class Ej4b {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        Scanner reader = new Scanner(System.in);
        int number;

        while (true){
            System.out.print("Introduce un numero: ");
            number = reader.nextInt();
            if (number == 0) {
                break;
            }
            set.add(number);
        }

        for (int i : set) {
            System.out.print(i + " ");
        }

        reader.close();
    }
}
