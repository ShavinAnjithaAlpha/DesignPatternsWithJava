package creationalPatterns.prototype;

public abstract class Soldier implements Cloneable {

    public String type;
    public int healthScore, performanceScore;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Soldier clone() throws CloneNotSupportedException {
        return (Soldier) super.clone();
    }

    @Override
    public String toString() {
        return String.format("Type: %s%nHealth: %d%nPerformance: %d%n", type, healthScore, performanceScore);
    }
}
