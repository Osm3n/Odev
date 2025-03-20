package Source;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import Source.Zombies.ParentZombie;

public class GamePanel extends JPanel {
    private Image backgroundImage;
    public boolean keyPressed = false;
    public static final int WIDTH = 600;
    public static final int HEIGHT = 400;
    private GameLoop loop;

    ArrayList<ParentZombie> zombies = new ArrayList<>();
    Player player;

    public GamePanel() {
        this.setSize(GamePanel.WIDTH, GamePanel.HEIGHT);
        // loop = new GameLoop(this);

        player = new Player("Player1", 100, GameFrame.WIDTH / 2, GameFrame.HEIGHT / 2);

        System.out.println(GameFrame.WIDTH);
        try {
            backgroundImage = ImageIO.read(new File(
                    "C:\\Users\\osman\\OneDrive\\Desktop\\OsmanKuru_241101005_Bil211_Ödev\\Source\\images\\backgroundImage.jpg"));
        } catch (Exception e) {
            System.out.println("unable to find file");
        }
        this.addKeyListener(new key());
        // zombies = loop.addZombies();
        this.repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, this);
        player.paint(g);
        for (ParentZombie zombie : zombies) {
            zombie.draw(g);
        }

    }

    class key implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            System.out.println("da");
        }

        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println("dsa");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("dsada");
        }

    }
}
