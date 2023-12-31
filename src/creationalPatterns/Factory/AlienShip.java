package creationalPatterns.Factory;

public class AlienShip implements GameObject {

    private final int x;
    private final int y;
    private final int level;

    public AlienShip(int x, int y, int level) {
        this.x = x;
        this.y = y;
        this.level = level;
    }

    @Override
    public void draw() {
        // game logic
    }

    @Override
    public void interact() {
        // game logic
    }

    @Override
    public void move() {
        // game logic
    }

    @Override
    public String toString() {
        return "AlienShip{" +
                "x=" + x +
                ", y=" + y +
                ", level=" + level +
                '}';
    }
}
