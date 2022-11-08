package ev1.practices.Prac3;

import java.util.Random;

public class Board {
    int shipAmount;
    Position[][] positions;

    Board(int shipAmount, int boardSize) {
        this.shipAmount = shipAmount;
        this.positions = new Position[boardSize][boardSize];
    }

    void initialize(Board board){
        for (int i = 0; i < board.positions.length; i++) {
            for (int j = 0; j < board.positions.length; j++) {
                board.positions[i][j] = new Position(false, false);
            }
        }
    }

    void fill(Board board){
        int randomY, randomX;
        Random random = new Random();
        for (int i = 0; i < board.shipAmount; i++) {
            do {
                randomY = random.nextInt(board.positions.length);
                randomX = random.nextInt(board.positions.length);
            } while (board.positions[randomY][randomX].hasBoat);
            board.positions[randomY][randomX].hasBoat = true;
        }
    }

    void show(Board board){
        for (var i = 0; i < board.positions.length; i++){
            // Draw upper line
            if (i == 0){
                System.out.print("    ");
                for (var j = 0; j < board.positions[i].length; j++){
                    System.out.print(j + " ");
                }
                System.out.println("x");
                System.out.print("   ");
                for (var j = 0; j < board.positions[i].length*2; j++){
                    System.out.print("-");
                }
                System.out.println();
            }
            for (var j = 0; j < board.positions[i].length; j++){
                // Draw left side line
                if (j == 0){
                    System.out.print(i + " | ");
                }
                // Draw content
                if (board.positions[i][j].isVisible){
                    if (board.positions[i][j].hasBoat){
                        System.out.print("X ");
                    } else {
                        System.out.print(ConsoleColors.BLUE + "X " + ConsoleColors.RESET);
                    }
                } else {
                    System.out.print("· ");
                }                
            }
            System.out.println();
        }
        System.out.println("y\n");
    }
}
