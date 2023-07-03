package creationalPatterns.Factory;

import java.security.SecureRandom;

public class AlienGameObjectFactory implements GameObjectFactory {

    private static final SecureRandom random = new SecureRandom();

    @Override
    public GameObject getObject(int n) {
        return new AlienShip(random.nextInt(), random.nextInt(), random.nextInt(n));
    }
}
