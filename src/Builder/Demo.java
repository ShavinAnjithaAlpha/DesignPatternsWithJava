package Builder;

public class Demo {

    public static void main(String[] args) {
//        House house1 = new House(1, 2, 3, "Flat", "Blue");

        Director director = new Director();
        HouseBuilder onefloorBuilder = new SingleFloorHouseBuilder("Blue");

        House house2 = director.construct(onefloorBuilder);
        House house3 = director.construct(onefloorBuilder);
        House house4 = director.construct(onefloorBuilder);
        House house5 = director.construct(onefloorBuilder);

        System.out.println(house2);

        HouseBuilder doubleFloorBuilder = new DoubleFloorHouseBuilder("Orange");
        House house6 = director.construct(doubleFloorBuilder);

        System.out.println();
        System.out.println(house6);


    }
}
