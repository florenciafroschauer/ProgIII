package tp4;

/**
 * @author Agustin Augurusa
 */
public class Coordinate {
    private int x;
    private int y;

    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean equals(Coordinate coordinate){
        return y == coordinate.getY() &&
                x == coordinate.getX();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
