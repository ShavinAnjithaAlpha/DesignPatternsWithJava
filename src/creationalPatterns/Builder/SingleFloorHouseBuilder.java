package creationalPatterns.Builder;

public class SingleFloorHouseBuilder implements HouseBuilder {

    private House house = null;
    private final String color;

    public SingleFloorHouseBuilder(String color) {
        this.house = new House(0, 0, 0, null, null);
        this.color = color;
    }

    @Override
    public HouseBuilder setUpRooms() {
        house.setNoRooms(5);
        return this;
    }

    @Override
    public HouseBuilder setUpDoors() {
        house.setNoDoors(7);
        return this;
    }

    @Override
    public HouseBuilder setUpFloors() {
        house.setNoFloors(1);
        return this;
    }

    @Override
    public HouseBuilder setUpRoofType() {
        house.setRoofType("Flat");
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
