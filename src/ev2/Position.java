package ev2;

public class Position {
    int[] coords;
    boolean hit = false;

    public Position(int[] position) {
        this.coords = position;
        this.hit = false;
    }
}