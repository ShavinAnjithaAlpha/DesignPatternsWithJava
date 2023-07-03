package creationalPatterns.Factory;

public class Asteroid implements GameObject {

    private final int x;
    private final int y;

    public Asteroid(int x, int y) {
        this.x = x;
        this.y = y;
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
        return "Asteroid{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
