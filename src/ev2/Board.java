package ev2;

public class Board {
    int height, width;
    Ship ships[];

    public Board(int height, int width, int boatsAmount) {
        this.height = height;
        this.width = width;
        this.ships = new Ship[boatsAmount];
    }
}