package ev1.practices.Prac3;

public class App {
    public static void main(String[] args) {
        final int SHIP_AMOUNT = 3;
        final int BOARD_SIZE = 8;
        final int MAX_SHOOTS = SHIP_AMOUNT * 2;

        Board board = new Board(SHIP_AMOUNT, BOARD_SIZE);
        board.initialize(board);
        board.fill(board);
        showWelcome();
        for (int i = 0; i < MAX_SHOOTS; i++) {
            board.show(board);
        }
    }

    static void showWelcome(){
        System.out.println("-------------------------------");
        System.out.println("Welcome to the Battleship game!");
        System.out.println("-------------------------------\n");
    }
}
