package creationalPatterns.Builder;

public class DoubleFloorHouseBuilder implements HouseBuilder {

    private House house = null;
    private String color;

    public DoubleFloorHouseBuilder(String color) {
        this.house = new House(0, 0, 0, null, null);
        this.color = color;
    }

    @Override
    public HouseBuilder setUpRooms() {
        house.setNoRooms(10);
        return this;
    }

    @Override
    public HouseBuilder setUpDoors() {
        house.setNoDoors(15);
        return this;
    }

    @Override
    public HouseBuilder setUpFloors() {
        house.setNoFloors(2);
        return this;
    }

    @Override
    public HouseBuilder setUpRoofType() {
        house.setRoofType("TriAngle");
        return this;
    }

    @Override
    public HouseBuilder setUpWallColor() {
        house.setWallColor(color);
        return this;
    }

    @Override
    public House buildHouse() {
        return house;
    }
}
