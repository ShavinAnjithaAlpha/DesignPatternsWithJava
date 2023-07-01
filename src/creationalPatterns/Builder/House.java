package creationalPatterns.Builder;

public class House {

    private int noDoors;
    private int noRooms;
    private int noFloors;
    private String roofType;
    private String wallColor;

    public House(int noDoors, int noRooms, int noFloors, String roofType, String wallColor) {
        this.noDoors = noDoors;
        this.noRooms = noRooms;
        this.noFloors = noFloors;
        this.roofType = roofType;
        this.wallColor = wallColor;
    }

    public int getNoDoors() {
        return noDoors;
    }

    public void setNoDoors(int noDoors) {
        this.noDoors = noDoors;
    }

    public int getNoRooms() {
        return noRooms;
    }

    public void setNoRooms(int noRooms) {
        this.noRooms = noRooms;
    }

    public int getNoFloors() {
        return noFloors;
    }

    public void setNoFloors(int noFloors) {
        this.noFloors = noFloors;
    }

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public String getWallColor() {
        return wallColor;
    }

    public void setWallColor(String wallColor) {
        this.wallColor = wallColor;
    }

    @Override
    public String toString() {
        return "House{" +
                "noDoors=" + noDoors +
                ", noRooms=" + noRooms +
                ", noFloors=" + noFloors +
                ", roofType='" + roofType + '\'' +
                ", wallColor='" + wallColor + '\'' +
                '}';
    }
}
