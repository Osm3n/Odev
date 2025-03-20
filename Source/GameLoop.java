package Source;

import java.util.ArrayList;

import Source.Zombies.ParentZombie;

public class GameLoop implements Runnable {
    int wave = 1;
    GamePanel panel;

    public GameLoop(GamePanel panel) {
        this.panel = panel;

    }

    public ArrayList<ParentZombie> addZombies() {
        ArrayList<ParentZombie> zombies = new ArrayList<>();
        for (int j = 0; j < wave; j++) {
            zombies.add(new ParentZombie(0, 0.0, 0, 20, 20));
        }

        return zombies;
    }

    @Override
    public void run() {

    }
}
