package ev2;

public class Ship {
    boolean sunk = false;
    int length;
    Position[] locations;

    public Ship(int length) {
        this.length = length;
        this.locations = new Position[length];
        this.sunk = false;
    }

    boolean isSunk() {
        int hit = 0;
        for (int i = 0; i < locations.length; i++) {
            if (locations[i].hit) {
                hit++;
            }
        }
        if (hit == locations.length) {
            return true;
        }
        return false;
    }
}