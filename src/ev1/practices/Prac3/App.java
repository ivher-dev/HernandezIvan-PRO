package ev1.practices.Prac3;

import java.util.Random;
import java.util.Scanner;

public class App {
    static int shipAmount;
    static int[][] game; // 0 = Default, 1 = Ship, 2 = Missed, 3 = Hit
    static int shipsRemaining;
    static Scanner reader = new Scanner(System.in);
    static int shotsRemaining;
    static int shotAmount;

    public static void main(String[] args) throws Exception {
        System.out.println("#############################################");
        System.out.println("######## WELCOMOME TO SEAK THE FLOAT ########");
        System.out.println("#############################################\n");
        createBoard(requestParameters());
        System.out.println();
        showShipsRemaining();
        showShotsRemaining();
        System.out.println();
        while (shipsRemaining > 0 && shotsRemaining > 0) {
            showBoard();
            System.out.println();
            shoot();
            System.out.println();
            showShipsRemaining();
            showShotsRemaining();
            System.out.println();
        }
        if (shipsRemaining == 0) {
            System.out.println("You sunk the whole float!");
        } else {
            System.out.println("You lost all your shots!");
        }
    }

    static void showShipsRemaining() {
        System.out.print("Sunk ships: " + (shipAmount - shipsRemaining) + "/" + shipAmount + " [");
        for (var i = 1; i <= (shipAmount); i++) {
            if (i > (shipAmount - shipsRemaining)) {
                System.out.print("·");
            } else {
                System.out.print("#");
            }
        }
        System.out.println("]");
    }

    static void showShotsRemaining() {
        System.out.print("Shots remaining: " + shotsRemaining + "/" + shotAmount + " [");
        for (var i = 1; i <= (shotAmount); i++) {
            if (i > shotsRemaining) {
                System.out.print("·");
            } else {
                System.out.print("#");
            }
        }
        System.out.println("]");
    }

    static int[] requestParameters() {
        int[] parameters = new int[4]; // [0] Height, [1] Width, [2] Ship amount, [3] Difficulty
        do {
            System.out.print("Enter the board width: ");
            parameters[0] = reader.nextInt();
            if (parameters[0] <= 0) {
                System.out.println(ConsoleColors.RED + "Error: " + ConsoleColors.RESET + "Width out of range");
            }
        } while (parameters[0] <= 0);
        do {
            System.out.print("Enter board height: ");
            parameters[1] = reader.nextInt();
            if (parameters[1] <= 0) {
                System.out.println(ConsoleColors.RED + "Error: " + ConsoleColors.RESET + "Height out of range");
            }
        } while (parameters[1] <= 0);
        do {
            System.out.print("Introduce ship amount [1-" + (parameters[0] * parameters[1]) + "]: ");
            parameters[2] = reader.nextInt();
            if (parameters[2] == 0 || parameters[2] > (parameters[0] * parameters[1])) {
                System.out.println(ConsoleColors.RED + "Error: " + ConsoleColors.RESET + "Amount out of range [1-"
                        + (parameters[0] * parameters[1]) + "]");
            }
        } while (parameters[2] == 0 || parameters[2] > (parameters[0] * parameters[1]));
        do {
            System.out.print("Introduce difficulty [0-3]: ");
            parameters[3] = reader.nextInt();
            if (parameters[3] < 0 || parameters[3] > 3) {
                System.out
                        .println(ConsoleColors.RED + "Error: " + ConsoleColors.RESET + "Difficulty out of range [0-3]");
            }
        } while (parameters[3] < 0 || parameters[3] > 3);
        System.out.println();
        return parameters;
    }

    static void createBoard(int[] parameters) {
        Random random = new Random();
        int posX, posY;
        game = new int[parameters[1]][parameters[0]];
        shipsRemaining = parameters[2];
        shipAmount = parameters[2];
        int i = 0;
        switch (parameters[3]) {
            case 0:
                shotsRemaining = parameters[0] * parameters[1];
                break;
            case 1:
                shotsRemaining = parameters[2] * 3;
                break;
            case 2:
                shotsRemaining = parameters[2] * 2;
                break;
            case 3:
                shotsRemaining = parameters[2] * 1;
                break;
        }
        if (shotsRemaining > (parameters[0] * parameters[1])) {
            shotsRemaining = parameters[0] * parameters[1];
        }
        shotAmount = shotsRemaining;
        while (i < parameters[2]) {
            posX = random.nextInt(0, parameters[0]);
            posY = random.nextInt(0, parameters[1]);
            if (game[posY][posX] == 0) {
                game[posY][posX] = 1;
                i++;
            }
        }
    }

    static void showBoard() {
        for (var i = 0; i < game.length; i++) {
            // Draw upper line
            if (i == 0) {
                System.out.print("    ");
                for (var j = 0; j < game[i].length; j++) {
                    System.out.print(j + " ");
                }
                System.out.println("x");
                System.out.print("   ");
                for (var j = 0; j < game[i].length * 2; j++) {
                    System.out.print("-");
                }
                System.out.println();
            }
            for (var j = 0; j < game[i].length; j++) {
                // Draw left side line
                if (j == 0) {
                    System.out.print(i + " | ");
                }
                // Draw content
                switch (game[i][j]) {
                    case 0:
                    case 1:
                        System.out.print("· ");
                        break;
                    case 2:
                        System.out.print(ConsoleColors.BLUE + "O " + ConsoleColors.RESET);
                        break;
                    case 3:
                        System.out.print("X ");
                        break;
                }
            }
            System.out.println();
        }
        System.out.println("y");
    }

    static void shoot() {
        int posX, posY;
        do {
            System.out.print("Enter the X coordinate of the shot: ");
            posX = reader.nextInt();
            if (posX >= game[0].length || posX < 0) {
                System.out.println(ConsoleColors.RED + "Error: " + ConsoleColors.RESET + "Coordinate out of range");
            }
        } while (posX >= game[0].length || posX < 0);

        do {
            System.out.print("Enter the Y coordinate of the shot: ");
            posY = reader.nextInt();
            if (posY >= game.length || posY < 0) {
                System.out.println(ConsoleColors.RED + "Error: " + ConsoleColors.RESET + "Coordinate out of range");
            }
        } while (posY >= game.length || posY < 0);
        shotsRemaining--;
        switch (game[posY][posX]) {
            case 0:
                System.out.println("\nYou shot into the water.");
                game[posY][posX] = 2;
                break;
            case 1:
                System.out.println("\nYou sunk a ship.");
                game[posY][posX] = 3;
                shipsRemaining--;
                break;
            case 2:
            case 3:
                System.out.println("\nYou have shot here before.");
                break;
        }
    }
}