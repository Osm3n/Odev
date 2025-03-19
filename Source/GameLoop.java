package Source;

import java.util.ArrayList;

import Source.Zombies.ParentZombie;

public class GameLoop {
    int wave = 1;

    public GameLoop(GamePanel panel) {

    }

    public ArrayList<ParentZombie> addZombies() {
        ArrayList<ParentZombie> zombies = new ArrayList<>();
        for (int j = 0; j < wave; j++) {
            zombies.add(new ParentZombie(0, 0.0, 0, 20, 20));
        }

        return zombies;
    }
}
