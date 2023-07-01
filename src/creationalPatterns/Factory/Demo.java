package creationalPatterns.Factory;

public class Demo {

    public static void main(String[] args) {
        // create a random game objects factory
        GameObjectFactory randomFactory = new RandomGameObjectFactory();
        GameObject obj1 = randomFactory.getObject(1);
        GameObject obj2 = randomFactory.getObject(-2);

        System.out.println(obj1);
        System.out.println(obj2);

        GameObjectFactory alienGameObjectFactory = new AlienGameObjectFactory();
        GameObject obj3 = alienGameObjectFactory.getObject(4);
        GameObject obj4 = alienGameObjectFactory.getObject(8);

        System.out.println();
        System.out.println(obj3);
        System.out.println(obj4);

        GameObjectFactory factory = new ModerateFactory();
        GameObject object = factory.getObject(4);


    }
}
