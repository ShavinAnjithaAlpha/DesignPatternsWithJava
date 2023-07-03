package creationalPatterns.Factory;

import java.security.SecureRandom;

public class RandomGameObjectFactory implements GameObjectFactory {

    private static final SecureRandom random = new SecureRandom();

    @Override
    public GameObject getObject(int n) {
//        // game logic
        if (n < 0) return new Asteroid(random.nextInt(), random.nextInt());
        else return new AlienShip(random.nextInt(), random.nextInt(), random.nextInt(n));

    }

}
