package Builder;

public class Director {

    private HouseBuilder builder;

    House construct(HouseBuilder builder) {
        return builder.setUpFloors()
                .setUpDoors()
                .setUpRooms()
                .setUpRoofType()
                .setUpWallColor().buildHouse();
    }
}
