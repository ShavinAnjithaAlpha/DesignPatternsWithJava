package creationalPatterns.Builder;

public interface HouseBuilder {

    HouseBuilder setUpRooms();

    HouseBuilder setUpDoors();

    HouseBuilder setUpFloors();

    HouseBuilder setUpRoofType();

    HouseBuilder setUpWallColor();

    // get the house
    House buildHouse();

}
