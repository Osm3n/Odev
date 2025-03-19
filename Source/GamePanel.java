package Source;

import java.awt.Graphics;
import java.awt.Image;

import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import Source.Zombies.ParentZombie;

public class GamePanel extends JPanel {
    private Image backgroundImage;
    private GameLoop loop;
    ArrayList<ParentZombie> zombies = new ArrayList<>();
    Player player;

    public GamePanel() {
        this.setSize(GameFrame.WIDTH, GameFrame.HEIGHT);
        loop = new GameLoop(this);
        player = new Player("Player1", 100, GameFrame.WIDTH / 2, GameFrame.HEIGHT / 2);
        zombies = loop.addZombies();

        System.out.println(GameFrame.WIDTH);
        try {
            backgroundImage = ImageIO.read(new File(
                    "C:\\Users\\osman\\OneDrive\\Desktop\\OsmanKuru_241101005_Bil211_Ödev\\Source\\images\\backgroundImage.jpg"));
        } catch (Exception e) {
            System.out.println("unable to find file");
        }
        this.repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, this);
        player.paint(g);
        for (ParentZombie zombie : zombies) {
            zombie.draw(g);
        }

        // Draw the background image.
        //
    }
}
